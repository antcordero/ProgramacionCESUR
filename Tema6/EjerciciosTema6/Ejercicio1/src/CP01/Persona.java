package CP01;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int ContadorPersonas = 0;

    //Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //Getters - Setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return ContadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        ContadorPersonas++;
    }

    //toString
    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //Métodos

}
