package CP06;

public class Circulo extends Punto{

    private float radio;

    //Constructores
    public Circulo(Punto p, float radio) {
        super(getX(),getY());
        this.radio = radio;
    }

    public Circulo() {
        this.radio=1;
    }

    //Getters & Setters
    public float getRadio() {
        return radio;
    }

    public void setRadio(float r) {
        this.radio = r;
    }

    //toString
    @Override
    public String toString() {
        return "Círculo de Radio = " + "(" + radio + ") y centro " + super.toString();
    }

    public Punto centro() {
        return new Punto(getX(),getY());
    }

    public void centro (Punto p) {
        setX(p.getX());
        setX(p.getY());
    }

    //El método transladar lo hereda, no hace falta sobreescribirlo.

}
