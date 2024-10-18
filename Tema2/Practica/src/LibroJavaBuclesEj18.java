import java.util.Scanner;

public class LibroJavaBuclesEj18 {

    /*
    * Ejercicio 18
        Escribe un programa que obtenga los números enteros comprendidos entre dos
        números introducidos por teclado y validados como distintos, el programa debe
        empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
    */

    public static void main(String[] args) {

        int num1;
        int num2;

        int aux = 0;

        Scanner sc = new Scanner(System.in);

        //Dar números + comprobación que son distintos
        do {
            System.out.print("\nIndica un número: ");
            num1 = sc.nextInt();
            System.out.print("Indica un segundo número: ");
            num2 = sc.nextInt();
        } while (num1 == num2);

        //Comprobar el menor
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        //Comprobación
        //System.out.printf("num1= %d, num2= %d\n", num1, num2);

        //Bucle
        for (int i = num1; i <= num2; i+=7) {
            //Quitar coma del final
            if (i==num2) {
                System.out.printf("%d", i);
            } else {
                System.out.printf("%d, ", i);
            }
        }
        sc.close();
    }
}
