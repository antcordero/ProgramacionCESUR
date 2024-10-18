import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int anyo;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDiga su edad: ");
        anyo = sc.nextInt();

        System.out.printf("año %d edad %d", (2024-anyo), anyo);

        sc.close();
    }
}
