import java.util.Random;
import java.util.Scanner;

public class Pruebas {

    /*public static void main(String[] args) {
        int suma = 0;

        int numero = 50;
        System.out.print(numero);
        suma = suma +numero;

        for (numero = numero - 2; numero >= 20; numero = numero-2) {
            System.out.print("+"+numero);
            suma = suma + numero;
        }

        System.out.print("="+suma);
    }
    */

    /*
    public static void main(String[] args) {


        int i;
        int suma = 0;

        for (i=50  ; i>=20 ; i = i -2) {

            //Quitar "+" del final
            if (i>20){
                System.out.printf("%d + ", i);
            } else {
                System.out.printf("%d", i);
            }

            suma = suma + i;
        }
        System.out.printf("\nSuma %d", suma);
    }
    */
    /*
    public static void main(String[] args) {
        int tamaño = 8; // Tamaño del tablero (8x8)

        // Bucle para las filas
        for (int fila = 0; fila < tamaño; fila++) {
            // Bucle para las columnas
            for (int columna = 0; columna < tamaño; columna++) {
                // Alternar los colores del tablero
                if ((fila + columna)%2 == 0) {
                    System.out.print("□"); // Casilla blanca
                } else {
                    System.out.print("■"); // Casilla negra
                }
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
    */

    //  #####################################
    //  Ejercicio Número Primo - Solución Dani
    /*
    public static void main(String[] args) {
        System.out.println("Los números primos entre 1 y 100 son:");

        for (int numero = 1; numero <= 100; numero++) {
            boolean primo = true;

            // Aqui dices que si un numero es menor que 2 no es primo, porque ni 0 ni 1 lo son
            if (numero < 2) {
                primo = false;
            }

            //Pruebas la divisibilidad desde 2 hasta la mitad del número, porque si un numero tiene un divisor distinto de 1 y de si mismo,
            //el divisor ha de ser menor o igual a la mitad del numero

            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    primo = false; // Si se cumple, numero tiene un divisor diferente de 1 y de si mismo, es decir, no es primo.
                }
            }
            if (primo) {
                System.out.print(numero + " ");
            }
        }
    }
     */


    //  ########################################
    //  Ejercicio Número Primo - Solución Álvaro
    /*
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i))
                System.out.println(i);
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
    */

    public static void main(String[] args) {

        int n;
        boolean parar = true;
        char opcion;

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Número aleatorio entre 1 y 5");

        do {
            n=r.nextInt(5)+1;
            System.out.printf("-> %d\n", n);

            System.out.print("¿Siguiente número? (s/n): ");
            opcion = sc.next().charAt(0);
            if (opcion == 'n') {
                parar = false;
            } else if (opcion == 's') {
                parar = true;
            }

        } while (parar);

        sc.close();
    }

}
