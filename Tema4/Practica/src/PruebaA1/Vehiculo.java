package PruebaA1;

public class Vehiculo {
    private int velocidad;

    // CONSTRUCTOR
    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    // GETTER Y SETTER
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // MÉTODO MOVER
    public void mover() {
        System.out.println("El vehículo está en marcha.");
    }

    // LA SOBRECARGA DEL MÉTODO MOVER
    public void mover(int distancia) {
        System.out.println("El vehículo ha recorrido " + distancia + " metros.");
    }

    public void mover(int distancia, String terreno) {
        System.out.println("El vehículo ha recorrido " + distancia + " metros en " + terreno + ".");
    }

    // MÉTODO TO STRING
    @Override
    public String toString() {
        return "Vehiculo{" + "velocidad=" + velocidad + '}';
    }
}
