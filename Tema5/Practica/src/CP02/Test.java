package CP02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 2 - Tema 5\n");

        int blancas;
        int negras;

        Scanner sc = new Scanner(System.in);

        /*
         *  Solicita al usuario la cantidad inicial de bolas blancas y negras.
         */

        System.out.print("Cuántas bolas blancas? ");
        blancas = sc.nextInt();
        System.out.print("Cuántas bolas negras? ");
        negras = sc.nextInt();

        sc.close();

        /*
         *  Creación de la urna
         */
        Urna miUrna = new Urna(blancas, negras);

        /*
         *  Bucle Principal:
         *
         *  1. Condición del bucle:
         *  Mientras haya más de una bola en la urna, el experimento continúa.
         *
         *  2. Extracción de bolas:
         *  Se extraen dos bolas consecutivas llamando al metodo bola() dos veces.
         *
         *  3. Comparación de colores:
         *  Si ambas bolas son del mismo color, se introduce una bola blanca.
         *  Si son de colores diferentes, se introduce una bola negra.
         *
         *  4. Impresión de resultados intermedios:
         *  Se muestran las cantidades actuales de bolas blancas y negras.
         */
        //'Prueba'-> String bola3;
        while (miUrna.totalBolas() > 1) {
            //'Prueba'-> bola3 = String.valueOf(miUrna.bola());
            ColorBola bola1 = miUrna.bola();
            ColorBola bola2 = miUrna.bola();

            if (bola1 == bola2 ) {
                miUrna.ponerBlanca();
            } else {
                miUrna.ponerNegra();
            }
            System.out.println(" - Total: Blancas: " + miUrna.blancas + ", Negras: " + miUrna.negras);
        }

        /*
         *  Resultado final
         */
        System.out.println("La bola es " + miUrna.bola());

    }
}
