package model.dao;

import java.sql.*;
import java.util.Scanner;

public class InventarioDAO {
    private static Connection connection = null;
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_ja";
    private static final String USER = "root"; // Cambiar según configuración
    private static final String PASSWORD = ""; // Cambiar según configuración


    public void connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("---CONECTADO A LA BASE DE DATOS--");
        } else {
            System.out.println("Ya está conectado a la base de datos");
        }
    }

    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("---DESCONECTADO DE LA BASE DE DATOS--");
        } else {
            System.out.println("No hay conexión activa");
        }
    }


    public void exit() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public void show() throws SQLException {
        checkConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM inventario");

        System.out.println("DATOS:");
        while (rs.next()) {
            printInventoryItem(rs);
        }
    }

    public void search(String nombre) throws SQLException {
        checkConnection();
        PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM inventario WHERE nombre LIKE ?");
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

    public void insert(String nombre, int cantidad, String comentario) throws SQLException {
        checkConnection();
        PreparedStatement pstmt = connection.prepareStatement("INSERT INTO inventario (nombre, cantidad, comentario) VALUES (?, ?, ?)");
        pstmt.setString(1, nombre);
        pstmt.setInt(2, cantidad);
        pstmt.setString(3, comentario);
        int rows = pstmt.executeUpdate();
        System.out.println(rows + " fila insertada");
    }

    public void update(int id, String nombre, int cantidad, String comentario) throws SQLException {
        checkConnection();
        PreparedStatement pstmt = connection.prepareStatement("UPDATE inventario SET nombre = ?, cantidad = ?, comentario = ? WHERE id = ?");
        pstmt.setString(1, nombre);
        pstmt.setInt(2, cantidad);
        pstmt.setString(3, comentario);
        pstmt.setInt(4, id);
        int rows = pstmt.executeUpdate();
        System.out.println(rows + " fila actualizada");
    }

    public void delete(int id) throws SQLException {
        checkConnection();
        PreparedStatement pstmt = connection.prepareStatement("DELETE FROM inventario WHERE id = ?");
        pstmt.setInt(1, id);
        int rows = pstmt.executeUpdate();
        System.out.println(rows + " fila eliminada");
    }

    public void printInventoryItem(ResultSet rs) throws SQLException {
        System.out.printf("[Id:%d Nombre:%s Cantidad:%d Comentario:%s Fecha:%s]%n",
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getInt("cantidad"),
                rs.getString("comentario"),
                rs.getTimestamp("fecha").toString().substring(0, 10));
    }

    public void checkConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            throw new SQLException("No hay conexión a la base de datos. Use CONNECT primero.");
        }
    }
}
