package Prueba;

public class Carnivoro extends Animal{

    //Constructor
    public Carnivoro(String nombre) {
        super(nombre);
    }

    //toString
    @Override
    public String toString() {
        return "Carnivoro{}" + super.toString();
    }

    //Métodos
    @Override
    public void eat() {
        System.out.println("El carnivoro está comiendo carne");
    }

    @Override
    public void eat(String food) {
        if (food.equals("carne")) {
            System.out.println("El carnivoro disfruta comiendo carne");
        } else {
            System.out.println("El carnivoro no puede comer " + food);
        }
    }
}
