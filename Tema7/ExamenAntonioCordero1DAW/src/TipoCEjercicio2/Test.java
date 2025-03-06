package TipoCEjercicio2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Crear un parking con capacidad máxima de 5 vehículos para pruebas.
        Parking parking = new Parking(5);
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Menú interactivo simple.
        while (continuar) {
            System.out.println("\n--- Menú del Parking ---");
            System.out.println("1. Ingresar vehículo");
            System.out.println("2. Salir vehículo");
            System.out.println("3. Mostrar estado del parking");
            System.out.println("4. Salir del sistema");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer.

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la matrícula del vehículo: ");
                    String matriculaIngreso = scanner.nextLine();
                    try {
                        parking.ingresarVehiculo(matriculaIngreso);
                    } catch (ParkingLlenoException | VehiculoDuplicadoException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la matrícula del vehículo a retirar: ");
                    String matriculaSalida = scanner.nextLine();
                    try {
                        parking.salirVehiculo(matriculaSalida);
                    } catch (VehiculoNoEncontradoException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    parking.mostrarVehiculos();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }
}
