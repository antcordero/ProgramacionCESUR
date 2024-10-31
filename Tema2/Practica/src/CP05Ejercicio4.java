import java.util.Scanner;

public class CP05Ejercicio4 {
    public static void main(String[] args) {

        int a;
        int b;
        int cambio;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nNúmero A: ");
            a = sc.nextInt();
            System.out.print("Número B: ");
            b = sc.nextInt();

            if (a == b) {
                System.out.println("Los números son iguales, vuelva a introducir dos números distintos.");
            }

        } while (a == b);

        sc.close();

        //Cambio
        cambio = a;
        a = b;
        b = cambio;

        System.out.printf("Después de intercambiar los valores:\nA = %d : B = %d\n", a, b);
    }
}
