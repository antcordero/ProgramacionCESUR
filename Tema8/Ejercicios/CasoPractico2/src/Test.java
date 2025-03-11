import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        String filePath = "misArchivos\\logs.txt";
        String ruta = "";

        Scanner sc = new Scanner(System.in);

        //Escribir la ruta y ver si existe
        System.out.print("Escriba la ruta del archivo: ");

        try {
            ruta = sc.nextLine();

            File archivo = new File(filePath);
            if (!ruta.equals(filePath)) {
                //Crea el archivo si no existe
                System.out.println("El archivo no existe, se crea.");
                archivo.createNewFile();
            }

            //Comprobar si el archivo es de texto o binario
            if (ruta.contains(".txt") || ruta.contains(".csv")) {
                //texto
            } else {
                //binario
            }


        } catch (Exception e){
            System.out.println("Error al escribir la ruta");
        } finally {
            sc.close();
        }

    }
}
