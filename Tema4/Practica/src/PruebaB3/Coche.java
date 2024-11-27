package PruebaB3;

public class Coche extends Vehiculo{

    public Coche(String marca, String modelo, int velocidad){
        super(marca, modelo,velocidad);
    }

    //Sobrescribo mover
    @Override
    public void mover() {
        System.out.println("El coche esta en marcha.");
    }

    //Según el enunciado deería sobrecargar a mover(int distancia), pero uso sobrescritura para que coincida con el main ya dado:
    @Override
    public void mover(int distancia, String tipoTerreno) {
        System.out.println("El coche ha recorrido "+distancia+" km en un terreno "+tipoTerreno+".");
    }

}
