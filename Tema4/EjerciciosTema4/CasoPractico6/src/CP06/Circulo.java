package CP06;

public class Circulo extends Punto{

    private float radio;

    //Constructores
    public Circulo(float x, float y, float radio) {
        super(x, y);
        this.radio = radio;
    }

    public Circulo() {
        super();
        this.radio=1;
    }

    public Circulo(Punto centroBase, float v) {
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
        return super.toString() + "Radio = " + "(" + radio + ").";
    }

    //Métodos
    @Override
    public void transladar(float a, float b) {
        super.transladar(a, b);
    }
}
