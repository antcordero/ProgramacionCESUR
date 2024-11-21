package CP06;

public class Punto {

    private float x ;
    private float y ;

    //Constructores
    public Punto(float a, float b) {
        this.x = a;
        this.y = b;
    }

    public Punto() {
        this.x=1;
        this.y=1;
    }

    //Getters & Setters
    public float getX() {
        return x;
    }

    public void setX(float a) {
        this.x = a;
    }

    public float getY() {
        return y;
    }

    public void setY(float b) {
        this.y = b;
    }

    @Override
    public String toString() {
        return "Punto = (" + x +", " + y +"). ";
    }

    //Métodos
    public void transladar(float a, float b) {
        this.x=a;
        this.y=b;
    }
}

