package tipoA.ej1;

public class Test {
    public static void main(String[] args) {

        Carrito carrito = new Carrito(5);

        Producto p1 = new Producto("Laptop", 1000, "ELECTRONICA");
        Producto p2 = new Producto("Camiseta", 18, "ROPA");
        Producto p3 = new Producto("Manzanas", 2.25, "ALIMENTACION");

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        carrito.mostrarDetalles();
    }
}
