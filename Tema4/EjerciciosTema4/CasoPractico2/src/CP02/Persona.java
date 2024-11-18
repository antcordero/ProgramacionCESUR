package CP02;

public class Persona {

    private String nombre;
    private String apellido;
    private String telefono;

    //Constructor con parámetros
    public Persona(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        setTelefono(telefono);
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
        if (this.telefono.length()!=9) {
            this.telefono = "000000000";
        } else {
            this.telefono=telefono;
        }
    }

    //Métodos propios de la clase Persona
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nTlf: " + telefono;
    }
}
