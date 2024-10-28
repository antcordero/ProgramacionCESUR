import java.util.Scanner;

public class CP02Ejercicio5 {
    public static void main(String[] args) {

        double importe;
        String mes;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIngrese el importe: ");
            importe = sc.nextDouble();
        } while(importe <= 0);

        System.out.print("Ingrese el mes: ");
        mes = sc.next().toLowerCase();

        sc.close();

        if (mes.equals("octubre")) {
            System.out.printf("El importe en Octubre es: %.2f€\n", importe*0.85);
        } else {
            System.out.printf("El importe es: %.2f€\n", importe);
        }
    }
}
