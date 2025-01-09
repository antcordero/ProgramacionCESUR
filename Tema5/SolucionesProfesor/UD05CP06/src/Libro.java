public class Libro extends Ejemplar{
    private int numPaginas;
    private Genero genero;

    public Libro(String titulo, String autor, String anhoPublicacion, int numPaginas, String genero) {
        super(titulo, autor, anhoPublicacion);
        this.numPaginas = numPaginas;
        comprobarGenero(genero);
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        comprobarGenero(genero);
    }

    private void comprobarGenero(String genero) {
        switch (genero.toLowerCase()) {
            case "ficcion" -> this.genero = Genero.FICCION;
            case "ciencia" -> this.genero = Genero.CIENCIA;
            default -> this.genero = Genero.NO_FICCION;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" - Libro{" +
                "numPaginas=" + numPaginas +
                ", genero=" + genero +
                '}';
    }

    public void mostrarInfo(){
        System.out.println(this.toString());
    }
}
