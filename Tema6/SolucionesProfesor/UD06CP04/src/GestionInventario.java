public class GestionInventario {
    public static void main(String[] args) {
// Crear inventario con capacidad de 10 productos
        Inventario inventario = new Inventario(10);
// Crear productos
        ProductoElectronico laptop = new ProductoElectronico("Laptop", 1500.00, 24, 24);
        ProductoElectronico smartphone = new ProductoElectronico("Smartphone", 800.00, 12, 24);
        ProductoRopa camiseta = new ProductoRopa("Camiseta", 20.00, 10, Talla.M, Material.ALGODON);
        ProductoRopa pantalones = new ProductoRopa("Pantalones", 40.00, 10, Talla.L, Material.LANA);
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
        inventario.listarProductosPorTipo("ProductoElectronico");
        System.out.println("Productos de Ropa:");
        inventario.listarProductosPorTipo("ProductoRopa");
// Mostrar total de productos creados
        System.out.println("Total de productos creados: " + Producto.obtenerTotalProductos());
    }
}
