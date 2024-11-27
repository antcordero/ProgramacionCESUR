package PruebaA1;

public class Bicicleta extends Vehiculo{
    public Bicicleta(int velocidad) {
        super(velocidad);
    }
    private String tipoVehiculo;

    //CONSTRUCTOR
    public Bicicleta(int velocidad, String tipoVehiculo) {
        super(velocidad);
        this.tipoVehiculo = tipoVehiculo;
    }

    //MÉTODO TOSTRING
    @Override
    public void mover() {
        System.out.println("La bicicleta está en marcha.");
    }

    @Override
    public void mover(int distancia) {
        System.out.println("La bicicleta ha recorrido " + distancia + " metros.");
    }

    @Override
    public void mover(int distancia, String terreno) {
        System.out.println("La bicicleta ha recorrido " + distancia + " metros en " + terreno + ".");
    }

    @Override
    public String toString() {
        return "Bicicleta [velocidad=" + getVelocidad() + "]";
    }
}
