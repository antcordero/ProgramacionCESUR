package CP03;

public class ProductoFresco extends Producto{

    private String fechaEnvasado;
    private String pais;

    public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String pais) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.pais = pais;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //Métodos
    @Override
    public String toString() {
        return "Fecha Caducidad: " + getFechaCaducidad() +
                "\nNº Lote: " + getNumeroLote() +
                "\nFecha Enavasado: " + this.fechaEnvasado +
                "\nPaís de procedencia: " + this.pais +
                "\n";
    }

}
