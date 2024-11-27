package PruebaB2;

public class Test {
    public static void main(String[] args) {
        Carnivoro leon = new Carnivoro("Leon");
        Herviboro conejo = new Herviboro("Conejo");
        Omnivoro oso = new Omnivoro("Oso");

        System.out.println("Comportamiento general: ");
        leon.eat();
        conejo.eat();
        oso.eat();

        System.out.println("\nComportamiento especifico con sobrecarga: ");
        leon.eat("carne");
        leon.eat("hierba");
        conejo.eat("hierba");
        conejo.eat("carne");
        oso.eat("frutas");
        oso.eat("carne");


    }
}
