import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int num;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndica un número positivo: ");
        num=sc.nextInt();

        // Comprobar primero si es positivo
        if (num>=0) {
            System.out.println("Número positivo. Fin del programa.");
        } else {

            //Volver a pedir otro número
            do {
                System.out.print("Introduzca otro número: ");
                num2=sc.nextInt();
            } while (num2<0);

            // Mensaje final
            System.out.println("Número positivo. Fin del programa.");

        }

        sc.close();
    }
}
