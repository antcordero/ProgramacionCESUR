public class MoureDevEj3SucesionDeFibonacci {
    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     */

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int suma = 0;
        int i;

        System.out.println("\nSerie de Fibonacci");

        for (i=0 ; i<=50 ; i++) {
            System.out.printf("%d, ", suma);
            a = b;
            b = suma;
            suma = a + b;
        }
    }
}
