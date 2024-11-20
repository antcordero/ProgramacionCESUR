public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int paginaActual;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.paginaActual = 0;
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
        if (numeroPaginas >0)
            this.numeroPaginas = numeroPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        if (paginaActual>=0 && paginaActual <= numeroPaginas)
          this.paginaActual = paginaActual;
    }

    public void leerPagina(){
        setPaginaActual(++paginaActual);
    }

    public void retrocederPagina(){
        setPaginaActual(--paginaActual);
    }

    public void mostrarInfo(){
        System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nNumero de Paginas: "+numeroPaginas+"\nPaginaActual: "+paginaActual);
    }
}
