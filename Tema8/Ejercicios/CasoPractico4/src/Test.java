import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        File rutaTxt = new File(".\\Contactos.txt");
        File rutaCSV = new File(".\\Contactos.csv");

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

            FileReader fr = new FileReader(rutaTxt);

            BufferedReader br = null;
            PrintWriter pw = null;

            FileWriter fw = null;
            BufferedWriter bw = null;

            String nombre = "";

            switch (opcion) {
                //Agregar contacto al archivo
                case 1:

                    try {
                        if (!rutaTxt.exists()) {
                            throw new FileNotFoundException("No existe el archivo");
                        } else {
                            //Copiar datos en el archivo de destino txt
                            System.out.print("Nombre: ");
                            nombre = sc.nextLine();
                            System.out.print("Teléfono: ");
                            String tlf = sc.nextLine();
                            System.out.print("Email: ");
                            String email = sc.nextLine();

                            br = new BufferedReader(fr);
                            pw = new PrintWriter(rutaTxt);

                            fw = new FileWriter(rutaTxt, true);

                            String linea = br.readLine();
                            while (linea != null) {
                                pw.println(linea);
                                linea = br.readLine();
                            }

                            //Funciones.agregarContacto(nombre, tlf, email);

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
                    System.out.println("--- Lista de Contactos ---");

                    try {
                        fw = new FileWriter(rutaTxt);

                        br = new BufferedReader(fr);
                        pw = new PrintWriter(rutaTxt);

                        String linea = br.readLine();
                        while (linea != null) {
                            System.out.println(linea);
                            linea = br.readLine();
                        }

                    } catch (IOException e) {
                        throw new RuntimeException(e);

                    } finally {
                        try {
                            if (br!=null) {
                                br.close();
                            }
                            if (pw != null) {
                                pw.close();
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }

                    break;

                //Buscar contactos
                case 3:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombreBuscar = sc.nextLine();

                    boolean encontrado = false;

                    try {

                        fr = new FileReader(rutaTxt);
                        br = new BufferedReader(fr);

                        String linea = br.readLine();
                        while (linea != null && !encontrado) {
                            if (nombreBuscar.equals(nombre)) {
                                System.out.println("Contacto con nombre: " + nombreBuscar + " encontrado");
                                encontrado=true;
                                linea = null;
                            }
                            linea = br.readLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    break;

                //Eliminar contacto
                case 4:
                    System.out.print("Ingrese el nombre a borrar: ");
                    String nombreBorrar = sc.nextLine();

                    boolean encontradoB = false;

                    try {

                        fr = new FileReader(rutaTxt);
                        br = new BufferedReader(fr);

                        String linea = br.readLine();
                        while (linea != null && !encontradoB) {
                            if (nombreBorrar.equals(nombre)) {

                                System.out.println("-- Contacto borrado correctamente");
                                encontradoB = true;
                                linea = null;

                            }
                            linea = br.readLine();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Contacto eliminado correctamente.");
                    break;

                    //Fin programa
                case 5:
                    System.out.println("\nGracias por usar el programa. Saliendo...");
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }

}
