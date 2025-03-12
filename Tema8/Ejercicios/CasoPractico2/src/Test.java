import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo a copiar: ");
        String rutaArchivo = sc.nextLine();

        //
        Funciones funciones = new Funciones();

        File archivo = new File(rutaArchivo);

        //Verificar si el archivo existe
        if (!archivo.exists()) {
            System.out.println("Error: El archivo no existe.");
            return;
        }

        //Determinar si es texto o binario por la extensión
        String nombreArchivo = archivo.getName();
        String extension = nombreArchivo.substring(nombreArchivo.lastIndexOf(".") + 1);
        boolean esTexto = extension.equals("txt") || extension.equals("csv");

        //Definir la ruta del archivo de copia
        String rutaCopia = archivo.getParent() + File.separator + archivo.getName() + ".bak";

        try {
            if (esTexto) {
                funciones.copiarArchivoTexto(archivo, new File(rutaCopia));
            } else {
                funciones.copiarArchivoBinario(archivo, new File(rutaCopia));
            }
            System.out.println("Copia de seguridad creada en: " + rutaCopia);
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        } finally {
            sc.close();
        }
    }


}
