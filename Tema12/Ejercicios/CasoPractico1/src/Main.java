import model.dao.InventarioDAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de Inventario - Ingrese un comando (CONNECT para comenzar)");

        //instancia del objeto de inventarioDAO para tener los métodos
        InventarioDAO inventario = new InventarioDAO();

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split(":", 2);
            String command = parts[0].toUpperCase();

            try {
                switch (command) {

                    //Çonectar a la base de datos
                    case "CONNECT":
                        inventario.connect();
                    break;

                    //Desconectar
                    case "DISCONNECT":
                        inventario.disconnect();
                    break;

                    //Salir
                    case "EXIT":
                        inventario.exit();
                    return;

                    //Mostrar
                    case "SHOW":
                        inventario.show();
                    break;

                    //Buscar por nombre
                    case "SEARCH":
                        if (parts.length > 1) {
                            inventario.search(parts[1]);
                        } else {
                            System.out.println("Formato incorrecto. Uso: SEARCH:<nombre>");
                        }
                    break;

                    //Agregar más datos
                    case "INSERT":
                        if (parts.length > 1) {
                            String[] insertParts = parts[1].split(":");
                            if (insertParts.length == 3) {
                                inventario.insert(insertParts[0], Integer.parseInt(insertParts[1]), insertParts[2]);
                            } else {
                                System.out.println("Formato incorrecto. Uso: INSERT:nombre:cantidad:comentario");
                            }
                        } else {
                            System.out.println("Formato incorrecto. Uso: INSERT:nombre:cantidad:comentario");
                        }
                        break;

                    //Actualizar
                    case "UPDATE":
                        if (parts.length > 1) {
                            String[] updateParts = parts[1].split(":");
                            if (updateParts.length == 4) {
                                inventario.update(Integer.parseInt(updateParts[0]), updateParts[1],
                                        Integer.parseInt(updateParts[2]), updateParts[3]);
                            } else {
                                System.out.println("Formato incorrecto. Uso: UPDATE:id:nombre:cantidad:comentario");
                            }
                        } else {
                            System.out.println("Formato incorrecto. Uso: UPDATE:id:nombre:cantidad:comentario");
                        }
                        break;

                    //Borrar
                    case "DELETE":
                        if (parts.length > 1) {
                            inventario.delete(Integer.parseInt(parts[1]));
                        } else {
                            System.out.println("Formato incorrecto. Uso: DELETE:id");
                        }
                        break;

                    default:
                        System.out.println("Comando no reconocido. Comandos disponibles:");
                        System.out.println("CONNECT, DISCONNECT, EXIT, SHOW, SEARCH:<nombre>,");
                        System.out.println("INSERT:nombre:cantidad:comentario, UPDATE:id:nombre:cantidad:comentario,");
                        System.out.println("DELETE:id");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
