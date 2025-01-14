package tipoB.ej3;

import java.util.Arrays;

public final class Cliente {
    private String nombre;
    private Pedido[] pedidos;
    private int contPedidos = 0;
    private final double descuentoFidelidad; //entiendo que este descuento es por plato pedido a ese cliente solo
    private final int umbralPedidos; //máximo de platos que puede pedir ese cliente en un mes

    //
    public Cliente(String nombre, double descuentoFidelidad, int umbralPedidos) {
        this.nombre = nombre;
        this.pedidos = new Pedido[umbralPedidos];
        this.contPedidos++;
        this.descuentoFidelidad = descuentoFidelidad;
        this.umbralPedidos = umbralPedidos;
    }

    //
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(int umbralPedidos) {
        this.pedidos = new Pedido[umbralPedidos];
    }

    public double getDescuentoFidelidad() {
        return descuentoFidelidad;
    }

    public int getUmbralPedidos() {
        return umbralPedidos;
    }

    //
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", pedidos=" + Arrays.toString(pedidos) +
                ", contPedidos=" + contPedidos +
                ", descuentoFidelidad=" + descuentoFidelidad +
                ", umbralPedidos=" + umbralPedidos +
                '}';
    }

    //Métodos

    /*
     *  metodo que calcule el descuento por fidelidad si tiene más de 5 pedidos en el mes
     */
    public double calcularDescuentoFidelidad() {
        double resultado = 0;
        if (this.contPedidos > 5) {
            resultado = this.contPedidos * this.descuentoFidelidad;
        }
        return resultado;
    }
}
