import java.util.Scanner;

public class CP04Ejercicio1 {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngresa el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2 = sc.nextInt();

        sc.close();

        if (num1 > num2) {
            System.out.printf("Resta de %d y %d = %d", num1, num2, (num1 - num2));
        } else if (num2 == num1) {
            System.out.printf("Multiplicación de %d y %d = %d", num1, num2, (num1 * num2));
        } else {
            System.out.printf("Resta de %d y %d = %d", num1, num2, (num1 + num2));
        }

    }
}
