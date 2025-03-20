import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        File f1 = new File(".\\archivo_original.txt");
        File f2 = new File(".\\archivo_modificado.txt");

        //Leer los dos archivos

        //Para el archivo 1
        FileReader fr1 = null;
        BufferedReader br1 = null;

        //Para el archivo 2
        FileReader fr2 = null;
        BufferedReader br2 = null;

        //Contador para las líneas
        int contLineas = 1;
        int contTotalArchivo1 = 0;
        int contTotalArchivo2 = 0;

        try {
            fr1 = new FileReader(f1);
            br1 = new BufferedReader(fr1);
            fr2 = new FileReader(f2);
            br2 = new BufferedReader(fr2);

            PrintWriter pw1 = new PrintWriter("f1");
            PrintWriter pw2 = new PrintWriter("f2");

            String linea1 = br1.readLine();
            String linea2 = br2.readLine();

            while (linea1 != null && linea2 != null) {
                if (!linea1.equals(linea2)) {
                    System.out.printf("⚠️ Diferencia en la linea %d: ", + contLineas);
                    //Mostrar errores
                    System.out.print("Archivo 1: ");
                    pw1.println();
                    System.out.println("Archivo 2: ");
                    pw2.println();
                } else {
                    br1.readLine();
                    contTotalArchivo1++;
                    br2.readLine();
                    contTotalArchivo2++;
                }
                contLineas++;
            }

            if (contTotalArchivo1 > contTotalArchivo2) {
                System.out.printf("El archivo 1 tiene más líneas\n");
            } else if (contTotalArchivo2 > contTotalArchivo1) {
                System.out.printf("El arcvhivo 2 tiene más líneas\n");
            }


        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

        sc.close();

    }
}
