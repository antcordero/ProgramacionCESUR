package CP07;

public class Pelicula {

    private String titulo;
    private int anyoEstreno;
    private String genero;
    private Actor actorPrincipal;
    private Director director;

    //Constructor
    public Pelicula(String titulo, int anyoEstreno, String genero, Actor actorPrincipal, Director director) {
        this.titulo = titulo;
        this.anyoEstreno = anyoEstreno;
        this.genero = genero;
        this.actorPrincipal = actorPrincipal;
        this.director = director;
    }

    //Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyoEstreno() {
        return anyoEstreno;
    }

    public void setAnyoEstreno(int anyoEstreno) {
        this.anyoEstreno = anyoEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anyoEstreno=" + anyoEstreno +
                ", genero='" + genero + '\'' +
                ", Actor Principal='" + actorPrincipal + '\'' +
                ", Director='" + director + '\'' +
                '}';
    }

    //Métodos
    public void mostrarDetalles() {
        System.out.printf("Película: %s, %d, %s\n", this.titulo, this.anyoEstreno, this.genero);
        System.out.println("Actor Principal: " + actorPrincipal.getNombre());
        System.out.println("Director: " + director.getNombre());
    }
}
