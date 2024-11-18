package CP02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int numPersona;
        String tipo;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nCaso Práctico 2\n");

        //Crear dos personas
        Persona p1 = new Persona("Toni", "Cordero", "621373845");
        Persona p2 = new Persona("Antonio", "Molina", "637256996");

        //Crear dos cuentas
        Cuenta c1 = new Cuenta("ES123456789", 25000.75, p1);
        Cuenta c2 = new Cuenta("ES987654321", 35000.85, p2);


        System.out.println(c1);
        System.out.println(c2);
        //Hacer ingreso y reintegro
        /*System.out.print("Elija la persona: ");
        numPersona=sc.nextInt();

        if (numPersona==1) {
            System.out.print("Para: " + p1);
            System.out.print("\nTipo de transacción (reintegro/ingreso): ");
            tipo=sc.next().toLowerCase();



        } else if (numPersona==2) {
            System.out.print("Para: " + p2.toString());
            System.out.print("\nTipo de transacción (reintegro/ingreso): ");
            tipo=sc.next().toLowerCase();



        }
*/



        sc.close();
    }
}
