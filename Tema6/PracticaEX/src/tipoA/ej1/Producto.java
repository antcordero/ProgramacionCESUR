package tipoA.ej1;

public class Producto {
    private String nombre;
    private double precio;
    private CategoriaProducto categoriaProducto;

    public Producto(String nombre, double precio, String categoriaProducto) {
        this.nombre = nombre;
        this.precio = precio;
        comprobarCategoriaProducto(categoriaProducto);
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

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        comprobarCategoriaProducto(categoriaProducto);
    }

    private void comprobarCategoriaProducto(String categoriaProducto){
        switch (categoriaProducto.toLowerCase()){
            case "ELECTRONICA" -> this.categoriaProducto = CategoriaProducto.ELECTRONICA;
            case "ROPA" -> this.categoriaProducto = CategoriaProducto.ROPA;
            case "ALIMENTACION" -> this.categoriaProducto = CategoriaProducto.ALIMENTACION;
        }
    }

    public double aplicarDescuentoGlobal(){
        double precioDescuento = precio * 0.90;
        return precioDescuento;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoriaProducto=" + categoriaProducto +
                '}';
    }
}
