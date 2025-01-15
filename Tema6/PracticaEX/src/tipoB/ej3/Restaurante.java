package tipoB.ej3;

public class Restaurante {

    /*
     *  metodo estático en la clase Restaurante que
     *  calcule el precio final de un pedido dada una lista de platos y un cliente.
     */
    public static double calcularPrecioFinalCompleto(Pedido[] pedidos, Cliente cliente) {
        double total = 0;

        for (int i = 0; i < pedidos.length; i++) {
            total = total + pedidos[i].calcularTotalPrecioPedido();
        }

        return total - cliente.calcularDescuentoFidelidad();
    }
}
