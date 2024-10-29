import java.util.Scanner;

public class CP02Ejercicio1 {
    public static void main(String[] args) {

        double peso;
        int edad;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIndique el peso: ");
            peso=sc.nextDouble();
            System.out.print("Indique la edad: ");
            edad=sc.nextInt();
        } while (peso<=0 && edad<=0);

        sc.close();

        System.out.printf("Su edad es %d años y su peso es %.2fKg\n", edad, peso);

    }
}
