package CP04.Inventario;

import CP04.Productos.Producto;
import CP04.Productos.ProductoElectronico;
import CP04.Productos.ProductoRopa;

import java.util.Arrays;

public class Inventario {
    private Producto[] productos;
    private int cantidadProductos;

    //Constructor
    public Inventario(int capacidad) {
        this.productos = new Producto[capacidad];
        this.cantidadProductos = 0;
    }

    //Getters - Setters

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    //toString
    @Override
    public String toString() {
        return "Inventario{" +
                "productos=" + Arrays.toString(productos) +
                ", cantidadProductos=" + cantidadProductos +
                '}';
    }


    //Métodos

    /*
     *  Agregar
     */
    public void agregarProducto(Producto producto) {
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
        } else {
            System.out.println("El inventario está lleno.");
        }
    }

    /*
     *  Listar
     */
    public void listarProductos() {
        for (int i = 0; i < cantidadProductos; i++) {
            productos[i].mostrarDetalles();
            System.out.println("-------------------");
        }
    }

    /*
     *  Listar por tipo
     */
    public void listarProductosPorTipo(String tipo) {
        for (int i = 0; i < cantidadProductos; i++) {
            if ((tipo.equalsIgnoreCase("electrónico") && productos[i] instanceof ProductoElectronico) ||
                    (tipo.equalsIgnoreCase("ropa") && productos[i] instanceof ProductoRopa)) {
                productos[i].mostrarDetalles();
                System.out.println("-------------------");
            }
        }
    }
}
