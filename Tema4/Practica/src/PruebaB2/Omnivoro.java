package PruebaB2;

public class Omnivoro extends Animal{

    //Constructor
    public Omnivoro(String nombre) {
        super(nombre);
    }

    //Sobrescribo el metodo eat()
    @Override
    public void eat(){
        System.out.println("El omnivoro esta comiendo una dieta variada.");
    }

    @Override
    public void eat(String food){
        System.out.println("El omnivoro disfruta comiendo "+food+".");
    }

}
