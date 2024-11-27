package PruebaB3;

public class Bicicleta extends Vehiculo{

    //Constructor
    public Bicicleta(String marca, String modelo, int velocidad) {
        super(marca,modelo, velocidad);
    }

    //Sobrescribo mover
    @Override
    public void mover() {
        System.out.println("La bicicleta esta en marcha a pedal.");
    }

    //Según el enunciado deería sobrecargar a mover(int distancia), pero uso sobrescritura para que coincida con el main ya dado:
    @Override
    public void mover(int distancia, String tipoTerreno) {
        System.out.println("La bicicleta ha recorrido "+distancia+" km usando "+tipoTerreno+".");
    }



}
