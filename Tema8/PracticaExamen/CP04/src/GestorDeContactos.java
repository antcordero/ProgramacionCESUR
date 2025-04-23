import java.io.*;

public class GestorDeContactos {

    //ruta
    private static final String ARCHIVO = "contactos.txt";

    /**
     * Metodo para agregar contactos al archivo
     * @param c
     */
    public static void agregarContacto(Contacto c) {
        FileWriter fw = null;
        PrintWriter pw = null;

        if (buscarContacto(c.getNombre()) == null) {
            //Va a escribir el contacto con el formato del toString en el archivo
            try {
                fw = new FileWriter(ARCHIVO, true); //Modo APPEND para no sobrescribir
                pw = new PrintWriter(fw);
                pw.println(c.toString());
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo.");
            } finally {
                try {
                    if (pw != null) pw.close();
                    if (fw != null) fw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo.");
                }
            }
        } else {
            System.out.println("El contacto ya existe");
        }
    }

    /**
     * Metodo para listar todos los contactos imprimiendo por pantalla
     */
    public static void listarContactos() {
        BufferedReader br = null;

        //Va a ir leyendo el archivo e imprimiendo por pantalla mediante Scanner (sout)
        try {
            br = new BufferedReader(new FileReader(ARCHIVO));
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine(); // ✅ Faltaba avanzar línea
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }

    /**
     * Metodo para buscar contactos a partir de un nombre en el archivo csv
     * @param nombre
     * @return
     */
    public static Contacto buscarContacto(String nombre) {
        BufferedReader br = null;
        Contacto contacto = null;

        //Va a ir leyendo y comparando la primera posición del array que sale de romper la cadena csv
        //  la cual es el nombre y va a comparar el nombre obtenido con el nombre que se le pide al metodo
        //  finalmente imprime el contacto completo
        try {
            br = new BufferedReader(new FileReader(ARCHIVO));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].trim().equalsIgnoreCase(nombre)) {
                    System.out.println("Contacto encontrado");
                    System.out.println("Nombre: " + datos[0] + ", Teléfono: " + datos[1] + ", Email: " + datos[2]);
                    contacto = new Contacto(datos[0], datos[1], datos[2]);
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }

        return contacto;
    }

    /**
     * Metodo para borrar contactos
     * @param nombre
     */
    public static void eliminarContacto(String nombre) {
        File original = new File(ARCHIVO);
        File copia = new File("contactosCopia.txt");

        BufferedReader br = null;
        PrintWriter pw = null;

        boolean encontrado = false;

        //Hace lo mismo que buscarContacto, pero mientras no coincida va a escribir el contacto en una copia
        //  de seguridad, cunado encuentre el que se debe borrar, no lo escribe. Finalmente, hace un intercambio
        //  de contenido entre el archivo copia y el original.
        try {
            br = new BufferedReader(new FileReader(ARCHIVO));
            pw = new PrintWriter(new FileWriter(copia));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (!datos[0].trim().equalsIgnoreCase(nombre)) {
                    pw.println(linea);
                } else {
                    encontrado = true;
                }
            }

            if (encontrado) {
                System.out.println("Contacto eliminado correctamente.");
            } else {
                System.out.println("Contacto no encontrado.");
            }

        } catch (IOException e) {
            System.out.println("Error al eliminar el contacto.");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (pw != null) {
                    pw.close();
                }

                //Intercambio de archivos
                original.delete();
                copia.renameTo(original);

            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }
}
