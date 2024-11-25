public class ProductoFresco extends Producto{
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String fechaCaducidad, String numLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

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

    @Override
    public String toString() {
        return super.toString()+" ProductoFresco{" +
                "fechaEnvasado='" + fechaEnvasado + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
