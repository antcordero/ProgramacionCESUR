import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Funciones {

    //Constructor
    public Funciones() {
    }

    //Métodos

    /**
     * Método para agregar Contactos a la lista
     */
    public static void agregarContacto(String nombre, String tlf, String email) throws IOException {

        String contacto = nombre + ", " + tlf + ", " + email;

        FileWriter fw = null;
        PrintWriter pw = null;

        try {

            fw = new FileWriter("src\\Contactos.txt", true);
            pw = new PrintWriter(fw);
            pw.println(contacto);

        } finally {
            if (pw != null) {
                pw.close();
            }

        }

    }

    /**
     * Método para listar contactos
     */
    public static void listarContactos() {

    }

    /**
     * Método para buscar un contacto
     */
    public static void buscarContacto() {

    }

    /**
     * Método para eliminar Contacto
     */
    public static void eliminarContacto() {

    }

}
