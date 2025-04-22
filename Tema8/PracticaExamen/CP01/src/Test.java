import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Practico 1 - Tema 8\n");

        //Crear carpeta, si no existe se crea
        File carpeta = new File("misArchivos");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto (fin termina): ");
        String palabra = sc.nextLine();

        //Leer desde teclado y escribir en el archivo
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("misArchivos/log.txt");
            while (!palabra.equalsIgnoreCase("fin")) {
                pw.println(palabra);
                System.out.print("Ingresa una cadena de texto (fin termina): ");
                palabra = sc.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se puede encuentra el archivo");
        } finally {
            sc.close();
            if (pw != null) {
                pw.close();
            }
        }

        //Leer el archivo y mostrar por pantalla
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("misArchivos/log.txt");
            br = new BufferedReader(fr);

            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se puede encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }

        }


    }
}
