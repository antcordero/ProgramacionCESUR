import java.util.Scanner;

public class CP03Ejercicio3 {
    public static void main(String[] args) {

        String nombre;
        double suedloBase;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nNombre: ");
        nombre = sc.nextLine();

        do {
            System.out.print("Suede Base: ");
            suedloBase = sc.nextDouble();
        } while (suedloBase < 0);

        sc.close();

        //Cálculo

        System.out.printf("El sueldo líquido de %s es de %.2f€\n", nombre, (suedloBase)*0.80);
    }
}
