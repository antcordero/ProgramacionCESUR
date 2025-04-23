import java.io.*;
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
                    if (!f3.exists()) {
                        throw new FicheroNoExisteException("\n\"Error, el archivo de fusión no existe\"\n");
                    } else {
                        System.out.print("¿Quieres sobreescribirlo? (S|N): ");
                        String opcion = sc.nextLine();
                        if (opcion.equals("N")) {
                            System.out.println("Fin del programa...");
                        } else {
                            //Aquí empieza el proceso del programa

                            //********Primer archivo**********
                            //Primero debe leer
                            FileReader fr1 = null;
                            BufferedReader br1 = null;

                            //escribir
                            PrintWriter pw = null;

                            try {
                                //leer el primero
                                fr1 = new FileReader("fileA.txt");
                                br1 = new BufferedReader(fr1);

                                //escribir el primero
                                pw = new PrintWriter("fusionAB.txt");

                                //proceso de escritura
                                String linea = br1.readLine();
                                while (linea != null) {
                                    pw.println(linea);
                                    linea = br1.readLine();
                                }

                            } catch (FileNotFoundException e) {
                                System.out.println("Error al leer el archivo.");
                            } catch (IOException e) {
                                System.out.println("Error al leer el archivo.");
                            } finally {
                                try {
                                    if (br1 != null) {
                                        br1.close();
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error al cerrar el archivo.");
                                }
                            }

                            //********Segundo archivo**********
                            //Primero debe leer
                            FileReader fr2 = null;
                            BufferedReader br2 = null;

                            try {
                                //leer el primero
                                fr2 = new FileReader("fileB.txt");
                                br2 = new BufferedReader(fr2);

                                //proceso de escritura
                                String linea = br2.readLine();
                                while (linea != null) {
                                    pw.println(linea);
                                    linea = br2.readLine();
                                }

                            } catch (FileNotFoundException e) {
                                System.out.println("Error al leer el archivo.");
                            } catch (IOException e) {
                                System.out.println("Error al leer el archivo.");
                            } finally {
                                try {
                                    if (br2 != null) {
                                        br2.close();
                                    }
                                    if (pw != null) {
                                        pw.close();
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error al cerrar el archivo.");
                                }
                            }
                        }
                    }
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
