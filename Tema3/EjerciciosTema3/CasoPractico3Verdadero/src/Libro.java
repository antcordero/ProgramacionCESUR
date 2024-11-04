public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int paginaActual;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas>0) {
            this.numeroPaginas=numeroPaginas;
        }
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int pagina) {
        if (pagina>0 && pagina<=numeroPaginas) {
            this.paginaActual=pagina;
        }
    }

    //############
    //Métodos

    public void leerPagina() {
        setPaginaActual(++paginaActual);
        //El set controla los límites de las páginas
    }

    public void retrocederPagina() {
        setPaginaActual(--paginaActual);
    }

    public void mostrarInfo(){
        System.out.printf("\nInfo del libro: %s por %s.\n", this.titulo, this.titulo);
        System.out.printf("Página actual: %d.\n", this.paginaActual);
    }

}
