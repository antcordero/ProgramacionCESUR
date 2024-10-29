import java.util.Scanner;

public class CP03Ejercicio2 {
    public static void main(String[] args) {

        double neto;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Neto de la factura: ");
            neto = sc.nextDouble();
        } while (neto < 0);

        sc.close();

        //Cálculo IVA (21%) y Total de la factura
        System.out.printf("El IVA es %.2f€\n", neto*0.21);
        System.out.printf("Precio Final Factura: %.2f€\n", neto+(neto*0.21));

    }
}
