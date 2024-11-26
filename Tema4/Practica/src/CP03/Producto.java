package CP03;

public class Producto {

    private String fechaCaducidad;
    private String numLote;

    //Constructor
    public Producto(String fechaCaducidad, String numLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
    }

    //Getter - Setters

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

    //toString

    @Override
    public String toString() {
        return "[ FechaCaducidad = " + fechaCaducidad + ", nºLote = " + numLote + " ]\n";
    }
}
