    /*
     * Ejercicio 24
     * Escribe un programa que lea un número n e imprima una pirámide de números
     * con n filas como en la siguiente figura:
     *    1
     *   121
     *  12321
     * 1234321
     */

    import java.util.Scanner;

    public class LibroJavaBuclesEj24 {

    public static void main(String[] args) {

        int altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPirámide de números");
        do {
            System.out.print("Altura de la pirámide: ");
            altura = sc.nextInt();
        } while (altura<0);

        //For principal
        for (int i = 1; i<=altura ; i++) {
            //Pintar espacios
            for (int j = 0; j < altura-i; j++) {
                System.out.print(" ");
            }
            //Pintar números ascendente
            for (int k = 1; k<=i; k++) {
                //Pintar ascendente
                System.out.printf("%d", k);
            }
            //Pintar número descendente
            for (int l = i-1; l>0 ; l--) {
                System.out.printf("%d", l);
            }

            System.out.println("");
        }

        sc.close();
    }

}
