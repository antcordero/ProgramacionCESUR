package tipoB.ej3;

public class Restaurante {

    /*
     *  metodo estático en la clase Restaurante que
     *  calcule el precio final de un pedido dada una lista de platos y un cliente.
     */
    public static double calcularPrecioFinalCompleto(Plato[] platos, Cliente cliente) {
        double total = 0;

        for (Plato plato : platos) {
            total += plato.calcularPrecioFinal();
        }
        
        return total - cliente.calcularDescuentoFidelidad();
    }
}
