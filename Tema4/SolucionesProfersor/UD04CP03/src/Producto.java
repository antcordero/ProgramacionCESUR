public class Producto {
    private String fechaCaducidad;
    private String numLote;

    public Producto(String fechaCaducidad, String numLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                ", numLote='" + numLote + '\'' +
                '}';
    }
}
