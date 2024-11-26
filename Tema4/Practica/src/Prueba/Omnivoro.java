package Prueba;

public class Omnivoro extends Animal {

    //Constructor
    public Omnivoro(String nombre) {
        super(nombre);
    }

    //toString
    @Override
    public String toString() {
        return "Omnivoro{}" + super.toString();
    }

    //Métodos
    @Override
    public void eat() {
        System.out.println("El omnivoro está comiendo una dieta variada.");
    }

    @Override
    public void eat(String food) {
        System.out.println("El omnivoro está comiendo " + food);
    }
}
