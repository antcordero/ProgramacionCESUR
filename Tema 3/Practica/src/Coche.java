public class Coche {

    //Atributos
    private String modelo;
    private String color;
    private boolean metalizado;
    private int anioMatricula;
    private String seguro;

    //Métodos
    // Constructor
    public Coche(String modelo, String color, boolean metalizado, int anioMatricula, String seguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.anioMatricula = anioMatricula;
        this.seguro = seguro;
    }

    //Getters y Setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }

    public boolean isMetalizado() {
        return metalizado;
    }
    public void setMetalizado(boolean metalizado) {
        this.metalizado = metalizado;
    }

    public int getAnioMatricula() {
        return anioMatricula;
    }
    public void setAnioMatricula(int anioMatricula) {
        this.anioMatricula = anioMatricula;
    }

    public String getSeguro() {
        return seguro;
    }
    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
}
