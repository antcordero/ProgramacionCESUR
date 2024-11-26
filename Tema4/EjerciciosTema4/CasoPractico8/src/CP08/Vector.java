package CP08;

public class Vector extends Punto {

    //Asociación de Punto
    private Punto extremo;

    //Constructores
    public Vector(double x, double y) {
        this.extremo = new Punto(x, y);
    }

    public Vector(Punto e) {
        this.extremo = e;
    }

    public Vector(Punto o, Punto e) {
        double x = e.getX() - o.getX();
        double y = e.getY() - o.getY();
        this.extremo = new Punto(x, y);
    }

    //Getter - Setters
    public double getX() {
        return extremo.getX();
    }

    public double getY() {
        return extremo.getY();
    }

    //toString
    @Override
    public String toString() {
        return "Vector: " + "(" + extremo + ")";
    }

    //Método módulo
    public double modulo() {
        return extremo.distancia(new Punto(0, 0));
    }

    //Método ortogonal
    public Vector ortogonal() {
        return new Vector(-this.getY(), this.getX());
    }

    //Método combinación lineal
    public boolean combinacionLineal(Vector v) {
        double vx = this.getX();
        double vy = this.getY();
        double ux = v.getX();
        double uy = v.getY();
        //Cálculo
        return vx * uy == vy * ux;
    }
}
