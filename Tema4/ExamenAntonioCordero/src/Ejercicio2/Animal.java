package Ejercicio2;

public class Animal {

    private String nombre;

    //Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    //Getters - Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    //Métodos de la clase Animal
    //eat
    public void eat(){
        System.out.println("El animal está comiendo");
    }

    //eat sobrecargado
    public void eat(String food) {
        System.out.printf("El animal está comiendo %s\n", food);
    }

}
