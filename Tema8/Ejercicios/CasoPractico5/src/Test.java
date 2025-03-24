import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        File f1 = new File("src/archivo_original.txt");
        File f2 = new File("src/archivo_modificado.txt");

        //Contador para las líneas
        int contLineas = 1;
        int contTotalArchivo1 = 0;
        int contTotalArchivo2 = 0;

        try {
            //Leer los dos archivos

            //Para el archivo 1
            FileReader fr1 = null;
            BufferedReader br1 = null;

            //Para el archivo 2
            FileReader fr2 = null;
            BufferedReader br2 = null;

            fr1 = new FileReader(f1);
            br1 = new BufferedReader(fr1);
            fr2 = new FileReader(f2);
            br2 = new BufferedReader(fr2);

            PrintWriter pw1 = new PrintWriter("f1");
            PrintWriter pw2 = new PrintWriter("f2");

            boolean diferenciasEncontradas = false;

            String linea1 = "";
            String linea2 = "";

            while (linea1 != null && linea2 != null) {
                if (!linea1.equals(linea2)) {
                    System.out.printf("\n⚠️ Diferencia en la linea %d: \n", + contLineas);
                    //Mostrar errores
                    /*
                    System.out.print("🚩 Archivo 1: ");
                    pw1.println();
                    System.out.println("🚩 Archivo 2: ");
                    pw2.println();
                    */

                    System.out.println("🚩 Archivo 1: " + linea1);
                    System.out.println("🚩 Archivo 2: " + linea2);

                    diferenciasEncontradas = true;

                } else {
                    br1.readLine();
                    contTotalArchivo1++;
                    br2.readLine();
                    contTotalArchivo2++;
                }

                //Avanzar ambas líneas
                linea1 = br1.readLine();
                linea2 = br2.readLine();

                contLineas++;
            }

            if (!diferenciasEncontradas && contTotalArchivo1==contTotalArchivo2) {
                System.out.println("✅ Los archivos son idénticos");
            } else if (!diferenciasEncontradas && contTotalArchivo1!=contTotalArchivo2) {
                System.out.println("⚠️ Los archivos no tienen el mismo número de líneas.");
            }

            if (contTotalArchivo1 > contTotalArchivo2) {
                System.out.print("El archivo 1 tiene más líneas\n");
            } else if (contTotalArchivo2 > contTotalArchivo1) {
                System.out.print("El arcvhivo 2 tiene más líneas\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado. " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

        sc.close();

    }
}

/**
 * Solución de la IA:
 *
 *
 *
 * import java.io.*;
 * import java.util.ArrayList;
 * import java.util.List;
 *
 * public class Test {
 *     public static void main(String[] args) {
 *         File f1 = new File("archivo_original.txt");  // Ruta relativa directa
 *         File f2 = new File("archivo_modificado.txt");
 *
 *         try (BufferedReader br1 = new BufferedReader(new FileReader(f1));
 *              BufferedReader br2 = new BufferedReader(new FileReader(f2))) {
 *
 *             int contLineas = 1;
 *             String linea1 = br1.readLine();
 *             String linea2 = br2.readLine();
 *             boolean diferenciasEncontradas = false;
 *
 *             while (linea1 != null || linea2 != null) {
 *                 if (linea1 == null) {
 *                     System.out.printf("⚠️ Archivo 2 tiene línea extra en posición %d: %s%n", contLineas, linea2);
 *                     diferenciasEncontradas = true;
 *                 } else if (linea2 == null) {
 *                     System.out.printf("⚠️ Archivo 1 tiene línea extra en posición %d: %s%n", contLineas, linea1);
 *                     diferenciasEncontradas = true;
 *                 } else if (!linea1.equals(linea2)) {
 *                     System.out.printf("⚠️ Diferencia en línea %d:%n", contLineas);
 *                     System.out.println("  Archivo 1: " + linea1);
 *                     System.out.println("  Archivo 2: " + linea2);
 *                     diferenciasEncontradas = true;
 *                 }
 *
 *                 // Avanza ambas líneas
 *                 linea1 = br1.readLine();
 *                 linea2 = br2.readLine();
 *                 contLineas++;
 *             }
 *
 *             if (!diferenciasEncontradas) {
 *                 System.out.println("✅ Los archivos son idénticos");
 *             }
 *
 *         } catch (FileNotFoundException e) {
 *             System.out.println("Error: Archivo no encontrado. Verifica las rutas.");
 *         } catch (IOException e) {
 *             System.out.println("Error de lectura: " + e.getMessage());
 *         }
 *     }
 * }
 */
