package Criaturas;

public class Troll extends Criatura {
    private static final int VIDA_MAXIMA_TROLL = 150;
    private static final int FUERZA_BASE_TROLL = 25;
    private int furia; // Atributo adicional para Trolls

    public Troll(String nombre) {
        super(nombre, VIDA_MAXIMA_TROLL, FUERZA_BASE_TROLL);
        this.furia = 0;
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dano = fuerzaBase + (int)(Math.random() * 15) + furia;
        System.out.println(nombre + " golpea con su garrote salvajemente!");
        objetivo.recibirDano(dano);

        // Aumentar furia con cada ataque
        furia += 5;
        System.out.println(nombre + " aumenta su furia a " + furia);
    }

    @Override
    public void recibirDano(int cantidad) {
        // Los trolls son resistentes, reducen el daño recibido
        super.recibirDano(cantidad / 2);
    }
}