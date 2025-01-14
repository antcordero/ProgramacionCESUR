public class Inventario {
    private Producto[] productos;

    public Inventario(int longitud) {
        productos = new Producto[longitud];
    }

    public void agregarProducto(Producto producto) {
        int indice = 0;
        boolean encontrado = false;
        do {
            if (productos[indice] == null) {
                productos[indice] = producto;
                encontrado = true;
            } else
                indice++;
        } while (!encontrado && indice < productos.length);
    }

    public void listarProductosPorTipo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "productoelectronico" -> {
                for (Producto producto : productos) {
                    if (producto instanceof ProductoElectronico)
                        producto.mostrarDetalles();
                }
            }
            case "productoropa" -> {
                for (Producto producto : productos) {
                    if (producto instanceof ProductoRopa)
                        producto.mostrarDetalles();
                }
            }
        }
    }

    public void listarProductos(){
        for (Producto producto : productos) {
               if (producto!=null)
                   producto.mostrarDetalles();
        }
    }

}
