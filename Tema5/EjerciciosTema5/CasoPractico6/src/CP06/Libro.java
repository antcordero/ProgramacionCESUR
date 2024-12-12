package CP06;

public class Libro extends Ejemplar {

    private int numPaginas;
    private Genero genero;

    //Constructor
    public Libro(String tiutlo, String autor, String anyoPublicacion, int numPaginas, Genero genero) {
        super(tiutlo, autor, anyoPublicacion);
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    //Getter - Setter
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    //toString
    @Override
    public String toString() {
        return super.toString()
                + "Nº de páginas: " + numPaginas +
                ", Género=" + genero +
                "\n";
    }

    //Método mostrar info sobreescrito
    @Override
    public void mostrarInfo() {
        System.out.println(this);
    }
}
