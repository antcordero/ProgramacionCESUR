import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class GestorUsuarios {

    private Set<Usuario> usuarios;

    //Constructor
    public GestorUsuarios(Set<Usuario> usuarios) {
        this.usuarios = new TreeSet<Usuario>();
        //al iniciar la app añadir todos los usuarios
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("usuariosCP03.csv"));
            String linea = br.readLine();
            while (br != null) {
                String[] datos = linea.split(",");
                usuarios.add(new Usuario(datos[0], datos[1], datos[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR. Archivo no encontrado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
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

    /**
     * Agregar usuario a la lista y también al archivo csv por comas
     * @param u
     * @return
     */
    public boolean agregarUsuario(Usuario u) {
        //escribir en el archivo
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("usuariosCP03.csv"));
            //añadir con append
        } catch (IOException e) {
            System.out.println("Error, al escribir en el archivo");
        }

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
