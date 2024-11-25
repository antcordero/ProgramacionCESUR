public class ProductoCongelado extends Producto {
    private double temperaturaCongelacion;

    public ProductoCongelado(String fechaCaducidad, String numLote, double temperaturaCongelacion) {
        super(fechaCaducidad, numLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    public double getTemperaturaCongelacion() {
        return temperaturaCongelacion;
    }

    public void setTemperaturaCongelacion(double temperaturaCongelacion) {
        this.temperaturaCongelacion = temperaturaCongelacion;
    }

    @Override
    public String toString() {
        return super.toString()+" ProductoCongelado{" +
                "temperaturaCongelacion=" + temperaturaCongelacion +
                '}';
    }
}
