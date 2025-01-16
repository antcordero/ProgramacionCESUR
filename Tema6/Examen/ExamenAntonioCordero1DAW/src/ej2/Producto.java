package ej2;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    private static double DESCUENTO_GLOBAL = 0.90; //10%


    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public static double getDescuentoGlobal() {
        return DESCUENTO_GLOBAL;
    }

    public static void setDescuentoGlobal(double descuentoGlobal) {
        DESCUENTO_GLOBAL = descuentoGlobal;
    }

    //
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadEnStock=" + cantidadEnStock +
                '}';
    }

    //Métodos
    /*
     *  comprobar categoría producto
     */
    public double precioPorCategoria(String catProducto) {
        double resultado = precio;
        switch (catProducto.toUpperCase()) {
            case "ELECTRONICA" -> resultado = resultado*0.95;
            case "ROPA" -> resultado = resultado*0.90;
            case "ALIMENTACION" -> resultado = resultado*0.85;
        }
        return resultado;
    }


}
