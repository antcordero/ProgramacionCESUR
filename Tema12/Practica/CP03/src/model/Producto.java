package model;

public abstract class Producto implements Vendible, Comparable<Producto> {
    private String codigo;
    private String nombre;
    private String tipo;
    private double precio;

    public Producto(String codigo, String nombre, String tipo, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + String.format("%.2f€",precio);
    }

    //Metodo abstracto getTipo() -> para coger el tipo de cada producto en la clase de cada uno
    public abstract String getTipo();

    //Comparable
    //Como es el mismo metodo para todos los productos, se pone en la clase Producto para que las demás lo hereden
    @Override
    public int compareTo(Producto o) {
        //Comparar código(String) con el del otro objeto que llega por parámetro
        //El tipo String ya tiene un criterio de ordenación
        return this.getCodigo().compareTo(o.getCodigo());
    }
}
