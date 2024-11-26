package Prueba;

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

    //Métodos
    public void eat(){
        System.out.println("El animal está comiendo");
    }

    public void sleep(){
        System.out.println("El animal está durmiendo");
    }

    public void eat(String food) {
        System.out.println("El animal está comiendo " + food);
    }

}
