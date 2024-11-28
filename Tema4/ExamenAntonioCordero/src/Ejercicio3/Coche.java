package Ejercicio3;

public class Coche extends Vehiculo{

    private String modelo;

    //Constructor
    public Coche(String nombre, int velocidad, String modelo) {
        super(nombre, velocidad);
        this.modelo = modelo;
    }

    public Coche(String nombre, int velocidad) {
        super(nombre, velocidad);
    }

    //Getters - Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //toString
    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + this.getNombre() + ", velocidad='" + super.getVelocidad() + '\'' +
                '}';
    }

    //Métodos sobreescritos

    //mover
    @Override
    public void mover() {
        System.out.println("El coche está en marcha");
    }

    //mover + distancia
    @Override
    public void mover(int distancia) {
        System.out.printf("El %s se desplazó %d km a un velocidad de %d km/h\n", getNombre(), distancia, getVelocidad());

    }

    //mover + distancia y terreno
    @Override
    public void mover(int distancia, String terreno) {
        System.out.printf("El %s se desplazó %d km a un velocidad de %d km/h por %s\n", getNombre(), distancia, getVelocidad(), terreno);
    }
}
