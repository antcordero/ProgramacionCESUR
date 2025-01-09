package practica02ud06.vehiculos;

public class Vehiculos {
    private int numRuedas;
    private String marca;
    private int kilometraje;
    private String color;
    private String matricula;

    //Constructor
    public Vehiculos(int numRuedas, String marca, int kilometraje, String matricula) {
        this.numRuedas = numRuedas;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.matricula = matricula;
    }

    //Getters - Setters
    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //toString
    @Override
    public String toString() {
        return "Vehiculos{" +
                "numRuedas=" + numRuedas +
                ", marca='" + marca + '\'' +
                ", kilometraje=" + kilometraje +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
