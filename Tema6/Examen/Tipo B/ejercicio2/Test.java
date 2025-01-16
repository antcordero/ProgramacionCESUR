package ejercicio2;

public class Test {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(3);

        inventario.agregarProducto(0, new Producto("Laptop", 1200.0, 10));
        inventario.agregarProducto(1, new Producto("Camiseta", 20.0, 50));
        inventario.agregarProducto(2, new Producto("Manzanas", 2.5, 200));

        inventario.mostrarInventario();
    }
}

