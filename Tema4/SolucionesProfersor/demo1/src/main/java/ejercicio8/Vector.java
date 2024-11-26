package ejercicio8;

public class Vector {
    private Punto extremo;

    public Vector(double x, double y) {
        this.extremo = new Punto(x, y);
    }

    public Vector(Punto extremo) {
        this.extremo = extremo;
    }

    public Vector(Punto origen, Punto extremo) {
        double x = extremo.getX() - origen.getX();
        double y = extremo.getY() - origen.getY();
        this.extremo = new Punto(x, y);
    }

    public double getX() {
        return extremo.getX();
    }

    public double getY() {
        return extremo.getY();
    }

    public double modulo() {
        return extremo.distancia(new Punto(0, 0));
    }

    public Vector ortogonal() {
        return new Vector(-this.getY(), this.getX());
    }

    public boolean esCombinacionLineal(Vector otro) {
        double vx = this.getX();
        double vy = this.getY();
        double ux = otro.getX();
        double uy = otro.getY();
        return vx * uy == vy * ux;
    }

    @Override
    public String toString() {
        return "V(" + getX() + "," + getY() + ")";
    }
}
