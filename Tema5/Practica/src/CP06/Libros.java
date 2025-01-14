package CP06;

public class Libros extends Ejemplar {
    private int numPaginas;
    private GeneroLibro genero;

    public Libros(String titulo, String autor, String anioPublicacion, int numPaginas, String genero) {
        super(titulo, autor, anioPublicacion);
        this.numPaginas = numPaginas;
        comprobarGeneroLibro(genero);
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public GeneroLibro getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        comprobarGeneroLibro(genero);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Libros{" +
                "numPaginas=" + numPaginas +
                ", genero=" + genero +
                '}';
    }

    //Métodos
    private void comprobarGeneroLibro(String genero) {
        switch (genero.toLowerCase()) {
            case "ficción" -> this.genero = GeneroLibro.FICCION;
            case "ficcion" -> this.genero = GeneroLibro.FICCION;
            case "ciencia" -> this.genero = GeneroLibro.CIENCIA;
            case "drama" -> this.genero = GeneroLibro.DRAMA;
            case "historico" -> this.genero = GeneroLibro.HISTORICO;
            case "histórico" -> this.genero = GeneroLibro.HISTORICO;
            default -> this.genero = GeneroLibro.SINGENERO;
        }
    }

    //mostrarInfo sobreEscrito
    @Override
    public void mostrarInfo() {
        System.out.print(super.toString());
        System.out.printf("[Libro] Número de páginas: %d - ", this.numPaginas);
        System.out.printf("Género: %s", this.genero);
    }

}
