import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        double factura;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndique el neto de la factura: ");
        factura = sc.nextDouble();

        System.out.printf("IVA = %.2f. Precio final: %.2f €", (factura*0.21), (factura+(factura*0.21)) );

        sc.close();
    }
}
