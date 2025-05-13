package model.dao;

import model.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public int insertar(Usuario usuario) throws SQLException {
        String cadenaSQL;
        cadenaSQL = "INSERT INTO usuarios (nombre, clave)" +
                "VALUES ('";
        cadenaSQL += usuario.getLogin() + "','";
        cadenaSQL += usuario.getClave() + "')";
        int i = AccesoBD.actualizaBD(cadenaSQL);
        return i;
    }

    public List<Usuario> mostrar() throws SQLException {
        String cadenaSQL = "SELECT * FROM usuarios";
        ResultSet rs;
        List<Usuario> lista = new ArrayList<Usuario>();
        rs = AccesoBD.consultaBD(cadenaSQL);
        while (rs.next()) {
            Usuario nuevo = new Usuario();
            nuevo.setId(rs.getInt("idusuarios"));
            nuevo.setLogin(rs.getString("nombre"));
            nuevo.setClave(rs.getString("clave"));
            /*
             * nuevo.setId(rs.getInt(1)); nuevo.setLogin(rs.getString(2));
             * nuevo.setClave(rs.getString(3))
             */
            ;
            lista.add(nuevo);
        }
        rs.close();
        return lista;
    }

//	public List<String> mostrarTablas() throws SQLException{
//		String cadenaSQL = "SHOW TABLES";
//		ResultSet rs;
//		List<String> lista = new ArrayList<String>();
//		rs=consultaBD(cadenaSQL);
//		while (rs.next()){
//			lista.add((String)rs.getString(1));
//		}
//		rs.close();
//		return lista;
//	}

    public int actualizar(Usuario usuario) throws SQLException {
        String cadenaSQL;
        boolean correcto = false;
        int i = -1;
        cadenaSQL = "UPDATE usuarios SET ";
        if (usuario.getLogin() != null) {
            cadenaSQL += "nombre='" + usuario.getLogin() + "'";
            correcto = true;
        }
        if (usuario.getClave() != null) {
            if (correcto) cadenaSQL += ",";
            cadenaSQL += "clave='" + usuario.getClave() + "'";
            correcto = true;
        }
        if (correcto) {
            if (usuario.getId() != 0)
                cadenaSQL += " WHERE idusuarios=" + usuario.getId();
            i = AccesoBD.actualizaBD(cadenaSQL);
        }
        return i;
    }

    public int borrar(Usuario usuario) throws SQLException {
        String sql = "DELETE FROM usuarios where idusuarios=";
        sql += usuario.getId() + ";";
        int i = -1;
        i = AccesoBD.actualizaBD(sql);
        return i;
    }


}
