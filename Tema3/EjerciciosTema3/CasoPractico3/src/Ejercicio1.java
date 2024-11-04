import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        double cantidad;
        int opcion;

        Scanner sc = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria("1a2b3c4d5e");
        cuenta1.setSaldo(25000.00);

        //Operaciones
        do {
            System.out.println("Operación (1-Mostrar | 2-Deposito | 3-Retirar | 4-Fin) ");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1 -> cuenta1.mostrarSaldo();
                case 2 -> {
                    System.out.print("Depositar: ");
                    cantidad = sc.nextDouble();
                    cuenta1.depositar(cantidad);
                }
                case 3 -> {
                    System.out.print("Retirar: ");
                    cantidad = sc.nextDouble();
                    cuenta1.retirar(cantidad);
                }
            }

        } while(opcion!=4);
    }
}
