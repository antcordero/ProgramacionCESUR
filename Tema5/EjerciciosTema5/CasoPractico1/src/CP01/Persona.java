package CP01;

import java.util.Random;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private Sexo sexo;
    private double peso;
    private double altura;

    //Constructores
    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    //
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.sexo = Sexo.H;
        this.DNI = generaDNI();
        this.peso = 50;
        this.altura = 1.50;
    }
    //
    public Persona(String nombre, int edad, char sexo) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.DNI = generaDNI();
        this.peso = 50;
        this.altura = 1.50;
    }

    //Getter - Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    */

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //toString
    @Override
    public String toString() {
        // Construir el contenido inicial de la representación de la persona
        String resultado = "Persona { " +
                "Nombre ='" + nombre +
                ", Edad =" + edad + (edad>=18?" -> Mayor de edad" : " -> Menor de edad") +
                ", DNI ='" + DNI +
                ", Sexo =" + sexo +
                ", Peso =" + peso +
                ", Altura =" + altura;

                // Calcular el IMC y añadir el mensaje
                int imc = calcularIMC();
                if (imc == 0) {
                    resultado += ", Está en el peso ideal";
                } else if (imc == -1) {
                    resultado += ", Está por debajo del peso ideal";
                } else {
                    resultado += ", Tiene sobrepeso";
                }

                // Cerrar la toString
                resultado += " }";
                return resultado;
    }


    //Métodos

    //Cálculo del IMC: (peso en kg/(altura^2 en m) - Ejemplo: 75,0/1,78
    public int calcularIMC() {
        double calculo = this.peso/(this.altura*this.altura);
        int resultado;

        if (calculo < 18.50) {
            resultado = -1;
        } else if (calculo>=18.5 && calculo<25) {
            resultado = 0;
        } else {
            resultado = 1;
        }

        return resultado;
    }

    //Mayor de edad
    public boolean esMayorDeEdad() {
        boolean resultado;

        if (this.edad>=18) {
            resultado = true;
        } else {
            resultado = false;
        }

        return resultado;
    }

    //Comprobar sexo
    public void comprobarSexo(char sexo) {
        if (sexo == 'M') {
            this.sexo=Sexo.M;
        } else {
            this.sexo=Sexo.H;
        }
    }

    //Generar DNI - 8 cifras
    public String generaDNI() {
        String[] secuencia = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String resultado = "";
        int aleatorio;
        int aux;

        //Generar número aleatorio de 8 cifras
        Random r = new Random();
        aleatorio = r.nextInt(100000000);;
        //Guardar int provisional para el cálculo
        aux = aleatorio;

        //Convertir a String
        while (aleatorio>0) {
            resultado = aleatorio%10 + resultado ;
            aleatorio/=10;
        }

        //Tener en cuenta si es menor de 8 cifras, poner ceros a la izquierda
        if (resultado.length()<8) {
            //"Sumar" 0 a la izquierda
            for (int i = resultado.length(); i < 8; i++) {
                resultado = "0" + resultado;
            }
        }

        //Generar letra
        // -> Resto de dividir el DNI entre 23. La letra será la posición de la letra en la secuencia:
        resultado = resultado + secuencia[(aux%23)];

        return resultado;
    }

}
