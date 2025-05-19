import model.Inventario;
import model.dao.AccesoBD;
import model.dao.inventarioApp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Connection miconn = null;

    /**
     * @param args
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Inventario> listaUsuarios = null;
        //List<String> listaTablas = null;
        inventarioApp usrDAO = new inventarioApp();

        System.out.print("\nCaso Práctico 1 - Tema 12\n");
        System.out.print("> ");
        String opcion = sc.nextLine();

        try {

            do {
                switch (opcion) {
                    case "CONNECT":
                        if ((miconn == null) || (miconn.isClosed())) {
                            miconn = AccesoBD.conectarBD();
                            System.out.println("CONECTADO!!!");
                        }
                    break;
                }

                //Conentar


                if (opcion.equals("CONNECT")) {

                }

                //Desconectar


            } while (!opcion.equals("EXIT"));




            if ((miconn != null) && (!miconn.isClosed())) {
                listaUsuarios = usrDAO.mostrar();
                System.out.println("MOSTRAR!!!");
                for(inventario elUsuario : listaUsuarios) {
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

        sc.close();
    }
}
