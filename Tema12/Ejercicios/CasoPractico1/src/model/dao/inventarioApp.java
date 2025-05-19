package model.dao;

import java.sql.*;
import java.util.Scanner;

public class inventarioApp {
    private static Connection connection = null;
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_ja";
    private static final String USER = "root"; // Cambiar según configuración
    private static final String PASSWORD = ""; // Cambiar según configuración

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de Inventario - Ingrese un comando (CONNECT para comenzar)");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            String[] parts = input.split(":", 2);
            String command = parts[0].toUpperCase();

            try {
                switch (command) {
                    case "CONNECT":
                        connect();
                        break;
                    case "DISCONNECT":
                        disconnect();
                        break;
                    case "EXIT":
                        exit();
                        return;
                    case "SHOW":
                        show();
                        break;
                    case "SEARCH":
                        if (parts.length > 1) {
                            search(parts[1]);
                        } else {
                            System.out.println("Formato incorrecto. Uso: SEARCH:<nombre>");
                        }
                        break;
                    case "INSERT":
                        if (parts.length > 1) {
                            String[] insertParts = parts[1].split(":");
                            if (insertParts.length == 3) {
                                insert(insertParts[0], Integer.parseInt(insertParts[1]), insertParts[2]);
                            } else {
                                System.out.println("Formato incorrecto. Uso: INSERT:nombre:cantidad:comentario");
                            }
                        } else {
                            System.out.println("Formato incorrecto. Uso: INSERT:nombre:cantidad:comentario");
                        }
                        break;
                    case "UPDATE":
                        if (parts.length > 1) {
                            String[] updateParts = parts[1].split(":");
                            if (updateParts.length == 4) {
                                update(Integer.parseInt(updateParts[0]), updateParts[1],
                                        Integer.parseInt(updateParts[2]), updateParts[3]);
                            } else {
                                System.out.println("Formato incorrecto. Uso: UPDATE:id:nombre:cantidad:comentario");
                            }
                        } else {
                            System.out.println("Formato incorrecto. Uso: UPDATE:id:nombre:cantidad:comentario");
                        }
                        break;
                    case "DELETE":
                        if (parts.length > 1) {
                            delete(Integer.parseInt(parts[1]));
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

    private static void connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("---CONECTADO A LA BASE DE DATOS--");
        } else {
            System.out.println("Ya está conectado a la base de datos");
        }
    }

    private static void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("---DESCONECTADO DE LA BASE DE DATOS--");
        } else {
            System.out.println("No hay conexión activa");
        }
    }

    private static void exit() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
        System.out.println("---FINALIZACIÓN DEL PROGRAMA--");
    }

    private static void show() throws SQLException {
        checkConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM inventario");

        System.out.println("DATOS:");
        while (rs.next()) {
            printInventoryItem(rs);
        }
    }

    private static void search(String nombre) throws SQLException {
        checkConnection();
        PreparedStatement pstmt = connection.prepareStatement(
                "SELECT * FROM inventario WHERE nombre LIKE ?");
        pstmt.setString(1, "%" + nombre + "%");
        ResultSet rs = pstmt.executeQuery();

        if (!rs.isBeforeFirst()) {
            System.out.println("No existen referencias del objeto.");
        } else {
            while (rs.next()) {
                printInventoryItem(rs);
            }
        }
    }

    private static void insert(String nombre, int cantidad, String comentario) throws SQLException {
        checkConnection();
        PreparedStatement pstmt = connection.prepareStatement(
                "INSERT INTO inventario (nombre, cantidad, comentario) VALUES (?, ?, ?)");
        pstmt.setString(1, nombre);
        pstmt.setInt(2, cantidad);
        pstmt.setString(3, comentario);
        int rows = pstmt.executeUpdate();
        System.out.println(rows + " fila insertada");
    }

    private static void update(int id, String nombre, int cantidad, String comentario) throws SQLException {
        checkConnection();
        PreparedStatement pstmt = connection.prepareStatement(
                "UPDATE inventario SET nombre = ?, cantidad = ?, comentario = ? WHERE id = ?");
        pstmt.setString(1, nombre);
        pstmt.setInt(2, cantidad);
        pstmt.setString(3, comentario);
        pstmt.setInt(4, id);
        int rows = pstmt.executeUpdate();
        System.out.println(rows + " fila actualizada");
    }

    private static void delete(int id) throws SQLException {
        checkConnection();
        PreparedStatement pstmt = connection.prepareStatement(
                "DELETE FROM inventario WHERE id = ?");
        pstmt.setInt(1, id);
        int rows = pstmt.executeUpdate();
        System.out.println(rows + " fila eliminada");
    }

    private static void printInventoryItem(ResultSet rs) throws SQLException {
        System.out.printf("[Id:%d Nombre:%s Cantidad:%d Comentario:%s Fecha:%s]%n",
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getInt("cantidad"),
                rs.getString("comentario"),
                rs.getTimestamp("fecha").toString().substring(0, 10));
    }

    private static void checkConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            throw new SQLException("No hay conexión a la base de datos. Use CONNECT primero.");
        }
    }
}
