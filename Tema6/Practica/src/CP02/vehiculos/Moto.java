package CP02.vehiculos;

public class Moto extends Vehiculos{
    private int cilindrada;

    public Moto(int numRuedas, String marca, int kilometraje, String color, int cilindrada) {
        super(numRuedas, marca, kilometraje, color);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                '}';
    }
}
