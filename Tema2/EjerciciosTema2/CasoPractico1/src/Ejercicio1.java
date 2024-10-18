import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nDe 3 números:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if((num1>num2) && (num1>num3)) {
            System.out.printf("El número %d es el mayor", num1);
        } else if((num2>num3) && (num2>num1)){
            System.out.printf("El número %d es el mayor", num2);
        } else if ((num3>num1) && (num3>num2)) {
            System.out.printf("El número %d es el mayor", num3);
        }

        sc.close();
    }
}