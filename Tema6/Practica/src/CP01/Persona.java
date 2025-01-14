package CP01;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas = 0;

    //Constructor
    public Persona(String nombre) {
        contadorPersonas++;
        this.idPersona = contadorPersonas;
        this.nombre = nombre;
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

    //toString
    @Override
    public String toString() {
        return  "idPersona: " + idPersona +
                ", nombre: " + nombre + '\'' +
                ", contadorPersona: " + contadorPersonas;
    }
}
