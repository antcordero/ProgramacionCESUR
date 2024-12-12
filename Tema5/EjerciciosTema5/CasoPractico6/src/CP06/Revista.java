package CP06;

public class Revista extends Ejemplar {

    private int numEdicion;
    private FrecuaenciaPubl frPbl;

    //Constructor
    public Revista(String tiutlo, String autor, String anyoPublicacion, int numEdicion, FrecuaenciaPubl frPbl) {
        super(tiutlo, autor, anyoPublicacion);
        this.numEdicion = numEdicion;
        this.frPbl = frPbl;
    }

    //Getter - Setter
    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public FrecuaenciaPubl getFrPbl() {
        return frPbl;
    }

    public void setFrPbl(FrecuaenciaPubl frPbl) {
        this.frPbl = frPbl;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() +
                "Nº Edición: " + numEdicion +
                ", Frecuencia Publicación: " + frPbl +
                "\n";
    }

    //Método mostrar info
    @Override
    public void mostrarInfo() {
        System.out.println(this);
    }
}
