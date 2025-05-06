import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nCaso Práctico 1 - Tema 11");

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        String titulo;
        String descripcion;
        String fecha;

        GestorTareas gestor = new GestorTareas();

        do {
            System.out.println("\n--------------------------");
            System.out.println("Seleccione una operación:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                //Agregar tarea
                case 1:
                    System.out.print("Ingrese eI título de la tarea: ");
                    titulo = sc.nextLine();
                    System.out.print("Ingrese la descripción de la tarea: ");
                    descripcion = sc.nextLine();
                    System.out.print("Ingrese la fecha de vencimiento (dd/mm/yyyy): ");
                    fecha = sc.nextLine();

                    gestor.agregarTarea(titulo, descripcion, fecha);
                break;

                //Eliminar tarea
                case 2:
                    System.out.print("Ingrese eI titulo de va tarea a eliminar: ");
                    titulo = sc.nextLine();

                    gestor.eliminarTarea(titulo);
                break;

                //Mostrar tareas
                case 3:
                    System.out.println("--Tareas:");

                    gestor.mostrarTareas();
                    break;

                //Salir
                case 4:
                    System.out.println("\nSaliendo...");
                break;
            }

        } while (opcion != 4);

        sc.close();
    }
}
