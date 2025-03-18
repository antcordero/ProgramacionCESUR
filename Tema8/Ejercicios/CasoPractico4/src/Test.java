import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        File rutaTxt = new File("src\\Contactos.txt");
        File rutaCSV = new File("src\\Contactos.csv");

        int opcion = 0;

        do {
            System.out.println("\n-- Gestión de Contactos --");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Listar Contactos");
            System.out.println("3. Buscar Contactos");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                //Agregar contacto al archivo
                case 1:

                    try {
                        if (!rutaTxt.exists()) {
                            throw new FileNotFoundException("No existe el archivo");
                        } else {
                            //Copiar datos en el archivo de destino txt
                            System.out.print("Nombre: ");
                            String nombre = sc.nextLine();
                            System.out.print("Teléfono: ");
                            String tlf = sc.nextLine();
                            System.out.print("Email: ");
                            String email = sc.nextLine();

                            Funciones.agregarContacto(nombre, tlf, email);

                            System.out.println("Contacto agregado correctamente.");
                        }

                    } catch (FileNotFoundException fnfE) {
                        System.out.println(fnfE.getMessage());
                    } catch (IOException e) {
                        System.out.println("Error al agregar el contacto: " + e.getMessage());
                    }

                    break;

                //Listar contactos
                case 2:
                    break;

                //Buscar contactos
                case 3:
                    break;

                //Eliminar contacto
                case 4:
                    break;
                case 5:
                    System.out.println("\nGracias por usar el programa. Saliendo...");
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }

}
