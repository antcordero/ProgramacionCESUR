import java.util.Scanner;

public class GestionBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        Biblioteca internacional = new Biblioteca(2);
        do {
            System.out.println("--- Menú de Gestión de Biblioteca ---");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Eliminar Ejemplar");
            System.out.println("4. Mostrar Ejemplares");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1" -> {
                    System.out.println("--- Agregar Libro ---");
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    String anho = sc.nextLine();
                    System.out.print("Ingrese el número de páginas: ");
                    int paginas = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el género del libro: ");
                    String genero = sc.nextLine();
                    internacional.agregarEjemplar(new Libro(titulo, autor, anho, paginas, genero));
                }
                case "2" -> {
                    System.out.println("--- Agregar Revista ---");
                    System.out.print("Ingrese el título de la revista: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el autor de la revista: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    String anho = sc.nextLine();
                    System.out.print("Ingrese el número de edición: ");
                    String edicion = sc.nextLine();
                    System.out.print("Ingrese la frecuencia: ");
                    String frecuencia = sc.nextLine();
                    internacional.agregarEjemplar(new Revista(titulo, autor, anho, edicion, frecuencia));
                }
                case "3" -> {
                    System.out.println("--- Eliminar Ejemplar ---");
                    System.out.print("Escriba el titulo: ");
                    String titulo = sc.nextLine();
                    internacional.eliminarEjemplar(titulo);
                }
                case "4" -> {
                    System.out.println("--- Mostrar Ejemplares ---");
                    internacional.mostrarEjemplares();
                }
            }
        } while (!opcion.equals("5"));
        sc.close();
        System.out.println("Gracias por usar el sistema de gestión de la biblioteca.");
    }
}
