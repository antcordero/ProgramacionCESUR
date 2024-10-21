import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        String tipo="";
        int tamanio;
        double kilos;
        double precio=0;
        double precioFinal=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nAsociación de vinicultores");

        do {
            System.out.print("Indica el tipo (A/B): ");
            tipo=sc.next().toUpperCase();
        } while ( !( (tipo.equals("A") || tipo.equals("B")) ) );
        do {
            System.out.print("Indica el tamaño (1/2): ");
            tamanio=sc.nextInt();
        } while (!(tamanio==1 || tamanio==2));
        do {
            System.out.print("Indica los kilos: ");
            kilos=sc.nextDouble();
        } while (kilos<0);



        if (tipo.equals("A")){
            //pedir precio tipo A
            do {
                System.out.print("Indica el precio de un kilo (tipo A): ");
                precio=sc.nextDouble();
            } while (precio<0);

            if (tamanio==1) {
                precio += 0.20;
                precioFinal = precio * kilos;
            } else {
                precio += 0.30;
                precioFinal = precio * kilos;
            }

        } else {
            //pedir precio tipo B
            do {
                System.out.print("Indica el precio de un kilo (tipo B): ");
                precio=sc.nextDouble();
            } while (precio<0);
            if (tamanio==1) {
                precio -= 0.30;
                precioFinal = precio * kilos;
            } else {
                precio -= 0.50;
                precioFinal = precio * kilos;
            }
        }

        System.out.printf("\nPrecio venta = %.2f€\n", precioFinal);

        sc.close();
    }
}
