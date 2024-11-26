package CP07;

public class Pelicula {

    private String titulo;
    private String anyoEstreno;
    private String genero;
    private Director director;
    private Actor actorPrincipal;

    //Constructor
    public Pelicula(String titulo, String anyoEstreno, String genero, Director director, Actor actorPrincipal) {
        this.titulo = titulo;
        this.anyoEstreno = anyoEstreno;
        this.genero = genero;
        this.director = director;
        this.actorPrincipal = actorPrincipal;
    }

    //Getters - Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnyoEstreno() {
        return anyoEstreno;
    }

    public void setAnyoEstreno(String anyoEstreno) {
        this.anyoEstreno = anyoEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Actor getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(Actor actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    //toString
    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anyoEstreno='" + anyoEstreno + '\'' +
                ", genero='" + genero + '\'' +
                ", director=" + director.getNombre() +
                ", actorPrincipal=" + actorPrincipal.getNombre() +
                '}';
    }

    //Métodos
    public void mostrarDetalles() {
        System.out.println(this);
    }
}
