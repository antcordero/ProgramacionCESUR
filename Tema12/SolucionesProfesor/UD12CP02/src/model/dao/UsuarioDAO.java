package model.dao;

import model.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class UsuarioDAO {

    public Set<Usuario> cargarUsuarios(){
        Set<Usuario> resultado = new HashSet<>();
        ResultSet rs=null;
        String sql = "select * from usuarios";
        try {
            rs = AccesoBD.consultaBD(sql);
            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                Usuario usuario = new Usuario(dni, nombre, email);
                resultado.add(usuario);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }

    public int insertarUsuario(Usuario usuario){
        int res=0;
        String sql="insert into usuarios values('"+usuario.getDni()+"','"+usuario.getNombre()+"','"+usuario.getEmail()+"')";
        try{
            res = AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }
}
