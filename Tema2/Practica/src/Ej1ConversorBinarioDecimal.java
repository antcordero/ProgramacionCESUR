import java.util.Scanner;

public class Ej1ConversorBinarioDecimal {
    /*
     * Conversor de números binarios a base 10:
     * Escribe un programa en Java que reciba un número binario "(introducido como una cadena de texto)"
     * y lo convierta a su equivalente en base 10.
     *
     * Utiliza un bucle para recorrer los dígitos del número binario
     * y realizar las operaciones necesarias para convertirlo.
     *
     */

    public static void main(String[] args) {

        String numBinario;
        int longitud;
        int numFinal=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDe un número binario: ");
        numBinario = sc.next();

        /* Sabiendo cuántos dígitos tiene el número binario,
         * ya se pueden hacer en orden inverso las potencias
         * recorriendo la cadena de texto de izquierda a derecha
         */
        longitud = numBinario.length();

        //Recorrer la cadena y ver si son 1 ó 0 y hacer la potencia

        for (int i = 0; i < longitud; i++) {
            //Coger el CARÁCTER de cada posición
            if (numBinario.charAt(i) == '1') {
                numFinal = (int) (numFinal + Math.pow(2,longitud-i-1));
            }
        }

        System.out.printf("El número %s en binario es %d en decimal\n", numBinario, numFinal);

        sc.close();
    }
}
