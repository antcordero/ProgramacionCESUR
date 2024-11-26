package Prueba;

public class Herbivoro extends Animal{

    //Constructor
    public Herbivoro(String nombre) {
        super(nombre);
    }

    //toString
    @Override
    public String toString() {
        return "Herbivoro{}" + super.toString();
    }

    //Métodos
    @Override
    public void eat() {
        System.out.println("El herbivoro está comiendo plantas");
    }

    //Sobrecargado
    public void eat(String food) {
        if (food.equals("plantas")) {
            System.out.println("El herbivoro está comiendo plantas");
        } else if (food.equals("hierba")) {
            System.out.println("El herbivoro disfruta comiendo hierba");
        } else {
            System.out.println("El herbivoro no puede comer " + food);
        }
    }
}
