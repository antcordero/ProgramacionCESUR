import java.util.Scanner;

public class Ejercicio2 {
    /*
        * programa que lea un año introducido e indique si es bisiesto o no
            - si el año es divisible por 4 pero no por 100 es bisiesto
            - si el año es divisible por 100 y por 400 es bisiesto
    * */

    public static void main(String[] args) {

        int anio;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el año: ");
        anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }

        //Simplificación
        /*
        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0);

        if (bisiesto) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
         */

        sc.close();
    }
}
