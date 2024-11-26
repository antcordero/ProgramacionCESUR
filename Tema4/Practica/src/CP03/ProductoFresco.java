package CP03;

public class ProductoFresco extends Producto {

    private String fechaEnvasado;
    private String paisOrigen;

    //Constructor
    public ProductoFresco(String fechaCaducidad, String numLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    //Getters - Setters
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    //toString
    @Override
    public String toString() {
        return "ProductoFresco: " + " FechaEnvasado = " + fechaEnvasado + ", paisOrigen = "
                + paisOrigen + super.toString();
    }
}
