import java.util.Scanner;

public class CP02Ejercicio2 {
    public static void main(String[] args) {

        double base;
        double altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nCálculo del área de un triángulo");

        do {
            System.out.print("Altura: ");
            altura = sc.nextDouble();
        } while (altura < 1.0);

        do {
            System.out.print("Base: ");
            base = sc.nextDouble();
        } while (base < 1.0);

        sc.close();
        //Cálculo
        //Área = (base * altura)/2

        System.out.printf("Área del triángulo = %.2f\n", ((base*altura)/2));

    }
}
