public class ProductoRopa extends Producto {
    private Talla talla;
    private Material material;

    public ProductoRopa(String nombre, double precioInicial, int longitud, Talla talla, Material material) {
        super(nombre, precioInicial, longitud);
        this.talla = talla;
        this.material = material;
    }


}
