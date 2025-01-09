package practica02ud06.vehiculos;

public class Moto extends Vehiculos {
    private int cilindrada;
    private Color color;

    //Constructor
    public Moto(int numRuedas, String marca, int kilometraje, String matricula, int cilindrada, Color color) {
        super(numRuedas, marca, kilometraje, matricula);
        this.cilindrada = cilindrada;
        this.color = color;
    }

    //Getter - Setter
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //toString
    @Override
    public String toString() {
        return  super.toString() +
                "Moto{" +
                "cilindrada=" + cilindrada +
                ", color=" + color +
                '}';
    }
}
