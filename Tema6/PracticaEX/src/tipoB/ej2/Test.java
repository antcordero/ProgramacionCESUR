package tipoB.ej2;

public class Test {
    public static void main(String[] args) {

        //productos
        Producto p1 = new Producto("Laptop", "electronica", 1300, 10);
        Producto p2 = new Producto("Camiseta", "ropa", 25, 50);
        Producto p3 = new Producto("Manzanas", "alimentacion", 2.50, 200);

        //agregar a un array
        Producto[] arrayProductos = {p1, p2, p3};

        //inventario
        Inventario inventario = new Inventario(arrayProductos);

        //Resultado
        System.out.println("Resultado: ");
        p1.mostarInfoUnidad(p1);
        p2.mostarInfoUnidad(p2);
        p3.mostarInfoUnidad(p3);

        //Cálculo del precio total
        System.out.printf("Total del inventario: %.2f€\n", inventario.calcularPrecioTotal(arrayProductos));

    }
}
