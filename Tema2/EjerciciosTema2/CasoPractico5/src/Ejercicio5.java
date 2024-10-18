import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        int numChicos;
        int numChicas;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDe el número de chicos: ");
        numChicos=sc.nextInt();
        System.out.print("De el número de chicas: ");
        numChicas=sc.nextInt();

        System.out.printf("El porcentaje de chicos es = %.2f %%\n", (double) ((numChicos * 100) / (numChicos+numChicas)));
        System.out.printf("El porcentaje de chicas es = %.2f %%", (double) ((numChicas * 100) / (numChicos+numChicas)));

        sc.close();
    }
}
