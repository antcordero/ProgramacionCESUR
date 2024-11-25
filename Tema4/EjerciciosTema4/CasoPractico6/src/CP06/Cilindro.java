package CP06;

public class Cilindro extends Circulo {

    private float altura;

    //Constructores
    public Cilindro(Circulo c, float a) {
        super(x, y, radio b);
        this.altura = a;
    }

    public Cilindro() {
        this.altura=1;
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
        return "Cinlindro de Altura = " + "(" + altura + ") y base = " +  super.toString();
    }

    //Métodos
    @Override
    public void transladar(float a, float b) {
        super.transladar(a, b);
    }
}
