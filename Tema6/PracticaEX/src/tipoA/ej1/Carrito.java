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

    public void introducirProducto(Producto producto) {
        int i = 0;
        boolean encontrado = false;
        while (i<productos.length && !encontrado) {
            if (productos[i] == null) {
                productos[i] = producto;
                encontrado = true;
            }
            else {
                i++;
            }
        }

        if (!encontrado){
            System.out.println("introducido correctamente");
        } else {
            System.out.println("no se pueden introducir mas productos");
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
