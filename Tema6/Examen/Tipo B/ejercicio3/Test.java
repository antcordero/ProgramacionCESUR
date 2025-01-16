package ejercicio3;

public class Test {
    public static void main(String[] args) {
        // Crear platos
        Plato plato1 = new Plato("Ensalada César", CategoriaPlato.ENTRANTE, 5.0);
        Plato plato2 = new Plato("Paella Valenciana", CategoriaPlato.PLATO_PRINCIPAL, 15.0);
        Plato plato3 = new Plato("Tarta de Manzana", CategoriaPlato.POSTRE, 6.0);
        Plato plato4 = new Plato("Arroz con tomate", CategoriaPlato.PLATO_PRINCIPAL, 12.0);

        // Crear cliente
        Cliente cliente1 = new Cliente("Carlos Sánchez");
        Cliente cliente2 = new Cliente("Ana Martínez");

        // Crear un pedido con platos
        Plato[] platosPedido1 = {plato1, plato2, plato3};
        Pedido pedido1 = new Pedido(1, platosPedido1, cliente1, "10/01/2025");

        Plato[] platosPedido2 = {plato2, plato3};
        Pedido pedido2 = new Pedido(2, platosPedido2, cliente2, "14/01/2025");

        Plato[] platosPedido3 = {plato1, plato4, plato3};
        Pedido pedido3 = new Pedido(3, platosPedido3, cliente2, "15/01/2025");

        // Mostrar detalles de los pedidos
        Restaurante.mostrarDetallesPedido(pedido1);
        Restaurante.mostrarDetallesPedido(pedido2);
        Restaurante.mostrarDetallesPedido(pedido3);
    }
}

