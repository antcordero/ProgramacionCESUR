package Prueba;

public class Test {
    public static void main(String[] args) {
        Carnivoro leon = new Carnivoro("León");
        Herbivoro conejo = new Herbivoro("Conejo");
        Omnivoro oso = new Omnivoro("Oso");
        System.out.println("Comportamiento general:");
        leon.eat();
        conejo.eat();
        oso.eat();

        System.out.println("\nComportamiento específico con sobrecargar:");
        leon.eat("carne");
        leon.eat("hierba");
        conejo.eat("hierba");
        conejo.eat("carne");
        oso.eat("frutas");
        oso.eat("carne");
    }
}
