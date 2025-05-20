package model.dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBD {
    public static Connection conn;

    public static Connection conectarBD() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost/proyecto_ja?"
                + "useSSL=false&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","20011998");
        return conn;
    }

    public static void cerrarBD() throws SQLException{
        conn.close();
    }

    public static ResultSet consultaBD(String sql) throws SQLException{
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        return rs;
    }

    public static int actualizaBD(String sql) throws SQLException{
        Statement stmt=conn.createStatement();
        int i=stmt.executeUpdate(sql);
        return i;
    }
}
