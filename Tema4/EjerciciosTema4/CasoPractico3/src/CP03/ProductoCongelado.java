package CP03;

public class ProductoCongelado extends Producto{

    private double TempCongelacion;

    public ProductoCongelado(String fechaCaducidad, String numeroLote, double tempCongelacion) {
        super(fechaCaducidad, numeroLote);
        TempCongelacion = tempCongelacion;
    }

    public double getTempCongelacion() {
        return TempCongelacion;
    }

    public void setTempCongelacion(double tempCongelacion) {
        TempCongelacion = tempCongelacion;
    }


}
