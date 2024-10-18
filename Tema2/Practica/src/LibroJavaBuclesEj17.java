import java.util.Scanner;

public class LibroJavaBuclesEj17 {

    /*
    * Ejercicio 17
        Realiza un programa que sume los 100 números siguientes a un número entero
        y positivo introducido por teclado. Se debe comprobar que el dato introducido
        es correcto (que es un número positivo).
    * */

    public static void main(String[] args) {

        int num;
        int suma=0;

        Scanner sc = new Scanner(System.in);

        //Pedir y comprobar número
        do {
            System.out.print("\nIntroduce un número entero positivo: ");
            num = sc.nextInt();
        } while (num<0);

        //Sumar números
        for (int i = num; i <= num+100 ; i++) {
            suma += i;
        }

        System.out.printf("Suma total = %d\n", suma);


        sc.close();
    }
}
