public class MoureDevEj1FizzBuzz {
    /*
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */

    public static void main(String[] args) {

        int i;

        System.out.println("\nFizzBuzz");

        for(i = 1 ; i<= 100 ; i++) {

            if (i%3== 0 && i%5==0) {
                System.out.printf("%d -> fizzbuzz\n", i);
            } else if (i%3==0) {
                System.out.printf("%d -> fizz\n", i);
            } else if (i%5==0) {
                System.out.printf("%d -> buzz\n", i);
            } else {
                System.out.printf("%d\n", i);
            }

        }
    }
}
