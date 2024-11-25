package CP02;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 2 - Tema 3\n");

        //Instancias
        CuentaBancaria cuenta1 = new CuentaBancaria("ES123456789", 25000.50);
        CuentaBancaria cuenta2 = new CuentaBancaria();

        System.out.println("Saldos iniciales: ");
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();

        System.out.println("\nSaldos después de ingreso: ");
        //Realizar depósitos
        cuenta1.depositar(5000.25);
        cuenta2.depositar(1000.05);

        //Mostrar info
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();

        System.out.println("\nSaldos después de retirada: ");
        //Realizar retiradas
        cuenta1.retirar(1000.25);
        cuenta2.retirar(30000);
        //Mostrar info
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();

    }
}
