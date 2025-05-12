import java.util.Set;
import java.util.TreeSet;

public class GestorLibros {

    private Set<Libro> libros;

    //Constructor

    public GestorLibros(Set<Libro> libros) {
        this.libros = new TreeSet<>();
    }

    //Getters y setters
    public Set<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Set<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "GestorLibros{" +
                "libros=" + libros +
                '}';
    }

    
}
