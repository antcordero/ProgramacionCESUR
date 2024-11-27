package PruebaA1;

public class Coche extends Vehiculo {
    public Coche(int velocidad) {
        super(velocidad);
    }
    private String tipoVehiculo;

    //CONSTRUCTOR

    public Coche(int velocidad, String tipoVehiculo) {
        super(velocidad);
        this.tipoVehiculo = tipoVehiculo;
    }

    //MÉTODO TOSTRING
    @Override
    public void mover() {
        System.out.println("El coche está en marcha.");
    }

    @Override
    public void mover(int distancia) {
        System.out.println("El coche ha recorrido " + distancia + " metros.");
    }

    @Override
    public void mover(int distancia, String terreno) {
        System.out.println("El coche ha recorrido " + distancia + " metros en " + terreno + ".");
    }

    //MÉTODO TO STRING
    @Override
    public String toString() {
        return "Coche{" + "tipoVehiculo='" + tipoVehiculo + '\'' + '}';
    }
}
