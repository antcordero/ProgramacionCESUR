package ej3;

public class Restaurante {

    private static final int IVA = 21;

    /*
     *  método estático que calcule el precio final
     *  de un pedido dada una lista de platos y un cliente.
     */
    public static double precioFinalPedido(Pedido pedido) {
        return pedido.calcularTotalPrecioPedido();
    }

    /*
     * mostrar detalles finales
     */
    public static void mostrarDetallesPedido(Pedido p) {

        for (int i=0;i<p.getNumeroPedido();i++) {
            System.out.printf("Pedido #%d\n", p.getNumeroPedido());
            System.out.printf("Cliente: %s\n", p.getCliente());
            System.out.printf("Fecha: %s\n", p.getCliente());
            System.out.printf("Precio total del pedido con IVA: %.2f€\n", precioFinalPedido(p)*IVA);
        }
    }

}
