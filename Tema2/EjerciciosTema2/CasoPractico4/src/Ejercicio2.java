import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int i;
        int num;

        int pares = 0;
        int impares = 0;
        int postivos = 0;
        int negativos = 0;

        Scanner sc = new Scanner(System.in);

        for(i=0 ; i<10 ; i++) {
            System.out.print("De un número natural: ");
            num = sc.nextInt();

            // Contar pares e impares, 0 no cuenta
            if (num!=0) {
                if (num%2==0) {
                    pares++;
                } else if (num%2!=0) {
                    impares++;
                }

                //Contar postivos y negativos
                if (num>0) {
                    postivos++;
                } else if (num<0) {
                    negativos++;
                }
            }
        }

        System.out.printf("Existen %d números pares, %d impares, %d postivos y %d negativos", pares, impares, postivos, negativos);

        sc.close();
    }
}
