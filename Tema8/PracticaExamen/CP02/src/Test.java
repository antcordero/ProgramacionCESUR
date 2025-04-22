import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 2 - Tema 8\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el archivo que desea prueba: ");
        String archivo = sc.nextLine();

        File fichero = new File(archivo);

        if (fichero.exists()) {

            if (fichero.isFile() && (fichero.getName().endsWith(".txt") || fichero.getName().endsWith(".csv"))) {
                //Flujo de texto
                //Primero hay que leer el contenido del archivo abriendo un flujo de entrada
                FileReader fr = null;
                BufferedReader br = null;
                //Segundo hay que abrir un flujo de salida para escribir
                PrintWriter pw = null;

                try {
                    //lectura
                    fr = new FileReader(fichero);
                    br = new BufferedReader(fr);

                    //escritura
                    pw = new PrintWriter(fichero + ".bak");

                    String linea = br.readLine(); //lectura de la primera línea del archivo origen
                    while (linea != null) {
                        pw.println(linea); //escribir en el archivo de destino
                        linea = br.readLine(); //salta y lee la siguiente línea del archivo
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("Error, no se encontró el archivo.");
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo.");
                } finally {
                    try {
                        if (br != null) {
                            br.close();
                        }
                        if (pw != null) {
                            pw.close();
                        }
                    } catch (IOException e) {
                        System.out.println("Error al cerrar el archivo.");
                    }

                }

            } else {
                //Flujo binario
            }

        } else {
            System.out.println("No existe el archivo");
        }

        sc.close();

    }
}
