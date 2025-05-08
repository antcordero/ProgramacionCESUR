import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico - Tema 11");

        Scanner sc = new Scanner(System.in);

        GestorInventario gestor;

        int opcion = 0;
        String codigo;
        String nombre;
        double precio;

        do {
            System.out.println("\nGestión de Inventario de Productos:");
            System.out.println("===================================");
            System.out.println("1. Añadir nuevo producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Buscar producto por código");
            System.out.println("5. Filtrar productos por rango de precios");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                //Añadir nuevo producto
                case 1:
                    System.out.print("Introduce eI código del producto: ");
                    codigo = sc.nextLine();
                    System.out.print("Introduce eI nombre del producto: ");
                    nombre = sc.nextLine();
                    System.out.println("Introduce eI precio del producto: " );
                    precio = sc.nextDouble();


                    break;

                //Eliminar producto
                case 2:
                    break;

                //Mostrar inventario
                case 3:
                    break;

                //Buscar producto por código
                case 4:
                    break;

                //Filtrar producto por precio
                case 5:
                    break;

                case 6:
                    System.out.println("\nSaliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 6);

        sc.close();
    }
}
