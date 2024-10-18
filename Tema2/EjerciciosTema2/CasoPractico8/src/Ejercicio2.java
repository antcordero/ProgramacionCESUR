import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        String opcion="";
        int cantidad;
        String opPago;
        boolean pago = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nHay 3 tipos de hamburguesas. (sencillas / dobles / triples)");
        System.out.print("Marca la opción: ");
        opcion=sc.next().toLowerCase();

        switch (opcion) {
            case "sencillas":
                System.out.print("¿Cuántas quieres?: ");
                cantidad=sc.nextInt();
                System.out.print("¿Pago con tarjeta? (si / no): ");
                opPago=sc.next().toLowerCase();
                if (opPago.equals("si")) {
                    pago = true;
                    if (pago=true) {
                        System.out.printf("Coste final con tarjeta = %.2f €\n", (double) ((cantidad*5)*1.05));
                    }
                } else {
                    System.out.printf("Coste final con tarjeta = %d €\n", (cantidad*5));
                }
            break;
            case "dobles":
                System.out.print("¿Cuántas quieres?: ");
                cantidad=sc.nextInt();
                System.out.print("¿Pago con tarjeta? (si / no): ");
                opPago=sc.next().toLowerCase();
                if (opPago.equals("si")) {
                    pago = true;
                    if (pago=true) {
                        System.out.printf("Coste final con tarjeta = %.2f €\n", (double) ((cantidad*8)*1.05));
                    }
                } else {
                    System.out.printf("Coste final con tarjeta = %d €\n", (cantidad*8));
                }
            break;
            case "triples":
                System.out.print("¿Cuántas quieres?: ");
                cantidad=sc.nextInt();
                System.out.print("¿Pago con tarjeta? (si / no): ");
                opPago=sc.next().toLowerCase();
                if (opPago.equals("si")) {
                    pago = true;
                    if (pago=true) {
                        System.out.printf("Coste final con tarjeta = %.2f €\n", (double) ((cantidad*12)*1.05));
                    }
                }  else {
                    System.out.printf("Coste final con tarjeta = %d €\n", (cantidad*12));
                }
            break;

            default:
                System.out.println("ERROR");
        }

        sc.close();
    }
}
