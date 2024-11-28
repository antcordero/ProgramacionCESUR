package Ejercicio2;

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

    //Métodos de la clase Omnivoro

    //eat sobreescrito
    @Override
    public void eat() {
        System.out.println("El " + getNombre() + " está comiendo carne y vegetales.");
    }

    //eat sobrecargado
    public void eat(String food) {
        if (food.equalsIgnoreCase("carne")) {
            System.out.printf("El %s está comiendo %s.\n", getNombre(), food);
        } else if (food.equalsIgnoreCase("hierba") || food.equalsIgnoreCase("frutas")) {
            System.out.printf("El %s está comiendo vegetales.\n", getNombre());
        } else {
            System.out.println("El " + getNombre() + " no puede comer este tipo de alimento.");
        }
    }
}
