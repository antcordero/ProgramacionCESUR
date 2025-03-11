import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class LogToFile {
    public static void main(String[] args) {

        //1º - Definir la ruta del archivo
        String filePath = "misArchivos\\logs.txt";

        //Asegurarnos de que el directorio "misArchivos" existe
        File directorio = new File("misArchivos");
        if (!directorio.exists()) {
            //Crea el directorio si no existe
            directorio.mkdirs();
        }

        //2º - Preparar para escribir en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            Scanner sc = new Scanner(System.in);
            String input;

            System.out.println("Escribe cadenas de texto (escribe \"fin\" para terminar): ");

            //3º - Pedir cadenas al usuario hasta que escriba "fin"
            boolean escrito = false;
            while (!escrito) {
                System.out.print("> ");
                input = sc.nextLine();

                if(input.equalsIgnoreCase("fin")) {
                    escrito = true;
                    sc.close();
                }

                //Escribir cadena
                writer.write(input);
                writer.newLine();

            }

            System.out.println("Cadenas guardadas en el archivo");

        } catch (Exception e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        //4º - Preparar para leer el archivo
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            System.out.println("Contenido del archivo:");
            String linea;

            //5º - Leer el archivo línea por línea y mostrarlo por pantalla
            while ((linea = reader.readLine()) != null ) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}

/* ******* Solución Hamza

package Ejer1;import java.io.*;import java.util.Scanner;

public class Cadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadenas;
        File archivo = new File("log.txt");
        BufferedReader br;
        PrintWriter pw;
        boolean salir = false;
        try {
            FileReader fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            pw = new PrintWriter("log.txt");
            while (!salir) {
                System.out.print("Introduzca un nombre (fin para terminar): ");
                cadenas = sc.nextLine();
                if (cadenas.equalsIgnoreCase("fin")) {
                    salir = true;
                } else {
                    pw.println(cadenas);
                }
            }
            pw.close();
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
*/