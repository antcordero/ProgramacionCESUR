package Criaturas;

public abstract class Criatura {
    protected String nombre;
    protected int vida;
    protected final int vidaMaxima;
    protected final int fuerzaBase;

    public Criatura(String nombre, int vidaMaxima, int fuerzaBase) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.fuerzaBase = fuerzaBase;
        this.vida = vidaMaxima;
    }

    public abstract void atacar(Criatura objetivo);

    public void recibirDano(int cantidad) {
        if (!estaMuerto()) {
            vida -= cantidad;
            if (vida < 0) vida = 0;
            System.out.println(nombre + " recibe " + cantidad + " de daño. Vida restante: " + vida);
        }
    }

    public boolean estaMuerto() {
        return vida <= 0;
    }

    public void recuperar() {
        if (!estaMuerto()) {
            int recuperacion = (int)(Math.random() * (vidaMaxima / 2)) + 1;
            vida = Math.min(vida + recuperacion, vidaMaxima);
            System.out.println(nombre + " recupera " + recuperacion + " puntos de vida. Vida actual: " + vida);
        }
    }

    public void descansar() {
        vida = vidaMaxima;
        System.out.println(nombre + " descansa y recupera toda su vida (" + vida + ")");
    }

    public void luchar(Criatura oponente) {
        if (estaMuerto()) {
            System.out.println(nombre + " no puede luchar porque está muerto.");
            return;
        }

        if (oponente.estaMuerto()) {
            System.out.println(nombre + " no puede luchar contra " + oponente.nombre + " porque está muerto.");
            return;
        }

        System.out.println(nombre + " inicia un duelo contra " + oponente.nombre + "!");

        while (!estaMuerto() && !oponente.estaMuerto()) {
            atacar(oponente);
            if (!oponente.estaMuerto()) {
                oponente.atacar(this);
            }
        }

        if (estaMuerto()) {
            System.out.println(nombre + " ha sido derrotado!");
        } else {
            System.out.println(oponente.nombre + " ha sido derrotado!");
        }
    }

    @Override
    public String toString() {
        return nombre + " (Vida: " + vida + "/" + vidaMaxima + ", Fuerza: " + fuerzaBase + ")";
    }
}