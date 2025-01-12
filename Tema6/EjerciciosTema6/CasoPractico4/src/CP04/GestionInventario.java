package CP04;

import CP04.Inventario.Inventario;
import CP04.Productos.Producto;
import CP04.Productos.ProductoElectronico;
import CP04.Productos.ProductoRopa;

public class GestionInventario {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 4 - Tema 6\n");

        // Crear inventario con capacidad de 10 productos
        Inventario inventario = new Inventario(10);

        // Crear productos
        ProductoElectronico laptop = new ProductoElectronico("Laptop", 1500.00, 24);
        ProductoElectronico smartphone = new ProductoElectronico("Smartphone", 800.00, 12);
        ProductoRopa camiseta = new ProductoRopa("Camiseta", 20.00, "M", "Algodón");
        ProductoRopa pantalones = new ProductoRopa("Pantalones", 40.00, "L", "Mezclilla");

        // Agregar precios históricos
        laptop.agregarPrecio(1400.00);
        smartphone.agregarPrecio(750.00);
        camiseta.agregarPrecio(18.00);
        pantalones.agregarPrecio(38.00);
        // Agregar productos al inventario
        inventario.agregarProducto(laptop);
        inventario.agregarProducto(smartphone);
        inventario.agregarProducto(camiseta);
        inventario.agregarProducto(pantalones);
        // Listar todos los productos
        System.out.println("Todos los productos:");
        inventario.listarProductos();
        // Listar productos por tipo
        System.out.println("Productos Electrónicos:");
        inventario.listarProductosPorTipo("Electronico");
        System.out.println("Productos de Ropa:");
        inventario.listarProductosPorTipo("Ropa");
        // Mostrar total de productos creados
        System.out.println("Total de productos creados: " + Producto.obtenerTotalProductos());
    }
}
