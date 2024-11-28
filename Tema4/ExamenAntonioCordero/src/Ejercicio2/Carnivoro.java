package Ejercicio2;

public class Carnivoro extends Animal {

    //Constructor
    public Carnivoro(String nombre) {
        super(nombre);
    }

    //toString
    @Override
    public String toString() {
        return "Carnivoro{}" + super.toString();
    }

    //Métodos de la clase carnivoro

    //eat - sobreescrito
    @Override
    public void eat() {
        System.out.println("El " + getNombre() + " está comiendo carne.");
    }

    //eat con parámetros sobrecargado
    public void eat(String food) {
        if (food.equalsIgnoreCase("carne")) {
            System.out.printf("El %s está comiendo %s.\n", getNombre(), food);
        } else {
            System.out.printf("El %s no puede comer este tipo de alimento.\n", getNombre());
        }
    }
}
