import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {


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

            System.out.print("Indica la ruta del archivo fusionado: ");
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

        try {
            if (fFusionado.exists()) {
                System.out.print("Quiere sobrescribir el contenido del archivo? (S | N): ");
                respuesta = sc.nextLine();
            }
        }catch (IllegalArgumentException ie) {
            System.out.println("ERROR en el input." + ie.getMessage());
        }


        BufferedReader br1 = null;
        BufferedReader br2 = null;

        FileWriter pw = new FileWriter("A_B.txt");
        BufferedWriter escritor = new BufferedWriter(pw);


        //Fusionar contenido si existe: (Primer archivo)
        if(respuesta.toUpperCase().equals("S")) {

            //Primer Archivo
            try{
                br1 = new BufferedReader(new FileReader(f1));
                String linea = br1.readLine();

                while (linea != null) {
                    linea = br1.readLine();
                }

            } catch (FileNotFoundException e) {
                System.out.println("No se encontró el archivo");
            } catch (IOException e) {
                System.out.println("Error al leer el archivo");
            } finally {
                try {
                    if (br1 != null)
                        br1.close();
                    if (pw != null)
                        pw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo");
                }
            }

            //Segundo Archivo
            try {
                br2 = new BufferedReader(new FileReader(f2));
                String linea = br2.readLine();

                while (linea != null) {
                    linea = br2.readLine();
                }

            } catch (FileNotFoundException e) {
                System.out.println("No se encontró el archivo");
            } catch (IOException e) {
                System.out.println("Error al leer el archivo");
            } finally {
                try {
                    if (br2 != null)
                        br2.close();
                    if (pw != null)
                        pw.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo");
                }
            }


            System.out.println("\nContenido de los archivos copiados en: " + fFusionado.getPath());
            System.out.println("\nContenido de los archivos copiados en (getParent): " + fFusionado.getParent());
            System.out.println("\nContenido de los archivos copiados en (getParentFile): " + fFusionado.getParentFile());

        } else if (respuesta.toUpperCase().equals("N")) {
            System.out.println("\nFin del programa");
        }

        sc.close();

    }
}