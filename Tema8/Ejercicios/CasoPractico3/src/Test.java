import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        boolean encontrado = false;
        String archivo1 = null;
        String archivo2 = null;
        String archivoFusionado = null;

        //Pedir ruta archivos y Comprobar que los archivos tengan la extensión .txt
        try {

            System.out.print("\nRuta del primer archivo: ");
            archivo1 = sc.nextLine();
            if (!archivo1.contains(".txt")) {
                throw new ExtensionException();
            }

            System.out.print("Ruta del segundo archivo: ");
            archivo2 = sc.nextLine();
            if (!archivo2.contains(".txt")) {
                throw new ExtensionException();
            }

            System.out.println("Indica la ruta del archivo fusionado: ");
            archivoFusionado = sc.nextLine();
            if (!archivoFusionado.contains(".txt")) {
                throw new ExtensionException();
            }

        } catch (ExtensionException exE){
            System.out.println(exE.getMessage());
        }

        File f1 = new File(archivo1);
        File f2 = new File(archivo2);
        File fFusionado = new File(archivoFusionado);

        //Comprobar que ambos archivos existen
        try {

            if(!f1.exists()){
                throw new NoExisteFicheroException(f1.getName());
            }

            if(!f2.exists()){
                throw new NoExisteFicheroException(f2.getName());
            }

        } catch (NoExisteFicheroException nefE) {
            System.out.println(nefE.getMessage() + " Fin del Programa.");
        }

        //Copiar y preguntar antes de copiar si la ruta del archivo fusionado ya existe

        String respuesta = "";

        if (fFusionado.exists()) {
            System.out.print("Quiere sobrescribir el contenido del archivo? (S | N): ");
            respuesta = sc.nextLine();
        }

        BufferedReader br = null;
        PrintWriter pw = null;

        //Fusionar contenido si existe: (Primer archivo)
        if(respuesta.toUpperCase().equals("S")) {

            //Primer Archivo
            try{
                br = new BufferedReader(new FileReader(f1));
                pw = new PrintWriter(archivoFusionado);
                String linea = br.readLine();

                while (linea != null) {
                    pw.println(linea);
                    linea = br.readLine();
                }

            } catch (FileNotFoundException e) {
                System.out.println("No se encontró el archivo");
            } catch (IOException e) {
                System.out.println("Error al leer el archivo");
            } finally {
                try {
                    if (br != null)
                        br.close();
                    if (pw != null)
                        pw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo");
                }
            }

            //Segundo Archivo
            try{
                br = new BufferedReader(new FileReader(f1));
                pw = new PrintWriter(archivoFusionado);
                String linea = br.readLine();

                while (linea != null) {
                    pw.println(linea);
                    linea = br.readLine();
                }

            } catch (FileNotFoundException e) {
                System.out.println("No se encontró el archivo");
            } catch (IOException e) {
                System.out.println("Error al leer el archivo");
            } finally {
                try {
                    if (br != null)
                        br.close();
                    if (pw != null)
                        pw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo");
                }
            }

        } else if (respuesta.toUpperCase().equals("N")) {
            System.out.println("\nFin del programa");
        }



        sc.close();


    }

}