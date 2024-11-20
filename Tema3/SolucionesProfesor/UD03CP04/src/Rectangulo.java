public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        if (ancho>0 && alto>0) {
            this.ancho = ancho;
            this.alto = alto;
        } else {
            this.ancho = 1;
            this.alto = 1;
        }
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho*alto;
    }

    public double calcularPerimetro() {
        return 2*ancho+2*alto;
    }
}
