import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 4 - Tema 8\n");

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Contactos ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    Contacto nuevo = new Contacto(nombre, telefono, correo);
                    GestorDeContactos.agregarContacto(nuevo);
                }
                case 2 -> GestorDeContactos.listarContactos();
                case 3 -> {
                    System.out.print("Nombre a buscar: ");
                    String nombre = sc.nextLine();
                    GestorDeContactos.buscarContacto(nombre);
                }
                case 4 -> {
                    System.out.print("Nombre a eliminar: ");
                    String nombre = sc.nextLine();
                    GestorDeContactos.eliminarContacto(nombre);
                }
                case 5 -> System.out.println("¡Hasta pronto!");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion!=5);

        sc.close();
    }
}
