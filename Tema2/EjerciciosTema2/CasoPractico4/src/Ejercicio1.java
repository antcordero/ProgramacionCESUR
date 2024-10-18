import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndica un número: ");
        num1 = sc.nextInt();
        System.out.print("Indica el segundo número: ");
        num2 = sc.nextInt();

        if (num1==num2) {
            System.out.printf("Multiplicación = %d", (num1*num2));
        } else if (num1>num2) {
            System.out.printf("Resta = %d", (num1-num2));
        } else {
            System.out.printf("Suma = %d", (num1+num2));
        }

        sc.close();
    }
}
