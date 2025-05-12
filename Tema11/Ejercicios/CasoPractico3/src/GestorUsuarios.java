import java.util.Set;
import java.util.TreeSet;

public class GestorUsuarios {

    private Set<Usuario> usuarios;

    //Constructor
    public GestorUsuarios(Set<Usuario> usuarios) {
        this.usuarios = new TreeSet<Usuario>();
    }

    //Getter - Setters
    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
