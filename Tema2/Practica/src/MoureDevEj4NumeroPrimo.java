public class MoureDevEj4NumeroPrimo {
    /*
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */

    public static void main(String[] args) {

        int i;

        for (i=1 ; i<=30 ; i++) {
            // número primo -> n%1==0 y n%n==0 pero no no es n%x==0 entre cualquier otro número
            // Ejemplo, son primos 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29. Ejemplo hasta 30
            if ( (i%1==0) && (i%i==0) && (i%2!=0) && (i%3!=0) ) {
                System.out.println("->" + i);
            }
        }
    }
}
