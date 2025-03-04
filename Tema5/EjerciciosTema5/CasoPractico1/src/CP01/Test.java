package CP01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;

        System.out.println("\nCaso Práctico 1 - Tema 5\n");

        Scanner sc = new Scanner(System.in);

        //Instancias
        //El primer objeto obtendrá las anteriores variables pedidas por teclado,
        System.out.println("Para la persona 1: ");
        //Nombre
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        //Edad
        System.out.print("Edad: ");
        edad = sc.nextInt();
        sc.nextLine();  //Limpiar buffer de teclado
        //Sexo
        System.out.print("Sexo: ");
        sexo = sc.next().toUpperCase().charAt(0);
        //Peso
        System.out.print("Peso: ");
        peso = sc.nextDouble();
        //Altura
        System.out.print("Altura: ");
        altura = sc.nextDouble();
        Persona p1 = new Persona();
        p1.setNombre(nombre);
        p1.setEdad(edad);
        p1.setSexo(sexo);
        p1.setPeso(peso);
        p1.setAltura(altura);

        //El segundo objeto obtendrá todos los anteriores menos el peso y la altura
        System.out.println("\nPara la persona 2: ");
        Persona p2 = new Persona("Antonio", 26, 'H' );

        System.out.print("Peso: ");
        peso = sc.nextDouble();
        System.out.print("Introduce la altura: ");
        altura = sc.nextDouble();

        p2.setPeso(peso);
        p2.setAltura(altura);

        //El último objeto persona se creará utilizando el constructor sin parámetros,
        // para este último utiliza los métodos set para darle a los atributos un valor.
        Persona p3 = new Persona();
        p3.setNombre("Elena");
        p3.setEdad(25);
        p3.setSexo('M');
        p3.setPeso(60.00);
        p3.setAltura(160);

        sc.close();

        //Pruebas
        /*
         * Para cada objeto, deberá comprobar si está en su peso ideal,
         * si tiene sobrepeso o por debajo de su peso ideal con un mensaje.
         */
        System.out.println("\nIMC\n-----\nPara la persona 1: ");
        System.out.printf("IMC = %d\n", p1.calcularIMC());
        System.out.println("Para la persona 2: ");
        System.out.printf("IMC = %d\n", p2.calcularIMC());
        System.out.println("Para la persona 3: ");
        System.out.printf("IMC = %d\n", p3.calcularIMC());

        /*
         * Indicar para cada objeto si es mayor de edad.
        */
        System.out.println("\nEdad\n-----\nPara la persona 1: ");
        System.out.print(p1.esMayorDeEdad()
                ? p1.getNombre() + " es mayor de edad\n"
                : p1.getNombre() + " es menor de edad\n");
        System.out.println("Para la persona 2: ");
        System.out.print(p2.esMayorDeEdad()
                ? p2.getNombre() + " es mayor de edad\n"
                : p2.getNombre() + " es menor de edad\n");
        System.out.println("Para la persona 3: ");
        System.out.print(p3.esMayorDeEdad()
                ? p3.getNombre() + " es mayor de edad\n"
                : p3.getNombre() + " es menor de edad\n");

        /*
         * Por último, mostrar la información de cada objeto.
         */
        System.out.println("\nINFO\n-----");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
