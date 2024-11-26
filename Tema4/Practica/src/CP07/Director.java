package CP07;

public class Director {
    private String nombre;
    private int edad;

    //Constructor
    public Director(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getter - Setter
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
        return "Director{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    //Métodos
    public void mostrarDirector() {
        System.out.println(this);
    }

}
