public class ProductoElectronico extends Producto{
    private int garantia;

    public ProductoElectronico(String nombre, double precioInicial, int longitud, int garantia) {
        super(nombre, precioInicial, longitud);
        this.garantia = garantia;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.printf(" - Meses de garantía: %d meses%n", garantia);
    }
}
