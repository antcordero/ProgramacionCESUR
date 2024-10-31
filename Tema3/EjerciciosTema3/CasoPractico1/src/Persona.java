public class Persona {

    //Atributos
    private String nombre;
    private int edad;
    private String genero;

    //Métodos
    //Constructor
    public Persona() {

    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Métodos del ejercicio

    public void mostrarInfo() {
        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("Edad: %d\n", edad);
        System.out.printf("Género: %s\n", genero);
    }

    public int cumplirAnios (int edad) {
        edad++;
        return edad;
    }
}
