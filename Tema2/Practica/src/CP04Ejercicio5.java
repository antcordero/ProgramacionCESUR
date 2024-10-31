import java.util.Scanner;

public class CP04Ejercicio5 {
    public static void main(String[] args) {

        int mayor;
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngresa un numero: ");
        num = sc.nextInt();
        mayor = num;

        while (num>=0) {
            System.out.print("Ingresa un numero: ");
            num = sc.nextInt();
            if (num>mayor) {
                mayor = num;
            }
        }

        sc.close();

        System.out.printf("El mayor es: %d\n", mayor);
    }
}
