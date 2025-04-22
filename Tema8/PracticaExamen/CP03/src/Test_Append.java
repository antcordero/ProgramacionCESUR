import java.io.*;
import java.util.Scanner;

public class Test_Append {
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
            if (!archivo1.endsWith(".txt") || !archivo2.endsWith(".txt") || !archivoFusionado.endsWith(".txt")) {
                throw new ExtensionException("\n\"Error, alguno de los archivos no es .txt\"\n");
            } else {
                if (!f1.exists() || !f2.exists()) {
                    throw new FicheroNoExisteException("\n\"Error, alguno de los archivos no existe\"\n");
                } else {
                    if (f3.exists()) {
                        System.out.print("¿Quieres sobreescribirlo? (S|N): ");
                        String opcion = sc.nextLine();
                        if (opcion.equalsIgnoreCase("N")) {
                            System.out.println("Fin del programa...");
                            return;
                        }
                    }

                    // --------- PRIMER ARCHIVO ----------
                    BufferedReader br1 = null;
                    PrintWriter pw1 = null;

                    try {
                        br1 = new BufferedReader(new FileReader(archivo1));
                        pw1 = new PrintWriter(new FileWriter(archivoFusionado)); // Sobrescribe
                        String linea;
                        while ((linea = br1.readLine()) != null) {
                            pw1.println(linea);
                        }
                    } catch (IOException e) {
                        System.out.println("Error al procesar el primer archivo.");
                    } finally {
                        try {
                            if (br1 != null) br1.close();
                            if (pw1 != null) pw1.close();
                        } catch (IOException e) {
                            System.out.println("Error al cerrar el primer archivo.");
                        }
                    }

                    // --------- SEGUNDO ARCHIVO ----------
                    BufferedReader br2 = null;
                    PrintWriter pw2 = null;

                    try {
                        br2 = new BufferedReader(new FileReader(archivo2));
                        pw2 = new PrintWriter(new FileWriter(archivoFusionado, true)); // Añade al final (append)
                        String linea;
                        while ((linea = br2.readLine()) != null) {
                            pw2.println(linea);
                        }
                    } catch (IOException e) {
                        System.out.println("Error al procesar el segundo archivo.");
                    } finally {
                        try {
                            if (br2 != null) br2.close();
                            if (pw2 != null) pw2.close();
                        } catch (IOException e) {
                            System.out.println("Error al cerrar el segundo archivo.");
                        }
                    }

                    System.out.println("Fusión completada correctamente.");
                }
            }
        } catch (ExtensionException | FicheroNoExisteException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}

