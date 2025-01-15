package tipoB.ej2;

import java.util.Arrays;
import static tipoB.ej2.Producto.getDescuentoGlobal;


public class Inventario {
    private Producto[] productos;

    //

    public Inventario(int capacidad) {
        this.productos = new Producto[capacidad];
    }

    //
    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    //toString
    @Override
    public String toString() {
        return "Inventario{" +
                "productos=" + Arrays.toString(productos) +
                '}';
    }


    /*
     *  Agregar productos al array
     */
    public void agregarProducto(Producto producto) {
        int i = 0;
        boolean encontrado = false;
        while (i < productos.length && !encontrado) {
            if (productos[i]==null) {
                productos[i]=producto;
                encontrado = true;
                System.out.println("Producto: " + productos[i].getNombre() + " añadido a inventario.");
            } else {
                System.out.println("No hay espacio para más unidades.");
            }
            i++;
        }
    }

    /*
     *  Metodo que calcule el precio final de todos los productos
     *  considerando los descuentos y la cantidad en stock.
     *
     *  Los descuentos se aplican solo a productos disponibles en inventario.
     *
     *  Descuento global para todos los productos,
     *  que se aplíca al precio después de los descuentos individuales.
     */
    public double calcularPrecioTotal() {
        double total = 0;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].getCantidadEnStock()!=0) {
                total = total + (productos[i].getPrecio() * productos[i].calcularDescuento()) - getDescuentoGlobal();
            } else if (productos[i] != null && productos[i].getCantidadEnStock()==0) {
                total = total + productos[i].getPrecio() - getDescuentoGlobal() ;
            }
        }

        return total;
    }
}
