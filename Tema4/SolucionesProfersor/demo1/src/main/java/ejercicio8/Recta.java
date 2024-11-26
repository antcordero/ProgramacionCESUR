package ejercicio8;

public class Recta {
    private Vector director;
    private Punto punto;

    public Recta(Punto punto, Vector director) {
        this.punto = punto;
        this.director = director;
    }

    public Recta(Punto p1, Punto p2) {
        this.punto = p1;
        this.director = new Vector(p1, p2);
    }

    public boolean esParalela(Recta otra) {
        return this.director.esCombinacionLineal(otra.director);
    }

    public boolean contiene(Punto p) {
        Vector vectorPunto = new Vector(this.punto, p);
        return this.director.esCombinacionLineal(vectorPunto);
    }

    public Punto interseccion(Recta otra) {
        double vx = this.director.getX();
        double vy = this.director.getY();
        double px = this.punto.getX();
        double py = this.punto.getY();

        double ux = otra.director.getX();
        double uy = otra.director.getY();
        double qx = otra.punto.getX();
        double qy = otra.punto.getY();

        double d = uy * vx - vy * ux; // Determinante
        if (d == 0) return null; // Rectas paralelas o coincidentes

        double d1 = vx * py - vy * px;
        double d2 = ux * qy - uy * qx;

        double x = (d1 * ux - vx * d2) / d;
        double y = -(vy * d2 - uy * d1) / d;

        return new Punto(x, y);
    }

    public Recta perpendicular(Punto p) {
        Vector ortogonal = this.director.ortogonal();
        return new Recta(p, ortogonal);
    }

    public double distancia(Punto p) {
        Recta perpendicular = this.perpendicular(p);
        Punto interseccion = this.interseccion(perpendicular);
        return p.distancia(interseccion);
    }

    @Override
    public String toString() {
        return "R(" + director + "," + punto + ")";
    }
}
