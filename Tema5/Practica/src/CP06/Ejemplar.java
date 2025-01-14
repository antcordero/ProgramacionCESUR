package CP06;

public class Ejemplar {
    private String titulo;
    private String autor;
    private String anioPublicacion;

    public Ejemplar(String titulo, String autor, String anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
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

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion='" + anioPublicacion + '\'' +
                '}';
    }

    //Métodos
    public void mostrarInfo() {
        System.out.printf("\n [Ejemplar] Titulo: %s - ", this.titulo);
        System.out.printf("Autor: %s - ", this.autor);
        System.out.printf("Año de publicación: %s. ", this.anioPublicacion);
    }
}
