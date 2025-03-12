import java.io.*;

public class Funciones {

    public Funciones() {
    }

    public void copiarArchivoTexto(File origen, File destino) throws IOException {
        BufferedReader lector = null;
        BufferedWriter escritor = null;
        try {
            lector = new BufferedReader(new FileReader(origen));
            escritor = new BufferedWriter(new FileWriter(destino));

            String linea;
            while ((linea = lector.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine();
            }
        } finally {
            if (lector != null) {
                lector.close();
            }
            if (escritor != null) {
                escritor.close();
            }
        }
    }

    public void copiarArchivoBinario(File origen, File destino) throws IOException {
        FileInputStream entrada = null;
        FileOutputStream salida = null;
        try {
            entrada = new FileInputStream(origen);
            salida = new FileOutputStream(destino);

            //Escribir bytes (1KB = 1024Bytes)
            byte[] buffer = new byte[1024];
            int bytesLeidos;
            int totalBytes = 0;

            while ((bytesLeidos = entrada.read(buffer)) != -1) {
                salida.write(buffer, 0, bytesLeidos);
                totalBytes += bytesLeidos;
                System.out.println("Copiados: " + totalBytes + " bytes...");
            }

        } finally {
            if (entrada != null) {
                entrada.close();
            }
            if (salida != null) {
                salida.close();
            }
        }
    }
}
