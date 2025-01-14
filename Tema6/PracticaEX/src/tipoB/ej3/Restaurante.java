package tipoB.ej3;

public class Restaurante {
    
    /*
     *  metodo estático en la clase Restaurante que
     *  calcule el precio final de un pedido dada una lista de platos y un cliente.
     */
    public static double calcularPrecioFinalCompleto(Plato[] platos, Cliente cliente) {
        double resultado = 0;

        double precioPlato;
        double descuentoPlato;

        for (int i = 0; i < platos.length; i++) {

            precioPlato = platos[i].getPrecio();
            descuentoPlato = platos[i].calcularPrecioFinal() + cliente.calcularDescuentoFidelidad();

            resultado = resultado + (precioPlato - descuentoPlato);;
        }

        return resultado;
    }
}
