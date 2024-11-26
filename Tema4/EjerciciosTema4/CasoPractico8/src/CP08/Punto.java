package CP08;

public class Punto {
    private double x;
    private double y;

    //Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {

    }

    //Getters & Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //toString
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    //Métodos
    public double distancia (Punto punto) {
        double d;
        d = Math.pow((this.x - punto.x), 2) + Math.pow((this.y - punto.y), 2);
        return (Math.sqrt(d));
    }
}
