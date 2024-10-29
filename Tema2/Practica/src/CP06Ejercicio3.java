import java.util.Scanner;

public class CP06Ejercicio3 {
    public static void main(String[] args) {

        int altura;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIndica la altura: ");
            altura = sc.nextInt();
        } while (altura<1);

        sc.close();

        for (int i = 1; i <= altura ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
