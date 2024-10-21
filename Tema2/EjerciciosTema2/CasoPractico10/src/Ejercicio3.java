import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        double saldoAnterior;
        double monto;
        double saldoActual;
        double pago;
        double minimo;
        double maximo;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nAvaro Bank");

        do {
            System.out.print("Saldo anterior: ");
            saldoAnterior=sc.nextDouble();
        } while (saldoAnterior<0);
        do {
            System.out.print("Monto de las compras: ");
            monto=sc.nextDouble();
        } while (monto<0);

        //Calcular el saldo actual
        saldoActual = saldoAnterior-monto;
        System.out.printf("Saldo actual = %.2f€", saldoActual );

        //Págo mínimo
        minimo = saldoActual*0.15;
        //Pago máximo
        maximo = saldoActual*0.85;
        /*
        if (monto==minimo) {
            System.out.println("Pago mínimo = %.2f", ());
        }
        */
        sc.close();
    }
}
