package Ejercicio3;

public class Bicicleta extends Vehiculo {

    private String tipo;

    //Constructor
    public Bicicleta(String nombre, int velocidad, String tipo) {
        super(nombre, velocidad);
        this.tipo = tipo;
    }

    public Bicicleta(String nombre, int velocidad) {
        super(nombre, velocidad);
    }

    //Getters - Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //toString
    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipo='" + super.getNombre() + ", velocidad='" +  + super.getVelocidad() + '\'' +
                '}';
    }

    //Métodos sobreescritos

    //mover
    @Override
    public void mover() {
        System.out.println("La bicicleta está en marcha");
    }

    //mover + distancia
    @Override
    public void mover(int distancia) {
        System.out.printf("El %s se desplazó %d km a un velocidad de %d km/h\n", getNombre(), distancia, getVelocidad());

    }

    //mover + distancia + terreno
    @Override
    public void mover(int distancia, String terreno) {
        System.out.printf("El %s se desplazó %d km a un velocidad de %d km/h por %s\n", getNombre(), distancia, getVelocidad(), terreno);
    }
}
