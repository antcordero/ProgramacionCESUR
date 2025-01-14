package CP04.Productos;

public class ProductoElectronico extends Producto {
    private int garantia;

    //Constructor
    public ProductoElectronico(String nombre, double precioInicial, int garantia) {
        super(nombre, precioInicial);
        this.garantia = garantia;
    }

    //Getters-Setters
    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    //toString
    @Override
    public String toString() {
        return  super.toString() +
                " - ProductoElectronico{" +
                "garantia=" + garantia +
                '}';
    }

    /*Falta el método sobreescrito de mostrarDetalles, pero en esta clase con los meses de garantía*/
}
