import java.io.*;

public class Funciones {

    //Constructor
    public Funciones() {
    }

    //Métodos

    /**
     * Método para agregar Contactos a la lista
     */
    public static void agregarContacto(String nombre, String tlf, String email) throws IOException {

        File rutaTxt = new File("Contactos.txt");
        File rutaCSV = new File("Contactos.csv");

        FileReader fr = new FileReader(rutaTxt);

        BufferedReader br = new BufferedReader(fr);
        PrintWriter pw = new PrintWriter(rutaTxt);

        try {

            String linea = br.readLine();

            while (linea != null) {
                pw.println(linea);
                linea = br.readLine();
            }

        } finally {
            if (br!=null) {
                br.close();
            }
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
