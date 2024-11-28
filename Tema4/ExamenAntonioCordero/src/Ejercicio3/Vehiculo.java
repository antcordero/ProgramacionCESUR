package Ejercicio3;

public class Vehiculo {

    private String nombre;
    private int velocidad;

    //Constructor
    public Vehiculo(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    //Getters - Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }

    //Métodos de la clase Vehículo
    //mover
    public void mover() {
        System.out.println("El vehículo está en marcha");
    }

    //mover + parámetro (sobrecarga)
    public void mover(int distancia) {
        System.out.printf("El vehículo se desplazó %d km a un velocidad de %d km/h\n", distancia, getVelocidad());
    }

    //mover + 2parámetros (sobrecarga)
    public void mover(int distancia, String terreno) {
        System.out.printf("El vehículo se desplazó %d km a un velocidad de %d km/h por %s\n", distancia, getVelocidad(), terreno);
    }

}
