package CP04;

public class Rectangulo {

    private double ancho;
    private double alto;

    //Constructor
    public Rectangulo(double alto, double ancho) {
        if (alto<0 && ancho<0) {
            this.alto = 1;
            this.ancho = 1;
        } else {
            this.alto = alto;
            this.ancho = ancho;}
    }

    //Getters & Setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {

    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {

    }

    //Métodos
    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return ((2*ancho) + (2*alto));
    }
}
