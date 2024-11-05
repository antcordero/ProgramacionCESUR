public class Producto {

    private String nombre;
    private double precio;
    private int cantidadEnStock;

    //Constructor
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    //Getter & Setters

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

    //Métodos

    public void venderProducto(int cantidad) {
        if (this.cantidadEnStock<=0) {
            System.out.println("No hay stock");
        } else {
            this.cantidadEnStock-=cantidad;
        }
    }

    public void reabastecer(int cantidad) {
        this.cantidadEnStock+=cantidad;
    }

}
