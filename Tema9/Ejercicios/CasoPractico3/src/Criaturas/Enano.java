package Criaturas;

public class Enano extends Criatura {
    private static final int VIDA_MAXIMA_ENANO = 100;
    private static final int FUERZA_BASE_ENANO = 20;
    private int resistencia; // Atributo adicional para Enanos

    public Enano(String nombre) {
        super(nombre, VIDA_MAXIMA_ENANO, FUERZA_BASE_ENANO);
        this.resistencia = 30; // Reducción de daño
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dano = fuerzaBase + (int)(Math.random() * 5);
        System.out.println(nombre + " ataca con su hacha enana con potencia!");
        objetivo.recibirDano(dano);
    }

    @Override
    public void recibirDano(int cantidad) {
        // Los enanos tienen resistencia al daño
        super.recibirDano(Math.max(1, cantidad - resistencia));
    }
}