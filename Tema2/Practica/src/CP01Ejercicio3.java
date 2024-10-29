import java.util.Scanner;

public class CP01Ejercicio3 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIngrese un número positivo disnto de 0: ");
            num = sc.nextInt();
        } while (num<=0);

        sc.close();
    }
}
