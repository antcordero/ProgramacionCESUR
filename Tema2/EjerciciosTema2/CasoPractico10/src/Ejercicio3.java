import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Variables para pedir datos
        double saldoAnterior;
        double monto;
        double deuda;
        double compra;
        double pago;

        //Variables para las operaciones
        double interesesAcumulados=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nAvaro Bank");

        do {
            System.out.print("Saldo anterior del cliente: ");
            saldoAnterior=sc.nextDouble();
        } while (saldoAnterior<0);
        do {
            System.out.print("Pago del mes anterior: ");
            monto=sc.nextDouble();
        } while (monto<0);
        do {
            System.out.print("Cantidad pendiente de las compras: ");
            deuda=sc.nextDouble();
        } while (deuda<0);
        do {
            System.out.print("Compras realizadas: ");
            compra=sc.nextDouble();
        } while (compra<0);

        //Resultados
        System.out.printf("El pago mínimo que debe realizar es %.2f€\n", ((deuda+compra)*0.15));
        System.out.printf("El pago que debe realizar para no generar intereses es %.2f€\n", ((deuda+compra)*0.85));

        do {
            System.out.print("Pago que desea realizar este mes: ");
            pago=sc.nextDouble();
        } while (pago<0);

        //Operaciones
        //comprasTotales=deuda+compra

        if (pago<((deuda+compra)*0.85)){
            interesesAcumulados = (deuda+compra)*1.12;
        }

        //Resultados
        System.out.printf("Una vez realizado el pago, su saldo actual es %.2f€\n", (saldoAnterior-(monto+pago)) );
        System.out.printf("La cantidad pendiente de pago de sus compras es %.2f€\n", (interesesAcumulados+200) );

        sc.close();
    }
}
