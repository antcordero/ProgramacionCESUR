import java.util.Scanner;

public class CP01Ejercicio1 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("\nIngrese el segundo numero: ");
        num2 = sc.nextInt();
        System.out.print("\nIngrese el tercer numero: ");
        num3 = sc.nextInt();

        sc.close();

        //Comprobación

        if (num1>num2 && num1>num3) {
            System.out.printf("El primer numero (%d) es el mayor\n", num1);
        } else if (num2>num1 && num2>num3) {
            System.out.printf("El segundo numero (%d) es el mayor\n", num2);
        } else if (num3>num1 && num3>num2) {
            System.out.printf("El tercer numero (%d) es el mayor\n", num3);
        } else {
            System.out.println("Todos los números son iguales");
        }
    }
}
