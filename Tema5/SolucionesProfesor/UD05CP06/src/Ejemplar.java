public class Ejemplar {
    private String titulo;
    private String autor;
    private String anhoPublicacion;

    public Ejemplar(String titulo, String autor, String anhoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anhoPublicacion = anhoPublicacion;
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

    public String getAnhoPublicacion() {
        return anhoPublicacion;
    }

    public void setAnhoPublicacion(String anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anhoPublicacion='" + anhoPublicacion + '\'' +
                '}';
    }

    public void mostrarInfo(){
        System.out.print(this);
    }
}
