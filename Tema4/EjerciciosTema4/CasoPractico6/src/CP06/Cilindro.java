package CP06;

public class Cilindro extends Circulo {

    private float altura;

    //Constructores
    public Cilindro(float x, float y, float radio, float altura) {
        super(x, y, radio);
        this.altura = altura;
    }

    public Cilindro() {
        super();
        this.altura=1;
    }

    public Cilindro(Circulo base, float v) {
    }

    //Getters & Setters
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " Altura = " + "(" + altura + ").";
    }

    //Métodos
    @Override
    public void transladar(float a, float b) {
        super.transladar(a, b);
    }
}
