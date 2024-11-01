/*
 *  Ejercicio 2. Definir la función sumaMonedas tal que
 *  (sumaMonedas A B C D E) es la suma de los euros correspondientes a
 *  A monedas de 1 euro, B de 2 euros, C de 5 euros, D 10 euros y E de 20 euros.
 *  Por ejemplo,
 *  sumaMonedas 0 0 0 0 1 == 20
 *  sumaMonedas 0 0 8 0 3 == 100
 *  sumaMonedas 1 1 1 1 1 == 38
 */

import java.util.Scanner;

public class Ejercicio2DiscordDani {
    public static void main(String[] args) {

        int monedas;
        int resto;
        int cont=5;
        int suma=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nMonto de monedas (ABCDE):");
        System.out.println("A=1€ | B=2€ | C=5€ | D=10€ | E=20€ ");
        do {
            System.out.print("Cantidad de monedas en cada montón: ");
            monedas = sc.nextInt();
        } while (monedas < 1 || monedas > 99999);

        //A=1 | B=2 | C=3 | D=4 | E=5
        while (monedas > 0) {
            if(cont==5) {
                resto=monedas%10;
                suma+=resto*20;
            } else if (cont==4) {
                resto=monedas%10;
                if(resto!=0) {
                    suma+=resto*10;
                }
            } else if (cont==3) {
                resto=monedas%10;
                if(resto!=0) {
                    suma+=resto*5;
                }
            } else if (cont==2) {
                resto=monedas%10;
                if(resto!=0) {
                    suma+=resto*2;
                }
            } else if (cont==1) {
                resto=monedas%10;
                if(resto!=0) {
                    suma+=resto;
                }
            }
            cont--;
            monedas=monedas/10;
        }

        System.out.printf("Precio total de la suma de las monedas = %d\n", suma);

        sc.close();
    }
}
