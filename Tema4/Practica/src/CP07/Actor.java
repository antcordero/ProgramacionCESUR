package CP07;

public class Actor {
    private String nombre;
    private int edad;

    //Constructor
    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters - Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //toString
    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    //Métodos
    public void mostrarActor() {
        System.out.println(this);
    }
}
