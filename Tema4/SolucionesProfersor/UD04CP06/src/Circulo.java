public class Circulo extends Punto{
    private float radio;

    public Circulo() {
        this.radio = 1;
    }

    public Circulo(Punto p, float r) {
        super(p.x(), p.y());
        radio = r;
    }

    public float radio() {
        return radio;
    }

    public void radio(float r) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Círculo de radio " + radio + " y centro " + super.toString();
    }

    public Punto centro(){
        return new Punto(x(),y());
    }

    public void centro(Punto p){
        x(p.x());
        y(p.y());
    }
}
