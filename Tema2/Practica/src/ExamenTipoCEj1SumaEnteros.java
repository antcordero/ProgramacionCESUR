    /* 1. (1’5 puntos) Escribe un programa que calcule la suma de todos los números enteros
     * del 1 al n, donde n es un número ingresado por el usuario.
     * Ejemplo:
     * Escribe un número: 90
     * La suma de los números del 1 al 90 es: 4095
 */

    import java.util.Scanner;

    public class ExamenTipoCEj1SumaEnteros {
    public static void main(String[] args) {

        int num;
        int suma=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nEscribe un numero: ");
            num=sc.nextInt();
        } while (num<0);

        sc.close();

        //Suma de 1 a n
        for (int i=1; i<=num ; i++) {
            suma+=i;
        }

        System.out.printf("La suma de los números del 1 a %d es: %d\n", num, suma);
    }
}
