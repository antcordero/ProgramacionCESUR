package Ejercicio2;

public class Herbivoro extends Animal {

    //Constructor
    public Herbivoro(String nombre) {
        super(nombre);
    }

    //toString
    @Override
    public String toString() {
        return "Herbivoro{}" + super.toString();
    }

    //Métodos de la clase Herbivoro

    //eat sobreescrito
    @Override
    public void eat() {
        System.out.println("El " + getNombre() + " conejo está comiendo vegetales.");
    }

    //eat sobrecargado
    public void eat(String food) {
        if (food.equalsIgnoreCase("carne")) {
            System.out.printf("El %s no puede comer %s.\n", getNombre(), food);
        } else if (food.equalsIgnoreCase("hierba")) {
            System.out.printf("El %s está comiendo %s.\n", getNombre(), food);
        }
    }
}
