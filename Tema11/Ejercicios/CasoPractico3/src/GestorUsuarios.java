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

    @Override
    public String toString() {
        return "GestorUsuarios{" +
                "usuarios=" + usuarios +
                '}';
    }

    public boolean agregarUsuario(Usuario u) {
        return this.usuarios.add(u);
    }

    public Usuario buscarUsuario(String nombre) {
        Usuario elUsuario = null;
        for (Usuario u : this.usuarios) {
            if (u.getNombre().equals(nombre)) {
                elUsuario = u;
            }
        }
        return elUsuario;
    }

    public void mostrarProductos() {
        if (this.usuarios.isEmpty()) {
            System.out.println("No hay usuarios");
        } else {
            for (Usuario u : this.usuarios) {
                System.out.println(u.toString());
            }
        }
    }
}
