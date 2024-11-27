package PruebaA3;

public class Animal {
    private String nombre;
    private int edad;

    //CONSTRUCTOR
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void emitirSonido() {
        System.out.println("El animal emite un sonido");
    }

    public void alimentar() {
        System.out.println("El animal está siendo alimentado");
    }

    // GETTER Y SETTER
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

    //MÉTODO TOSTRING
    @Override
    public String toString() {
        return "Animal{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
}
