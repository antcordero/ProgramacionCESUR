import java.util.Scanner;

public class LibroJavaBuclesEj16 {

    /*
    * Ejercicio 16
        Escribe un programa que diga si un número introducido por teclado es o no
        primo. Un número primo es aquel que sólo es divisible entre él mismo y la
        unidad.
    * */

    public static void main(String[] args) {

        int num;
        int contDivisores=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese el numero: ");
        num = sc.nextInt();

        // Comprobar si un número es primo o no
        for (int i = 1; i <= num; i++) {
             if (num%i==0) {
                 contDivisores++;
             }
        }

        // Comprobar divisores
        if (contDivisores>2) {
            System.out.println("El numero " + num + " no es primo");
        } else {
            System.out.println("El numero " + num + " es primo");
        }

        sc.close();
    }
}
