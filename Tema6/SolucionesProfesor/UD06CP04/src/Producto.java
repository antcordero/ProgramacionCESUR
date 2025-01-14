import java.util.Arrays;

public class Producto {
    private String nombre;
    private double[] preciosHistoricos;
    private static int totalProductos;

    public Producto(String nombre, double precioInicial, int longitud) {
        this.nombre = nombre;
        preciosHistoricos = new double[longitud];
        preciosHistoricos[0] = precioInicial;
        totalProductos++;
    }

    public void agregarPrecio(double precio) {
        int indice = 1;
        boolean encontrado = false;
        do{
            if (preciosHistoricos[indice]==0) {
                encontrado = true;
                preciosHistoricos[indice]=precio;
            } else {
                indice++;
            }
        } while (!encontrado && indice < preciosHistoricos.length);
    }

    public double[] obtenerPreciosHistoricos() {
        return preciosHistoricos;
    }

    public double precioActual() {
        int indice = 0;
        boolean encontrado = false;
        double resultado = 0;
        do{
            if (preciosHistoricos[indice]==0) {
                encontrado = true;
            } else
                indice++;
        } while (!encontrado && indice < preciosHistoricos.length);
        if (encontrado) {
            resultado = preciosHistoricos[indice-1];
        } else {
            resultado = preciosHistoricos[preciosHistoricos.length-1];
        }
        return resultado;
    }

    public void mostrarDetalles() {
        System.out.printf("Nombre: %s - Precio Actual: %.2f€ - %s%n", nombre, precioActual(), Arrays.toString(preciosHistoricos) );
    }

    public static double obtenerTotalProductos() {
        return totalProductos;
    }
}
