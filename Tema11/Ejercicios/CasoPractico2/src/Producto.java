public class Producto implements Comparable{
    private String codeProducto;
    private String nombre;
    private double precio;

    //Constructor
    public Producto(String codeProducto, String nombre, double precio) {
        this.codeProducto = codeProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodeProducto() {
        return codeProducto;
    }

    public void setCodeProducto(String codeProducto) {
        this.codeProducto = codeProducto;
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

    
    @Override
    public String toString() {
        return "\n--Producto: " + "\n" +
                "Código: " + codeProducto + "\n" +
                "Nombre: " + nombre + "\n" +
                "Precio: " + precio;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
