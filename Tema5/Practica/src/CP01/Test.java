package CP01;

import java.util.Random;
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
        //El primer objeto obtendrá las anteriores variables pedidas por teclado
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
        sexo = sc.next().charAt(0);
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
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = Integer.parseInt(sc.nextLine());
        System.out.print("Sexo: ");
        sexo = sc.nextLine().charAt(0);
        System.out.print("Peso: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.print("Altura: ");
        altura = Double.parseDouble(sc.nextLine());

        //
        sc.close();

        //Setters para instancia de Persona, Persona 3: p3
        p3.setNombre(nombre);
        p3.setEdad(edad);
        p3.setPeso(peso);
        p3.setAltura(altura);
        p3.setSexo(sexo);

        /* Para cada objeto, deberá comprobar si está en su peso ideal,
         * tiene sobrepeso o por debajo de su peso ideal con un mensaje.
         */
        p1.mensajePeso(p1);
        p2.mensajePeso(p2);
        p3.mensajePeso(p3);

        /*
         *  Indicar para cada objeto si es mayor de edad.
         */
        //p1
        System.out.println(p1.getNombre() + " es " + (p1.esMayorDeEdad()?"mayor de edad":"menor de edad"));
        //p2
        System.out.println(p2.getNombre() + " es " + (p2.esMayorDeEdad()?"mayor de edad":"menor de edad"));
        //p3
        System.out.println(p3.getNombre() + " es " + (p3.esMayorDeEdad()?"mayor de edad":"menor de edad"));

        //Toda la info de cada uno
        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p3);

    }
}
