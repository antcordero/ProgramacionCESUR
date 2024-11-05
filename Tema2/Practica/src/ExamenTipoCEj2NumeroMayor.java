    /*
     *  2. (2 puntos) Escribe un programa en Java que pida al usuario introducir 5 números
     *  enteros y determine cuál es el mayor.
     */

import java.util.Scanner;

public class ExamenTipoCEj2NumeroMayor {
    public static void main(String[] args) {

        int num;
        int mayor=0;

        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=5 ; i++) {
            System.out.printf("Número %d: ", i);
            num=sc.nextInt();

            //Comprobación del mayor
            if (num>mayor) {
                mayor=num;
            }
        }

        sc.close();

        System.out.printf("El número mayor es: %d\n", mayor);
    }
}
