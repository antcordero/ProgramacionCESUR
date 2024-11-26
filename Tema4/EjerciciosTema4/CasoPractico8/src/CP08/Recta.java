package CP08;

public class Recta extends Punto{

    //Asociación de Vector y Punto
    private Vector director;
    private Punto punto;

    //Constructores
    public Recta(Punto punto, Vector director) {
        super();
        this.punto = punto;
        this.director = director;
    }

    public Recta(Punto p1, Punto p2) {
        this.punto = p1;
        this.director = new Vector(p1, p2);
    }

    //toString
    @Override
    public String toString() {
        return "(" + director + "," + punto + ")";
    }

    //Métodos
    public Punto interseccion(Recta r) {
        //Variables
        double vx = this.director.getX();
        double vy = this.director.getY();
        double px = this.punto.getX();
        double py = this.punto.getY();
        double ux = r.director.getX();
        double uy = r.director.getY();
        double qx = r.punto.getX();
        double qy = r.punto.getY();

        //Cálculos
        double d = uy * vx - vy * ux;
        if (d == 0) return null;

        double d1 = vx * py - vy * px;
        double d2 = ux * qy - uy * qx;

        double x = (d1 * ux - vx * d2) / d;
        double y = -(vy * d2 - uy * d1) / d;
        //
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
}
