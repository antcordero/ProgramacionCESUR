public class Producto {
    private String nombre;
    private String precio;
    private String categoria;

    public Producto(String nombre, String precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"+
                "Precio: " + precio +"\n"+
                "Categoria: " + categoria+"\n";
    }
}
