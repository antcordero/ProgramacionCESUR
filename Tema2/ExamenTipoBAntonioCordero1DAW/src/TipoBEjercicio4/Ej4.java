package TipoBEjercicio4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {

        int num;
        int potencia=0;
        int armstrong=0;
        int numInicial;

        System.out.println("\nNúmero Armstrong\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        num=sc.nextInt();
        numInicial=num;

        sc.close();

        //Partir el número para contar la potencia
        do {
            num/=10;
            potencia++;
        } while (num>0);

        //Actualizar para la operación
        num=numInicial;

        //Multiplicar cada dígito por la potencia
        do {
            armstrong += (int) Math.pow((num%10),potencia);
            num/=10;
        } while (num>0);

        //Comprobación + mensaje final
        System.out.println((armstrong==numInicial)?"Es un número Armstrong":"No es un número Armstrong");

    }
}
