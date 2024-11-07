package TipoBEjercicio2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        int num;
        int factorial=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nFactorial de un número.\n");

        //Comprobar que es positivo
        do {
            System.out.print("Escribe un número: ");
            num=sc.nextInt();
        } while (num<0);

        sc.close();

        System.out.printf("Factorial de %d =", num);
        for (int i = num; i >=1 ; i--) {
            if (i>1) {
                System.out.printf(" %d *", i);
            } else {
                System.out.printf(" %d", i);
            }
            factorial = factorial * i;
        }

        //Mensaje final
        System.out.printf(" = %d\n", factorial);

    }
}
