package CP03;

public class ProductoCongelado extends Producto{

    private double TempCongelacion;

    public ProductoCongelado(String fechaCaducidad, String numeroLote, double tempCongelacion) {
        super(fechaCaducidad, numeroLote);
        TempCongelacion = tempCongelacion;
    }

    public ProductoCongelado() {

    }

    public double getTempCongelacion() {
        return TempCongelacion;
    }

    public void setTempCongelacion(double tempCongelacion) {
        TempCongelacion = tempCongelacion;
    }

    //Métodos
    @Override
    public String toString() {
        return "Fecha Caducidad: " + super.getFechaCaducidad() +
                "\nNº Lote: " + super.getNumeroLote() +
                "\nTemperatura Congelación: " + this.TempCongelacion + "ºC\n";
    }
}
