package tipoB.ej3;

import java.util.Arrays;

public class Pedido {
    private int numeroPedido;
    private Plato[] platos;
    private Cliente cliente;
    private String fechaPedido;

    //
    public Pedido(int numeroPedido, Plato[] platos, Cliente cliente, String fechaPedido) {
        this.numeroPedido = numeroPedido;
        this.platos = platos;
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
    }

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    //toString
    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", platos=" + Arrays.toString(platos) +
                ", cliente=" + cliente +
                ", fechaPedido='" + fechaPedido + '\'' +
                '}';
    }

    //Metodos

    /*
     *   Metodo que calcule el precio total del pedido considerando
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

        resultado = total - cliente.calcularDescuentoFidelidad();

        return resultado;
    }
}
