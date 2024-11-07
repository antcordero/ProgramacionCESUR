package TipoBEjercicio3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {

        int num;
        int suma=0;

        System.out.println("\nSuma dígitos de un número\n");

        Scanner sc = new Scanner(System.in);

        //Comprobar que no sea negativo, sí es cambiarlo a positivo
        System.out.print("Escribe un número: ");
        num=sc.nextInt();
        if (num<0) {
            num=num*-1;
        }

        sc.close();

        //Separar número por dígitos
        while (num > 0) {
            suma+=num%10;
            num/=10;
        }

        //Mensaje de resultado
        System.out.printf("La suma de sus dígitos es %d\n", suma);
    }
}
