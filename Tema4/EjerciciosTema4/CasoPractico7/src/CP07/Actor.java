package CP07;

public class Actor {

    private String nombre;
    private int edad;
    /*private Pelicula pelicula;*/

    public Actor(String nombre, int edad/*, Pelicula pelicula*/) {
        this.nombre = nombre;
        this.edad = edad;
        /*this.pelicula = pelicula;*/
    }

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

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                /*", pelicula=" + pelicula +*/
                '}';
    }

    //Métodos
    public void mostrarActor() {
        System.out.printf("Actor: %s, %d\n", this.nombre, this.edad);
        /*System.out.println("Película: " + pelicula.getTitulo());*/
    }
}
