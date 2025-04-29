public class Videojuego {
    private String titulo;
    private String genero;
    private Consola consola;

    public Videojuego(String titulo, String genero, Consola consola) {
        this.titulo = titulo;
        this.genero = genero;
        this.consola = consola;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Consola getConsola() {
        return consola;
    }

    public void mostrarDetalles() {
        System.out.println("Videojuego:");
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Consola: " + consola.getNombre());
    }
}
