import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        double base;
        double altura;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nAltura: ");
        altura = sc.nextDouble();
        System.out.print("Base: ");
        base = sc.nextDouble();

        System.out.printf("\nEl área del triángulo es: %.2f cm^2\n", ((base*altura)/2));

        sc.close();
    }
}
