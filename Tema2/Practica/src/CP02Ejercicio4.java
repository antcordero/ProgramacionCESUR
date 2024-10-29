import java.util.Scanner;

public class CP02Ejercicio4 {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese un numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese otro numero: ");
        num2 = sc.nextInt();

        sc.close();

        if (num1 > num2) {
            System.out.printf("Resultado de la division de %d entre %d = %.2f\n", num1, num2, (double) (num1/num2));
        } else if (num2 > num1) {
            System.out.printf("Resultado de la division de %d entre %d = %.2f\n", num2, num1, (double) (num2/num1));
        } else {
            System.out.printf("Los números 1 (%d) y 2 (%d) son iguales\n", num1, num2);
        }
    }
}
