import model.Usuario;
import model.dao.AccesoBD;
import model.dao.UsuarioDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Practica1 {

	static Connection miconn = null;

	/**
	 * @param args
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) {

		List<Usuario> listaUsuarios = null;
		//List<String> listaTablas = null;
		UsuarioDAO usrDAO = new UsuarioDAO();
		try {
			if ((miconn == null) || (miconn.isClosed()))
				miconn = AccesoBD.conectarBD();
			System.out.println("CONECTADO!!!");
			if ((miconn != null) && (!miconn.isClosed())) {
				listaUsuarios = usrDAO.mostrar();
				System.out.println("MOSTRAR!!!");
				for(Usuario elUsuario : listaUsuarios) {
					System.out.println(elUsuario);
				}
				Usuario usuario = new Usuario();
				usuario.setId(5);
				int i= usrDAO.borrar(usuario);
				System.out.println("DEVUELVE --> "+i);
				listaUsuarios = usrDAO.mostrar();
				System.out.println("MOSTRAR!!!");
				for(Usuario elUsuario : listaUsuarios) {
					System.out.println(elUsuario);
				}
			}	
		} catch (SQLException ex) {

		} catch (ClassNotFoundException ex) {

		} finally {
			try {
				if ((miconn != null) && (!miconn.isClosed())) {
					AccesoBD.cerrarBD();
					System.out.println("DESCONECTADO!!!");
				}
			} catch (SQLException ex) {

			}
		}
	}

}
