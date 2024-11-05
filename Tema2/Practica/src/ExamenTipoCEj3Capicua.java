    /*
     *  3. (3 puntos) Escribe un programa que lea un número entero positivo ingresado por el
     *  usuario y determine si es un número capicúa. Un número es capicúa si se lee igual de
     *  izquierda a derecha que de derecha a izquierda, como 121 o 1331.
     *  Ejemplo:
     *  Escribe un número: 56765
     *  El número es capicúa
     */

import java.util.Scanner;

public class ExamenTipoCEj3Capicua {
    public static void main(String[] args) {

        int num;
        int numInicial;
        int capicua=0;

        Scanner sc = new Scanner(System.in);

        //Comprobación de que el número sea de dos cifras mínimo
        // (un número de una cifra no puede ser capicúa

        do {
            System.out.print("\nEscribe un número: ");
            num=sc.nextInt();
        } while (num<9);

        sc.close();

        //Guardar el número en otra variable para comparar al final
        numInicial=num;

        //Dar la vuelta al número
        while (num>0) {
            capicua=capicua*10+num%10;
            num/=10;
        }

        //Comprobación
        if (numInicial==capicua) {
            System.out.println("El número es capicúa");
        } else {
            System.out.println("El número no es capicúa");
        }

    }
}
