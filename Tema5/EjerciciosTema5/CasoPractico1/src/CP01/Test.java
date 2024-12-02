package CP01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String nombre;
        int edad;
        Sexo sexo;
        double peso;
        double altura;

        System.out.println("\nCaso Práctico 1 - Tema 5\n");

        Scanner sc = new Scanner(System.in);

        //Instancias
        //El primer objeto obtendrá las anteriores variables pedidas por teclado,
        Persona p1 = new Persona();
        System.out.println("Para la persona 1: ");
        //Nombre
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        p1.setNombre(nombre);
        //Edad
        System.out.print("Edad: ");
        edad = sc.nextInt();
        p1.setEdad(edad);
        sc.nextLine();  //Limpiar buffer de teclado
        //Sexo
        System.out.print("Sexo: ");
        sexo = sc.next().toUpperCase().charAt(0);
        p1.setSexo(sexo);
        //Peso
        System.out.print("Peso: ");
        peso = sc.nextDouble();
        p1.setPeso(peso);
        //Altura
        System.out.print("Altura: ");
        altura = sc.nextDouble();
        p1.setAltura(altura);

        //El segundo objeto obtendrá todos los anteriores menos el peso y la altura
        Persona p2 = new Persona("Antonio", 26, 'H' );

        //El último objeto persona se creará utilizando el constructor sin parámetros,
        // para este último utiliza los métodos set para darle a los atributos un valor.
        Persona p3 = new Persona();
        p3.setNombre("Elena");
        p3.setEdad(25);
        p3.setSexo('M');
        p3.setPeso(60.00);
        p3.setAltura(160);

        sc.close();
    }
}
