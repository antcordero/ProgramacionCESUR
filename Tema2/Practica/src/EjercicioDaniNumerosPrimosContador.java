import java.util.Scanner;

public class EjercicioDaniNumerosPrimosContador {
    public static void main(String[] args) {

        System.out.println("\nNúmeros Primos de 1 a 100");

        int divisores = 0;
        boolean esPrimo = true;

        for (int num = 2; num <= 100; num++) {
            esPrimo = true;

            //Comprobación esPrimo
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                }
            }

            //Si es primo -> imprimir y contar uno más
            if (esPrimo) {
                System.out.print(num + " ");
                divisores++;
            }
        }

        System.out.printf("\n\nTotal números primos entre 1 y 100 = %d\n", divisores);
    }
}

