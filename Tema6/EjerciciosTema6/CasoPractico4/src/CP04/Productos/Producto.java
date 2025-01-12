package CP04.Productos;

import java.util.Arrays;

public class Producto {
    private String nombre;
    private double[] preciosHistoricos;
    private int cantidadPrecios;
    private static int totalProductos = 0;

    //Constructor
    public Producto(String nombre, double precioInicial) {
        this.nombre = nombre;
        this.preciosHistoricos = new double[10];
        this.preciosHistoricos[0] = precioInicial;
        this.cantidadPrecios = 1;
        totalProductos++;
    }

    //Getters-Setters
    public double[] getPreciosHistoricos() {
        return preciosHistoricos;
    }

    public void setPreciosHistoricos(double[] preciosHistoricos) {
        this.preciosHistoricos = preciosHistoricos;
    }

    public int getCantidadPrecios() {
        return cantidadPrecios;
    }

    public void setCantidadPrecios(int cantidadPrecios) {
        this.cantidadPrecios = cantidadPrecios;
    }

    public static int getTotalProductos() {
        return totalProductos;
    }

    public static void setTotalProductos(int totalProductos) {
        Producto.totalProductos = totalProductos;
    }

    //toString
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", preciosHistoricos=" + Arrays.toString(preciosHistoricos) +
                ", cantidadPrecios=" + cantidadPrecios +
                '}';
    }

    /*
     *  Metodo para agregar un nuevo precio al historial
     */
    public void agregarPrecio(double nuevoPrecio) {
        if (cantidadPrecios < preciosHistoricos.length) {
            this.preciosHistoricos[cantidadPrecios] = nuevoPrecio;
            cantidadPrecios++;
        } else {
            System.out.println("El historial de precios está lleno.");
        }
    }

    /*
     *  Metodo para obtener el historial de precios
     */
    public double[] obtenerPreciosHistoricos() {
        double[] copiaPrecios = new double[cantidadPrecios];
        for (int i = 0; i < cantidadPrecios; i++) {
            copiaPrecios[i] = preciosHistoricos[i];
        }
        return copiaPrecios;
    }

    /*
     *  Metodo para obtener el precio actual
     */
    public double obtenerPrecioActual() {

        return preciosHistoricos[cantidadPrecios - 1];

    }

    /*
     *  Metodo para mostrar detalles del producto
     */
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio Actual: " + obtenerPrecioActual());
        System.out.print("Historial de Precios: ");
        for (int i = 0; i < cantidadPrecios; i++) {
            System.out.print(preciosHistoricos[i] + " ");
        }
        System.out.println("\n--------------------------");
    }

    /*
     *  Metodo estático para obtener el total de productos creados
     */
    public static int obtenerTotalProductos() {
        return totalProductos;
    }

}

