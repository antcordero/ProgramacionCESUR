package tipoB.ej2;

public class Test {
    public static void main(String[] args) {

        //productos
        Producto p1 = new Producto("Laptop", "electronica", 1300, 10);
        Producto p2 = new Producto("Camiseta", "ropa", 25, 50);
        Producto p3 = new Producto("Manzanas", "alimentacion", 2.50, 200);

        //inventario
        Inventario inventario = new Inventario(10);
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);

        //Resultado
        System.out.println("Resultado: ");
        p1.mostarInfoUnidad();
        p2.mostarInfoUnidad();
        p3.mostarInfoUnidad();

        //Cálculo del precio total
        System.out.printf("Total del inventario: %.2f€\n", inventario.calcularPrecioTotal());

    }
}
