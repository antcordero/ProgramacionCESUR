import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {

        System.out.println("\nAvaroBank\n");

        CuentaBancaria cliente1 = new CuentaBancaria();

        Scanner sc = new Scanner(System.in);

        //Nombre
        System.out.print("Introduzca el nombre del titular de la cuenta: ");
        String nombre = sc.nextLine();
        cliente1.setNombreTitular(nombre);

        //SaldoInicial
        System.out.print("Introduzca el saldo de la cuenta: ");
        double saldo = Double.parseDouble(sc.nextLine());
        try {
            if (saldo <= 0) {
                throw new SaldoInvalidoException(saldo);
            } else {
                cliente1.setSaldo(saldo);
                System.out.println("¡Cuenta creada!");
            }
        } catch (SaldoInvalidoException sie) {
            System.out.println(sie.getMessage());
        }

        int opcion;

        do {
            System.out.println("\nOpciones: 1)Depositar 2)Retirar 3)Mostrar saldo 4)Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                //Deposito
                case 1:
                    System.out.print("Introduzca la cantidad a ingresar: ");
                    double ingreso = sc.nextDouble();
                    try {
                        if (ingreso <= 0) {
                            throw new CantidadInvalidaException(ingreso);
                        } else {
                            cliente1.depositarSaldo(ingreso);
                        }
                    } catch (CantidadInvalidaException cie) {
                        System.out.println(cie.getMessage());
                    }
                    break;

                //Retiro
                case 2:
                    System.out.print("Introduzca la cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    try {
                        if (retiro > cliente1.getSaldo()) {
                            throw new FondosInsuficientesException(cliente1.getSaldo());
                        } else {
                            cliente1.retirarSaldo(retiro);
                        }
                    } catch (FondosInsuficientesException fie) {
                        System.out.println(fie.getMessage());
                    }
                    break;

                //Mostrar Saldo
                case 3:
                    System.out.println(cliente1.toString());
                    break;

                case 4:
                    System.out.println("¡Gracias por usar nuestro banco!s");
            }
        } while (opcion != 4);

        sc.close();
    }
}
