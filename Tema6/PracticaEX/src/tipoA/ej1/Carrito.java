package tipoA.ej1;

public class Carrito {
    private Producto[] productos;
    private int contadorProductos;

    public Carrito(int capacidad) {
        productos = new Producto[capacidad];
        contadorProductos = 0;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getContadorProductos() {
        return contadorProductos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }

    public void agregarProducto(Producto producto){
        if (contadorProductos < productos.length){
            productos[contadorProductos] = producto;
            contadorProductos++;
        } else {
            System.out.println("No se pueden añadir más productos al sistema.");
        }
    }

    private double calcularTotalPagar(){
        double sumaTotal = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null){
                sumaTotal += productos[i].aplicarDescuentoGlobal();
            }
        }
        return sumaTotal;
    }

    public void mostrarDetalles(){
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null){
                System.out.printf("%s - Precio final: %.2f€ \n", productos[i].getNombre(), productos[i].aplicarDescuentoGlobal());
            }
        }
        System.out.printf("Total: %.2f€ " , calcularTotalPagar());
    }
}
