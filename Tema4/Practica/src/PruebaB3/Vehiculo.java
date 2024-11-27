package PruebaB3;

public class Vehiculo {

    //Atributos
    private String marca;
    private String modelo;

    private int velocidad;

    //Constructor
    public Vehiculo(String marca, String modelo, int velocidad) {
        setMarca(marca);
        setModelo(modelo);
        setVelocidad(velocidad);
    }

    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //Metodos ha implementar
    public void mover() {
        System.out.println("El vehiculo esta en marcha.");
    }

    public void detener() {
        System.out.println("El vehiculo se ha detenido.");
    }

    public void mover(int distancia) {
        System.out.println("El vehiculo ha recorrido "+distancia+" km.");
    }

    //Según el enunciado, este metodo no debería existir, pero en el main dado se ha de usar, así que lo creo:
    public void mover(int distancia, String tipoTerreno) {
        System.out.println("El vehiculo ha recorrido "+distancia+" km en un terreno "+tipoTerreno+".");
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
