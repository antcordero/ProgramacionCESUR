package CP01;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Métodos
    public void mostrarInfo() {
        System.out.printf("Nombre: %s \nEdad: %d \nGénero: %s\n", this.nombre, this.edad, this.genero);
    }

    public void cumplirAnios() {
        this.edad += 1;
    }
}
