public class Rectangulo {

    private double ancho;
    private double alto;

    //Constructor
    public Rectangulo(double ancho, double alto) {
        if (ancho>0 && alto>0) {
            this.ancho = ancho;
            this.alto = alto;
        } else {
            this.ancho = 1;
            this.alto = 1;
        }
    }
    public Rectangulo() {

    }

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

    //#########
    //Métodos

    public void calcularArea() {
        System.out.printf("Área del rectángulo = %.2fm^2 ", (this.alto*this.ancho));
    }

    public double calcularPerimetro() {
        return (this.alto*2 + this.ancho*2);
    }


}
