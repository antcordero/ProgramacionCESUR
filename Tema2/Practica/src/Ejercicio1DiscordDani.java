/*
 *  Ejercicio 1. Definir la función media3 tal que (media3 x y z) es
 *  la media aritmética de los números x, y y z. Por ejemplo,
 *  media3 1 3 8 == 4.0
 *  media3 (-1) 0 7 == 2.0
 *  media3 (-3) 0 3 == 0.0
 *
*/

import java.util.Scanner;

public class Ejercicio1DiscordDani {
    public static void main(String[] args) {

        int num=0;
        int total=0;
        int suma=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nIndica 3 números (x, y, z): ");

        for (int i=1; i<=3 ; i++) {
            if (i==1) {
                System.out.print("X = ");
                num = sc.nextInt();
            } else if (i==2) {
                System.out.print("Y = ");
                num = sc.nextInt();
            } else {
                System.out.print("Z = ");
                num = sc.nextInt();
            }
            suma+=num;
        }

        System.out.printf("Media de X, Y, Z = %.1f\n", (double) (suma/3) );

        sc.close();

    }
}
