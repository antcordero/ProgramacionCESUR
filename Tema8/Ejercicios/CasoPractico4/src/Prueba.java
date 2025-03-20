import java.io.*;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion = "0";
        while (!opcion.equals("5")) {
            System.out.print("---Gestión de Contactos---\n" + "1. Agregar contacto\n" + "2. Listar Contactos\n" + "3. Buscar Contacto\n" + "4. Eliminar Contacto\n" + "5. Salir\n" + "Seleccione un opción: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1" -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String numero = sc.nextLine();
                    System.out.print("Correo electrónico: ");
                    String mail = sc.nextLine();
                    String contacto = nombre + "," + numero + "," + mail;
                    FileWriter fw = null;
                    PrintWriter pw = null;
                    try {
                        fw = new FileWriter("misArchivos/contacto.txt", true);
                        pw = new PrintWriter(fw);
                        pw.println(contacto);
                        System.out.println("Usuario agregado con éxito");
                    } catch (IOException e) {
                        System.out.println("Hubo un error al escribir en el archivo");
                    } finally {
                        try {
                            if (fw != null) {
                                fw.close();
                            }
                            if (pw != null) {
                                pw.close();
                            }
                        } catch (IOException e) {
                            System.out.println("No se ha podido cerrar el archivo");
                        }
                    }
                }
                case "2" -> {
                    FileReader fr = null;
                    BufferedReader br = null;
                    try {
                        fr = new FileReader("misArchivos/contacto.txt");
                        br = new BufferedReader(fr);
                        String linea = br.readLine();
                        System.out.println("---Lista de contactos---");
                        System.out.println();
                        while (linea != null) {
                            String[] contacto = linea.split(",");
                            System.out.println("Nombre: " + contacto[0] + " Teléfono: " + contacto[1] + " Correo electrónico: " + contacto[2]);
                            linea = br.readLine();
                        }
                        System.out.println();
                    } catch (FileNotFoundException e) {
                        System.out.println("No se ha podido encontrar el archivo");
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo");
                    } finally {
                        try {
                            if (fr != null) {
                                fr.close();
                            }
                            if (br != null) {
                                br.close();
                            }
                        } catch (IOException e) {
                            System.out.println("No se ha podido cerrar el archivo");
                        }
                    }
                }
                case "3" -> {
                    System.out.print("Ingrese el nombre a buscar: ");
                    String buscar = sc.nextLine();
                    FileReader fr = null;
                    BufferedReader br = null;
                    try {
                        fr = new FileReader("misArchivos/contacto.txt");
                        br = new BufferedReader(fr);
                        String linea = br.readLine();
                        while (linea != null) {
                            String[] contacto = linea.split(",");
                            if (contacto[0].equalsIgnoreCase(buscar)) {
                                System.out.println("Nombre: " + contacto[0] + " Teléfono: " + contacto[1] + " Correo electrónico: " + contacto[2]);
                            }
                            linea = br.readLine();
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("No se ha podido encontrar el archivo");
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo");
                    } finally {
                        try {
                            if (fr != null) {
                                fr.close();
                            }
                            if (br != null) {
                                br.close();
                            }
                        } catch (IOException e) {
                            System.out.println("No se ha podido cerrar el archivo");
                        }
                    }
                }
                case "4" -> {
                    System.out.print("Ingrese el contacto que desea eliminar: ");
                    String buscar = sc.nextLine();
                    FileReader fr = null;
                    BufferedReader br = null;
                    try {
                        fr = new FileReader("misArchivos/contacto.txt");
                        br = new BufferedReader(fr);
                        String linea = br.readLine();
                        while (linea != null) {
                            String[] contacto = linea.split(",");
                            if (contacto[0].equalsIgnoreCase(buscar)) {
                                contacto[0] = "";
                                contacto[1] = "";
                                contacto[2] = "";
                            }
                            linea = br.readLine();
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("No se ha podio encontrar el archivo");
                    } catch (IOException e) {
                        System.out.println("Error al leer el archivo");
                    }
                }
            }
        }
    }
}
