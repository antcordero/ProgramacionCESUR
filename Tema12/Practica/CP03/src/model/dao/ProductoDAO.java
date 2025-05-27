package model.dao;

import model.Producto;
import model.ProductoAlimenticio;
import model.ProductoElectronico;
import model.ProductoHigiene;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.TreeSet;

//Esta clase tendrá todas las opciones disponibles del menú del main como métodos para operar
//Como no hay productos duplicados ni nada para ordenar se puede usar un Set (conjunto) -> TreeSet
//TreeSet obliga a tener una interfaz Comparable en Producto (sino se quiere hacer eso se usa HasSet)
public class ProductoDAO {

    //Constructor
    public ProductoDAO() {
        //Conexión a la base de datos
        try {
            AccesoBD.conectarBD();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al conectar la base de datos");
        }

    }

    //Metodo para devolver (mostrar) todos los productos - metodo que devuelva un Set de Productos
    public Set<Producto> getConjuntoProductos() {
        //Definir el conjunto de resultados que se va a devolver después
        Set<Producto> resultado = new TreeSet<>();
        //Definir sentencia SQL - nombre de la tabla
        String sql="select * from productos";

        //con Statement y ResultSet
        try {
            //Llamar a consulta BD que devuelve un ResultSet
            ResultSet rs = AccesoBD.consultaBD(sql);
            //procesar ResultSet
            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                String tipo = rs.getString("tipo");
                String extra = rs.getString("extra");
                //Según el tipo del objeto Producto - interpretar el valor de la columna extra
                //Por último con ya todos interpretados crear el objeto y añadirlo al conjunto
                Producto producto = null; //Por ser null no se puede instanciar
                switch (tipo.toLowerCase()) {
                    //extra como fecha
                    case "alimenticio":
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        LocalDate fechaCaducidad = LocalDate.parse(extra, dtf);
                        java.sql.Date fecha = Date.valueOf(fechaCaducidad); //se parsea porque es tipo String
                        producto = new ProductoAlimenticio(codigo, nombre, tipo, precio, fecha);
                        break;

                    //extra como int
                    case "electronico":
                        int garantia = Integer.parseInt(extra);
                        producto = new ProductoElectronico(codigo, nombre, tipo, precio, garantia);
                        break;

                    //extra como boolean
                    case "higiene":
                        boolean esDesinfectante = Boolean.parseBoolean(extra);
                        producto = new ProductoHigiene(codigo, nombre, tipo, precio, esDesinfectante);
                        break;
                }

                //Almacenar el objeto producto en el conjunto
                //Una vez todos los datos interpretados y el objeto creado se añade el objeto producto al conjunto
                resultado.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar las productos");
        }

        return resultado;
    }

    public int insertarProducto(Producto p) {
        int resultado = 0; //Número de líneas que devolverá la sentencia sql
        String extra = "";

        //extraer el campo extra porque se pasa un producto genérico
        switch (p.getTipo().toLowerCase()) {
            case "alimenticio":
                extra = ((ProductoAlimenticio)p).getFechaCaducidad().toString();
                break;
            case "electronico":
                extra = ((ProductoElectronico)p).getGarantiaMeses()+"";
                break;
            case "higiene":
                extra = ((ProductoHigiene)p).isEsDesinfectante()+"";
                break;
        }

        //Sentencia sql
        String sql="insert into productos values('"+p.getCodigo()+"','"+p.getNombre()+"',"+p.getPrecio()+",'"+p.getTipo()+"','"+extra+"');";
        try {
            resultado=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            System.out.println("Error al actualizar las productos");
        }

        return resultado;
    }

    public int borrarProducto(String codigo) {
        int res=0;
        String sql="delete from productos where codigo='"+codigo+"';";
        try{
            res=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            System.out.println("Error al actualizar las productos");
        }
        return res;
    }
}
