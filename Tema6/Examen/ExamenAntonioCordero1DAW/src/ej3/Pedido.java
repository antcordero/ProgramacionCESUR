package ej3;

import java.util.Arrays;

public class Pedido {
    private int numeroPedido;
    private Plato platos [];
    private static String fecha;
    private Cliente cliente;
    private final int umbralPedidos = 10; //límite platos para el array de platos

    //constructor
    public Pedido (int numeroPedido, Plato [] platos, Cliente cliente, String fecha) {
        this.numeroPedido = numeroPedido;
        this.platos = new Plato[umbralPedidos];
        this.cliente = cliente;
        this.fecha = fecha;
    }

    //Getters - Setters
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Plato[] getPlatos() {
        return platos;
    }

    public void setPlatos(Plato[] platos) {
        this.platos = platos;
    }

    public static java.lang.String getFecha() {
        return fecha;
    }

    public void setFecha(java.lang.String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //toString
    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", platos=" + Arrays.toString(platos) +
                ", fecha='" + fecha + '\'' +
                ", cliente=" + cliente +
                '}';
    }

    //Métodos

    /*
     *   Método que calcule el precio total del pedido considerando
     *   los descuentos por categorías de plato y fidelidad del cliente.
     */
    public double calcularTotalPrecioPedido() {
        double total = 0;
        double resultado = 0;

        //recorrer array de platos que se pide un cliente
        for (int i = 0; i < platos.length; i++) {
            //precio del plato - el descuento de fidelidad
            total = total + ( platos[i].calcularPrecioFinal() );
        }

        resultado = total - cliente.descuentoFidelidad();

        return resultado;
    }
}

