import java.util.Set;
import java.util.TreeSet;

public class GestorInventario {

    Set<Producto> productos = new TreeSet<>();

    public GestorInventario(Set<Producto> productos) {
        this.productos = productos;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "GestorInventario{" +
                "productos=" + productos +
                '}';
    }

    /*Métodos
        añadir
        eliminar
        mostrar
        buscarProducto
        mostrarPorRangoPrecios
    */

    public void agregarProducto(String codigo, String nombre, double precio) {



    }

}
