import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico - Tema 11");

        Scanner sc = new Scanner(System.in);



        int opcion = -1;

        //Usuario
        String dni;
        String nombre;
        String email;

        //Libro
        String isbn;
        String titulo;
        String autor;
        boolean disponible;

        do {
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 0:
                    System.out.println("\nSaliendo...");
                    break;

                //Mostrar usuarios
                case 1:
                    System.out.print("== Listado de usuarios ==");

                    break;

                //Mostrar libros disponibles
                case 2:
                    System.out.println("== Listado de libros disponibles ==");

                    break;

                //Mostrar préstamos activos
                case 3:
                    System.out.println("== Listado de préstamos activos ==");
                    break;

                //Añadir usuarios
                case 4:
                    System.out.print("DNI: ");
                    dni = sc.nextLine();
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Email: ");
                    email = sc.nextLine();

                    break;

                //Añadir libro
                case 5:
                    System.out.print("ISBN: ");
                    isbn = sc.nextLine();
                    System.out.print("Titulo: ");
                    titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();
                    System.out.print("Disponible: ");
                    disponible = Boolean.parseBoolean(sc.nextLine());
                    break;

                //Buscar usuario
                case 6:
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    break;

                //Buscar libro
                case 7:
                    System.out.print("Titulo: ");
                    titulo = sc.nextLine();
                    break;

                //Crear préstamo
                case 8:
                    System.out.print("Nombre del usuario: ");
                    nombre = sc.nextLine();
                    System.out.print("Título del libro: ");
                    titulo = sc.nextLine();
                    System.out.print("Préstamo realizado: ");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }

    /**
     * Función para mostrar menú en el main
     */
    private static void mostrarMenu(){
        System.out.println("\n=== MENÚ BIBLIOTECA ===");
        System.out.println("=======================");
        System.out.println("1. Mostrar usuarios");
        System.out.println("2. Mostar libros disponibles");
        System.out.println("3. Mostrar préstamos activos");
        System.out.println("4. Añadir usuarios");
        System.out.println("5. Añadir libro");
        System.out.println("6. Buscar usuario");
        System.out.println("7. Buscar libro");
        System.out.println("8. Crear préstamo");
        System.out.println("9. Devolver libro");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
