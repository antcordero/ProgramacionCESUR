package PruebaB2;

public class Carnivoro extends Animal{

    //Constructor
    public Carnivoro(String nombre) {
        super(nombre);
    }

    //Sobrescribo el metodo eat()
    @Override
    public void eat(){
        System.out.println("El carnivoro esta comiendo carne.");
    }

    //Sobrecargo para hacer control
    @Override
    public void eat(String food) {

        if (food.equalsIgnoreCase("carne"))
            System.out.println("El carnivoro esta comiendo "+food);
        else
            System.out.println("El carnivoro no puede comer "+food);
    }




}
