import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 3 - Tema 8\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ruta del primer archivo: ");
        String archivo1 = sc.nextLine();
        System.out.print("Ruta del segundo archivo: ");
        String archivo2 = sc.nextLine();
        System.out.print("Ruta del archivo fusionado: ");
        String archivoFusionado = sc.nextLine();

        File f1 = new File(archivo1);
        File f2 = new File(archivo2);
        File f3 = new File(archivoFusionado);

        try {
            //Si no son .txt, lanza error y termina el programa
            if (!archivo1.endsWith(".txt") || !archivo2.endsWith(".txt") || !archivoFusionado.endsWith(".txt")) {
                throw new ExtensionException("\n\"Error, alguno de los archivos no es .txt\"\n");
            } else {
                //Comprobar que existen
                if (!f1.exists() && !f2.exists()) {
                    throw new FicheroNoExisteException("\n\"Error, alguno de los archivos no existe\"\n");
                } else {
                    //ver si ya existe el archivo fusionado y preguntar si quiere sobreescribir
                }
            }
        } catch (ExtensionException exex) {
            System.out.println(exex.getMessage());
        } catch (FicheroNoExisteException fnex) {
            System.out.println(fnex.getMessage());
        } finally {
            sc.close();
        }

    }
}
