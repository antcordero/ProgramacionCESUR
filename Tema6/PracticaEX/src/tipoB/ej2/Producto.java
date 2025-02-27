package tipoB.ej2;

public class Producto {
    private String nombre;
    private CategoriaProducto categoria;
    private double precio;
    private int cantidadEnStock;
    private static final int descuentoGlobal = 10;

    //
    public Producto(String nombre, String categoria, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        comprobarCategoria(categoria);
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    //
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        comprobarCategoria(categoria);
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

    public static int getDescuentoGlobal() {
        return descuentoGlobal;
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
     *  Comprobar categoría
     */
    private void comprobarCategoria(String categoria) {
        switch (categoria.toUpperCase()) {
            case "ROPA" -> this.categoria = CategoriaProducto.ROPA;
            case "ELECTRONICA" -> this.categoria = CategoriaProducto.ELECTRONICA;
            case "ALIMENTACION" -> this.categoria = CategoriaProducto.ALIMENTACION;
        }
    }

    /*
     *  Metodo para aplicar el descuento según el tipo de producto,
     *  no el descuento Global sino el descuento por categoría
     */
    public double calcularDescuento() {
        double descuento = 0;

        switch (categoria) {
            case ROPA -> descuento = 0.90; //10%
            case ELECTRONICA -> descuento = 0.85; //85%
            case ALIMENTACION -> descuento = 0.95; //5%
            default -> descuento = 1; //sin descuento
        }

        return descuento;
    }

    /*
     *  Calcular precio final por UNIDAD
     */
    public double calcularPrecioUnidad() {
        double resultado = 0;

        if (this.cantidadEnStock>0) {
            resultado = this.precio * calcularDescuento();
        } else  {
            resultado = precio;
        }
        return resultado;
    }

    /*
     *  Metodo para mostrar info
     */
    public void mostarInfoUnidad() {

        System.out.printf("Producto: %s - Precio final por unidad: %.2f - Stock: %d\n",
                this.nombre, calcularPrecioUnidad(), this.cantidadEnStock);
    }
}
