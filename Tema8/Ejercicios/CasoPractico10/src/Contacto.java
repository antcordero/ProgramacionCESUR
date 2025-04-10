public class Contacto {
    private String nombre;
    private String telefono;
    private String email;
    private String categoria;

    public Contacto(String nombre, String telefono, String email, String categoria) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono + ", Email: " + email + ", Categoría: " + categoria;
    }
}
