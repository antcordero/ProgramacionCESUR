package Criaturas;

public class Elfo extends Criatura {
    private static final int VIDA_MAXIMA_ELFO = 80;
    private static final int FUERZA_BASE_ELFO = 15;
    private int precision; //Atributo adicional para Elfos

    public Elfo(String nombre) {
        super(nombre, VIDA_MAXIMA_ELFO, FUERZA_BASE_ELFO);
        this.precision = 90; //Porcentaje de precisión
    }

    @Override
    public void atacar(Criatura objetivo) {
        if (Math.random() * 100 < precision) {
            int dano = fuerzaBase + (int)(Math.random() * 10);
            System.out.println(nombre + " lanza un ataque preciso con su arco!");
            objetivo.recibirDano(dano);
        } else {
            System.out.println(nombre + " dispara su flecha pero falla!");
        }
    }

    public void curar(Criatura objetivo) {
        if (!objetivo.estaMuerto()) {
            int curacion = (int)(Math.random() * 20) + 10;
            objetivo.recibirDano(-curacion); //Curar es recibir daño negativo
            System.out.println(nombre + " cura a " + objetivo.nombre + " por " + curacion + " puntos de vida.");
        }
    }
}