package tipoB.ej3;

public class Test {
    public static void main(String[] args) {
        // Crear platos
        Plato plato1 = new Plato("Ensalada", "ENTRANTE", 10.0);
        Plato plato2 = new Plato("Paella", "PLATO PRINCIPAL", 20.0);
        Plato plato3 = new Plato("Tarta", "POSTRE", 8.0);

        // Crear cliente
        Cliente cliente = new Cliente("Juan", 0.5, 10);

        // Crear un pedido
        Plato[] platosPedido = {plato1, plato2, plato3};
        Pedido pedido = new Pedido(1, platosPedido, cliente, "2025-01-14");

        // Calcular precio del pedido
        double precioTotal = pedido.calcularTotalPrecioPedido();
        System.out.println("Precio total del pedido: " + precioTotal);

        // Calcular precio usando Restaurante
        double precioRestaurante = Restaurante.calcularPrecioFinalCompleto(platosPedido, cliente);
        System.out.println("Precio calculado por el restaurante: " + precioRestaurante);
    }
}
