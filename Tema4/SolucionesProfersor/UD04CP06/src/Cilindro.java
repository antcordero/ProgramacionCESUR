public class Cilindro extends Circulo{

    private float altura;

    public Cilindro() {
        this.altura = 1;
    }

    public Cilindro(Circulo b, float a) {
        super(new Punto(b.x(),b.y()), b.radio());
        this.altura = a;
    }

    public float altura() {
        return altura;
    }

    public void altura(float a) {
        altura = a;
    }

    public void base(Circulo b) {
        radio(b.radio());
        x(b.x());
        y(b.y());
    }

    @Override
    public String toString() {
        return "Cilindro de altura " + altura + " y base " + super.toString();
    }
}
