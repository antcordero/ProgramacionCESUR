package CP02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String tipo;
        int usuario;
        int opcion;
        double cantidad;

        boolean salir = true;

        System.out.println("\nCaso Práctico 2 - Tema 4\n");

        Scanner sc = new Scanner(System.in);

        //Instancia de Persona
        Persona p1 = new Persona("Daniel", "Peti", "123456789");
        Persona p2 = new Persona("Peti", "Daniel", "987654321");
        //Instancia de dos cuentas
        Cuenta c1 = new Cuenta("ES123456", 30000.00, p1);
        Cuenta c2 = new Cuenta("DE987654", 25000.00, p2);

        //Petición
        do {
            System.out.print("Seleccione usuario (1/2): ");
            usuario = sc.nextInt();
        } while (usuario<1 || usuario>2);

        if (usuario == 1) {
            do {
                System.out.println("Opciones disponibles: ");
                System.out.println("(1-Mostrar info / 2-Reintegro / 3-Ingreso / 4-Salir)");
                System.out.print("> ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        c1.mostrarInfo();
                        break;
                    case 2:
                        System.out.print("Cantidad a retirar: ");
                        cantidad = sc.nextDouble();
                        c1.transaccion(cantidad, opcion);
                        break;
                    case 3:
                        System.out.print("Cantidad a ingresar: ");
                        cantidad = sc.nextDouble();
                        c1.transaccion(cantidad, opcion);
                    break;
                    case 4:
                        salir = false;
                    break;
                    default:
                        System.out.println("Opción no valida");
                }
            } while (salir);

        } else if (usuario == 2) {
            do {
                System.out.println("Opciones disponibles: ");
                System.out.println("(1-Mostrar info / 2-Reintegro / 3-Ingreso / 4-Salir)");
                System.out.print("> ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        c2.mostrarInfo();
                        break;
                    case 2:
                        System.out.print("Cantidad a retirar: ");
                        cantidad = sc.nextDouble();
                        c2.transaccion(cantidad, opcion);
                        break;
                    case 3:
                        System.out.print("Cantidad a ingresar: ");
                        cantidad = sc.nextDouble();
                        c2.transaccion(cantidad, opcion);
                        break;
                    case 4:
                        salir = false;
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
            } while (salir);
        } else {
            System.out.println("ERROR");
        }

        sc.close();

    }
}
