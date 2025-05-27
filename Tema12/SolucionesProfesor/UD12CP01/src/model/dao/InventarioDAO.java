package model.dao;

import model.Inventario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InventarioDAO {
    public List<Inventario> listarInventario() {
        String sql = "select * from inventario;";
        List<Inventario> lista = new ArrayList<Inventario>();
        try {
            ResultSet rs = AccesoBD.consultaBD(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int cantidad = rs.getInt("cantidad");
                String comentario = rs.getString("comentario");
                Date fecha = rs.getDate("fecha");
                Inventario inventario = new Inventario(id, nombre, cantidad, comentario, fecha);
                lista.add(inventario);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    public List<Inventario> buscarInventario(String texto) {
        String sql = "select * from inventario where nombre LIKE '%" + texto + "%';";
        List<Inventario> inventario = new ArrayList<>();
        try{
            ResultSet rs = AccesoBD.consultaBD(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int cantidad = rs.getInt("cantidad");
                String comentario = rs.getString("comentario");
                Date fecha = rs.getDate("fecha");
                Inventario inventario1 = new Inventario(id, nombre, cantidad, comentario, fecha);
                inventario.add(inventario1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return inventario;
    }

    public int insertarInventario(String nombre, int cantidad, String comentario) {
        int res=0;
        String sql="INSERT INTO inventario (nombre,cantidad,comentario) VALUES('"+nombre+"',"+cantidad+",'"+comentario+"');";
        try{
            res=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    public int eliminarInventario(int id) {
        int res=0;
        String sql="DELETE FROM inventario WHERE id="+id;
        try{
            res = AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    public int modificarInventario(int id, String nombre, int cantidad, String comentario) {
        int res=0;
        String sql="UPDATE inventario SET nombre='"+nombre+"', cantidad="+cantidad+", comentario='"+comentario+"' WHERE id="+id+";";
        try {
            res = AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }
}
