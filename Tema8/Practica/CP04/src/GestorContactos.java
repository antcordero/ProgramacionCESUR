import java.util.Scanner;

public class GestorContactos {
    public static void main(String[] args) {

        String nombre;
        String numTlf;
        String correo;

        Scanner sc = new Scanner(System.in);

        //menú
        int opcion=0;

        do {

            System.out.println("\n--- Gestión de Contactos ---");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Listar Contactos");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Eliminar Contacto");
            System.out.println("5. -> Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            //limpiar buffer de teclado
            sc.next();

            switch (opcion) {
                //Agregar
                case 1:
                    System.out.print("Nombre: ");
                    nombre=sc.nextLine();
                    System.out.print("Teléfono: ");
                    numTlf=sc.nextLine();
                    System.out.print("Correo electrónico: ");
                    correo=sc.nextLine();

                    Contactos contacto = new Contactos(nombre, numTlf, correo);
                    contacto.agregarContacto(nombre, numTlf, correo);

                    break;

                //Listar
                case 2:
                    System.out.println("\n--- Lista de Contactos ---");

                    break;

                //Buscar
                case 3:
                    System.out.print("Ingrese el nombre a buscar: ");
                    nombre=sc.nextLine();

                    break;

                //Eliminar
                case 4:
                    System.out.println("Ingrese el nombre a eliminar: ");
                    nombre=sc.nextLine();

                    break;

                //Mensaje de salida
                case 5:
                    System.out.println("Saliendo ... \n");
                    break;
            }

        } while (opcion!=5);

        sc.close();
    }
}
