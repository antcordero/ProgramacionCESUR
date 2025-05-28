package model.dao;

import model.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;

public class ArtefactoTemporalDAO {

    //Constructor
    public ArtefactoTemporalDAO() throws SQLException, ClassNotFoundException {
        //Conectar la base de datos
        try {
            AccesoBD.conectarBD();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al conectar la base de datos");
        }
    }

    //Métodos

    /**
     * Método para insertar un nuevo objeto
     *
     * @param a
     * @return
     */
    public int insertar(ArtefactoTemporal a) {
        int resultado = 0;
        String extra = "";

        switch (a.getTipo()) {
            case "RelojSignificativo" -> {

            }
            case "ObjetoPerdido" -> {

            }
            case "FragmentoAlternativo" -> {

            }
            case "ArtefactoPercepcion" -> {

            }
        }

        //Sentencia sql
        String sql="insert into artefactos values();";
        try {
            resultado=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            System.out.println("Error al actualizar las productos");
        }

        return resultado;
    }

    /**
     * Método para borrar un objeto por su id
     * @param nombre
     * @param tipo
     */
    public int eliminar(String nombre, String tipo) {
        int res = 0;
        String tipoBorrar = ""; // Inicialización requerida

        switch (tipo.toLowerCase()) {
            case "eloj" -> tipoBorrar = "RelojSignificativo";
            case "objeto" -> tipoBorrar = "ObjetoPerdido";
            case "fragmento" -> tipoBorrar = "FragmentoAlternativo";
            case "percepcion" -> tipoBorrar = "ArtefactoPercepcion";
            default -> throw new IllegalArgumentException("Tipo no válido");
        } // Faltaba cerrar el switch aquí

        String sql = "delete from artefactos where nombre='" + nombre + "' and tipo='" + tipoBorrar + "';";

        return res;
    }

    /**
     * Método para actualizar datos de un objeto
     * @param a
     */
    public void actualizar(ArtefactoTemporal a) {

    }

    /**
     * Método que devuelve un objeto buscando por su id
     * @param id
     * @return
     */
    /*
    public ArtefactoTemporal buscarPorId(int id) {

    }
    */
    /**
     * Método para listar todos los objetos de la tabla
     * @return
     */
    public Set<ArtefactoTemporal> listarTodos(){

        Set<ArtefactoTemporal> resultado = new TreeSet<>();
        ArtefactoTemporal artefactoTemporal = null;

        String sql="select * from artefactos";

        try {
            ResultSet rs = AccesoBD.consultaBD(sql);
            while (rs.next()) {

                int id = Integer.parseInt(rs.getString("id"));
                String nombre = rs.getString("nombre");
                int anio = Integer.parseInt(rs.getString("anho_descubrimiento"));
                String nivelAcceso = rs.getString("nivel_acceso");
                String ubicacionActual = rs.getString("ubicacion_actual");
                String tipo = rs.getString("tipo");
                switch (tipo) {
                    case "RelojSignificativo" -> {
                        String extra1 = rs.getString("extra");
                        String extra2 = "";
                        //Añadir
                        artefactoTemporal = new RelojSignificativo(id, nombre, anio, nivelAcceso, ubicacionActual, extra1);
                    }
                    case "ObjetoPerdido" -> {
                        String extra1 = rs.getString("extra");
                        String extra2 = rs.getString("extra2");
                        //Añadir
                        artefactoTemporal = new ObjetoPerdido(id, nombre, anio, nivelAcceso, ubicacionActual, extra1, extra2);
                    }
                    case "FragmentoAlternativo" -> {
                        double extra1 = rs.getDouble("extra1");
                        String extra2 = rs.getString("extra2");
                        boolean riesgoParadoja = true;
                        if (extra2.equals("Sí")) {
                            riesgoParadoja = true;
                        } else if (extra2.equals("No")) {
                            riesgoParadoja = false;
                        }
                        //Añadir
                        artefactoTemporal = new FragmentoAlternativo(id, nombre, anio, nivelAcceso, ubicacionActual, extra1, riesgoParadoja);
                    }

                    case "ArtefactoPercepcion" -> {
                        int extra1 = Integer.parseInt(rs.getString("extra1"));
                        String extra2 = rs.getString("extra2");
                        artefactoTemporal = new ArtefactoPercepcion(id, nombre, anio, nivelAcceso, ubicacionActual, extra1, extra2);
                    }
                }

                //Añadir al conjunto
                resultado.add(artefactoTemporal);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar las productos");
        }


        return resultado;
    }

    /**
     * Mostrar solo los objetos que coincidan con el tipo
     * @param tipo
     * @return
     */
    /*
    public Set<ArtefactoTemporal> listarPorTipo(String tipo) {

    }
    */
    /**
     * Método para listar solo cuando exExhibible sea true
     * @return
     */
    /*
    public Set<ArtefactoTemporal> listarExhibibles() {

    }
    */


}
