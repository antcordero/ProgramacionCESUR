package ej3;

import java.util.Arrays;

public final class Cliente {
    private String nombre;
    private Pedido pedidos [];
    private int cont = 0;
    private double descuentoFidelidad = 0;

    //Constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
        pedidos = new Pedido[cont];
        cont++;
    }

    //Getters - Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }

    public int getContador() {
        return cont;
    }

    public void setContador(int contador) {
        this.cont = contador;
    }

    //toString
    @Override
    public String toString() {
        return ": " + nombre;
    }


    //Métodos

    /*
     *  método para aplicar el descuento por fidelidad
     */
    public double descuentoFidelidad() {

        //dependiendo del mes con la fecha que se comparte de la calse pedido
        /*
         *  entiendo que si la fecha sigue el mismo formato, el valor del mes está
         *  en las posiciones 3 y 4
         */
        String mesFecha = "";
        mesFecha += Pedido.getFecha().indexOf(3) + Pedido.getFecha().indexOf(4);

        //comprobar mes
        switch (mesFecha) {
            case "01" -> mesFecha = "enero";
            case "02" -> mesFecha = "febrero";
            case "03" -> mesFecha = "marzo";
            case "04" -> mesFecha = "abril";
            case "05" -> mesFecha = "mayo";
            case "06" -> mesFecha = "junio";
            case "07" -> mesFecha = "julio";
            case "08" -> mesFecha = "agosto";
            case "09" -> mesFecha = "septiembre";
            case "10" -> mesFecha = "octubre";
            case "11" -> mesFecha = "nomviembre";
            case "12" -> mesFecha = "diciembre";
        }

        /*
        int contadorPedidos = 0;
        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i] != null) {
                contadorPedidos++;
            }
        }
        */

        //pruebo con enero como en el main
        if (pedidos.length>5 && mesFecha.equals("enero")) {
            this.descuentoFidelidad = 0.15;
        }
        return this.descuentoFidelidad;
    }



}
