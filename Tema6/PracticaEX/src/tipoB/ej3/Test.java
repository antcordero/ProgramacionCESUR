package tipoB.ej3;

public class Test {
    public static void main(String[] args) {
        // Crear platos
        Plato plato1 = new Plato("Ensalada", "ENTRANTE", 10.0);
        Plato plato2 = new Plato("Paella", "PLATO PRINCIPAL", 20.0);
        Plato plato3 = new Plato("Tarta", "POSTRE", 8.0);

        // Crear cliente
        Cliente c1 = new Cliente("Juan", 0.5, 10);

        // Crear varios pedidos
        Plato[] platosPedido = {plato1, plato2, plato3};
        Pedido pedido1 = new Pedido(1, platosPedido, c1, "2025-01-14");
        Pedido pedido2 = new Pedido(1, platosPedido, c1, "2025-01-14");
        Pedido pedido3 = new Pedido(1, platosPedido, c1, "2025-01-14");
        Pedido pedido4 = new Pedido(1, platosPedido, c1, "2025-01-14");
        Pedido pedido5 = new Pedido(1, platosPedido, c1, "2025-01-14");
        Pedido pedido6 = new Pedido(1, platosPedido, c1, "2025-01-14");

        Pedido[] arrayPedidos = {pedido1, pedido2, pedido3, pedido4, pedido5, pedido6};

        // Calcular precio de un pedido
        // (luego se pueden poner más pedidos, para mostrar todos los precios, recorriendo el array)
        double precioTotal = pedido1.calcularTotalPrecioPedido();
        System.out.println("Precio total del pedido 1: " + precioTotal);

        // Calcular precio usando Restaurante
        double precioRestaurante = Restaurante.calcularPrecioFinalCompleto(arrayPedidos, c1);
        System.out.println("Precio calculado por el restaurante: " + precioRestaurante);
    }
}
