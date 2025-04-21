package Criaturas;

public class Elfo extends Criatura{

    private int vidaMaxElfo;
    private int fuerzaElfo;
    private String nombreElfo;

    public Elfo(String nombre, int vidaActual, int fuerza) {
        super(nombre, vidaActual, fuerza);
    }

    public Elfo(String nombreElfo) {
        super();
        this.nombreElfo = nombreElfo;
        this.fuerzaElfo = 3;
        this.vidaMaxElfo = 20;
    }




}
