package CP01;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas = 0;

    //Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        contadorPersonas++;
        this.idPersona = contadorPersonas;
    }

    //Getters - Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    //toString
    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
