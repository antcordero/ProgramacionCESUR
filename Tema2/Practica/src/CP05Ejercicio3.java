import java.util.Scanner;

public class CP05Ejercicio3 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
        } while (num<0);

        sc.close();

        for (int i = num; i <= num+4 ; i++) {
            System.out.printf("Cuadrado de %d = %.0f :", i, Math.pow(i, 2));
            System.out.printf(" Cubo de %d = %.0f\n", i, Math.pow(i, 3));
        }

    }
}
