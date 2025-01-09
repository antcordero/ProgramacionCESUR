package practica02ud06.vehiculos;

public class Coche extends Vehiculos {
    private int numPuertas;
    private boolean extras;
    private Color color;

    //Constructor
    public Coche(int numRuedas, String marca, int kilometraje, String matricula, int numPuertas, boolean extras, Color color) {
        super(numRuedas, marca, kilometraje, matricula);
        this.numPuertas = numPuertas;
        this.extras = extras;
        this.color = color;
    }

    //Getters - Setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
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
                "Coche{" +
                "numPuertas=" + numPuertas +
                ", extras=" + ((extras)?"Sí":"No") +
                ", color=" + color +
                '}';
    }
}
