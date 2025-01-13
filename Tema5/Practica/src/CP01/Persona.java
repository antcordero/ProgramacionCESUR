package CP01;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private Genero sexo;    //tipo enum
    private double peso;    //altura en kg
    public double altura;  //altura en m

    //Constructores
    //Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        generaDNI();
        this.sexo = Genero.H;
        this.peso = 0;
        this.altura = 0;
    }

    //Constructor solamente con nombre, edad, sexo
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        generaDNI();
        comprobarGenero(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    //Constructor completo
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generaDNI();
        comprobarGenero(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    //Getters - Setters
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

    public String getDni() {
        return dni;
    }

    public Genero getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        comprobarGenero(sexo);
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
        return "Persona{" +
                "nombre= '" + nombre + '\'' +
                ", edad= " + edad +
                ", dni= '" + generaDNI() + '\'' +
                ", sexo= " + sexo +
                ", peso= " + peso +
                ", altura= " + altura +
                '}';
    }

    //Métodos
    private void comprobarGenero(char sexo) {
        switch (sexo) {
            case 'M' -> this.sexo = Genero.M;
            case 'm' -> this.sexo = Genero.M;
            case 'H' -> this.sexo = Genero.H;
            case 'h' -> this.sexo = Genero.H;
            default -> this.sexo = Genero.H;
        }
    }

    /*
     *  Calcular IMC
     */
    public int calcularIMC() {
        int resultado = 0;
        double imc = this.peso/(Math.pow(this.altura, 2));
        if (imc<18.50) {
            resultado = -1;
        } else if (imc>=18.50 && imc<25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }

    /*
     *  esMayor de edad
     */
    public boolean esMayorDeEdad() {
        boolean esMayor = true;
        if (this.edad<18) {
            esMayor = false;
        }
        return esMayor;
    }

    /*
     *  Generar DNI
     */
    public String generaDNI() {
        String totalLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String dni;
        int numAleatorio;
        Random r = new Random();
        numAleatorio = r.nextInt(100000000);
        dni = "" + numAleatorio;

        //formar nº dni
        while (dni.length()<8) {
            dni = "0" + dni;
        }
        //Averiguar letra
        dni = dni + (totalLetras.charAt(numAleatorio%23));

        System.out.println("\nDNI= " + dni + "\n");

        return dni;
    }

    /*
     *  Mensaje del Peso
     */
    public void mensajePeso(Persona p){
        if (p.calcularIMC()==-1){
            System.out.println("La persona " + p.getNombre() + " tiene bajo peso");
        } else if (p.calcularIMC()==0) {
            System.out.println("La persona " + p.getNombre() + " tiene su peso ideal");
        } else {
            System.out.println("La persona " + p.getNombre() + " tiene sobrepeso");
        }
    }
}
