package CP02;

public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;

    //Constructor
    public Persona(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        if (telefono.length()!=9) {
            this.telefono = "123456789";
        } else {
            this.telefono = telefono;
        }
    }

    //Constructor sin parámetros
    public Persona() {
    }

    //Getter & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", teléfono='" + telefono + '\'' +
                '}';
    }
}
