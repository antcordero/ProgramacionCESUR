import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    private SistemaGestion sistema;
    private Scanner sc;

    public MenuPrincipal(SistemaGestion sistema) {
        this.sistema = sistema;
        this.sc = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("\nCaso Práctico 4 - Tema 9\n");
        System.out.println("Sistema de gestión con persistencia en CSV\n");

        int opcion = 0;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); //Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    agregarConsola();
                    break;
                case 2:
                    agregarVideojuego();
                    break;
                case 3:
                    mostrarConsolasRegistradas();
                    break;
                case 4:
                    mostrarVideojuegosPorConsola();
                    break;
                case 5:
                    System.out.println("Saliendo y guardando datos...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 5);

        sc.close();
    }

    /**
     * Función para mostrar el menú en cada paso
     */
    private void mostrarMenu() {
        System.out.println("\n--- Gestor de Consolas ---");
        System.out.println("Marca una opción: ");
        System.out.println("1.- Agregar Consola.");
        System.out.println("2.- Agregar Videojuego.");
        System.out.println("3.- Mostrar Consolas Registradas.");
        System.out.println("4.- Mostrar Videojuegos por Consola.");
        System.out.println("5.- Salir del programa.");
        System.out.print("  Opción ->  ");
    }

    /**
     * Función para agregarConsola
     */
    private void agregarConsola() {
        System.out.println("\n--- AGREGAR CONSOLA ---");
        System.out.print("Nombre de la consola: ");
        String nombre = sc.nextLine();

        System.out.print("Fabricante: ");
        String fabricante = sc.nextLine();

        System.out.print("Tipo (1-Sobremesa / 2-Portátil): ");
        int tipo = sc.nextInt();
        sc.nextLine();

        if (tipo == 1) {
            System.out.print("Resolución máxima: ");
            String resolucion = sc.nextLine();
            Consola consola = new ConsolaSobremesa(nombre, fabricante, resolucion);
            sistema.agregarConsola(consola);
            System.out.println("Consola de sobremesa agregada con éxito!");
        } else if (tipo == 2) {
            System.out.print("Duración de batería (horas): ");
            int bateria = sc.nextInt();
            sc.nextLine();
            Consola consola = new ConsolaPortatil(nombre, fabricante, bateria);
            sistema.agregarConsola(consola);
            System.out.println("Consola portátil agregada con éxito!");
        } else {
            System.out.println("Tipo de consola no válido.");
        }
    }

    /**
     * Función para agregar Videojuego
     */
    private void agregarVideojuego() {
        System.out.println("\n--- AGREGAR VIDEOJUEGO ---");
        System.out.print("Título del videojuego: ");
        String titulo = sc.nextLine();

        System.out.print("Género: ");
        String genero = sc.nextLine();

        System.out.print("Nombre de la consola: ");
        String nombreConsola = sc.nextLine();

        Consola consola = sistema.buscarConsola(nombreConsola);
        if (consola == null) {
            System.out.println("Error: La consola no está registrada en el sistema.");
            return;
        }

        Videojuego videojuego = new Videojuego(titulo, genero, consola);
        sistema.agregarVideojuego(videojuego);
        System.out.println("Videojuego agregado con éxito!");
    }

    /**
     * Función para listar las consolas
     */
    private void mostrarConsolasRegistradas() {
        System.out.println("\n--- CONSOLAS REGISTRADAS ---");
        List<Consola> consolas = sistema.obtenerConsolas();
        if (consolas.isEmpty()) {
            System.out.println("No hay consolas registradas.");
        } else {
            for (Consola c : consolas) {
                c.mostrarDetalles();
                System.out.println("-----------------------");
            }
        }
    }

    /**
     * Función para listar los videojuegos por consolas
     */
    private void mostrarVideojuegosPorConsola() {
        System.out.println("\n--- VIDEOJUEGOS POR CONSOLA ---");
        System.out.print("Nombre de la consola: ");
        String nombreConsola = sc.nextLine();

        List<Videojuego> videojuegos = sistema.obtenerVideojuegosPorConsola(nombreConsola);
        if (videojuegos.isEmpty()) {
            System.out.println("No hay videojuegos registrados para esta consola o la consola no existe.");
        } else {
            System.out.println("Videojuegos para " + nombreConsola + ":");
            for (Videojuego v : videojuegos) {
                v.mostrarDetalles();
                System.out.println("-----------------------");
            }
        }
    }

}