package CP03;

public class ProductoCongelado extends Producto {

    private double tempCongelado;

    //Constructor
    public ProductoCongelado(String fechaCaducidad, String numLote, double tempCongelado) {
        super(fechaCaducidad, numLote);
        this.tempCongelado = tempCongelado;
    }

    //Getters - Setters
    public double getTempCongelado() {
        return tempCongelado;
    }

    public void setTempCongelado(double tempCongelado) {
        this.tempCongelado = tempCongelado;
    }

    //toString
    @Override
    public String toString() {
        return "ProductoCongelado: " + " tempCongelado= " + tempCongelado + super.toString();
    }
}
