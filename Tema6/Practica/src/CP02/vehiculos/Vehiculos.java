package CP02.vehiculos;

public class Vehiculos {
    private static int numRuedas;
    private String marca;
    private static int kilometraje;
    private Color color;

    //
    public Vehiculos(int numRuedas, String marca, int kilometraje, String color) {
        this.numRuedas = numRuedas;
        this.marca = marca;
        this.kilometraje = kilometraje;
        comprobarColor(color);
    }

    //Getters - Setters
    public static int getNumRuedas() {
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

    public static int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        comprobarColor(color);
    }

    //toString
    @Override
    public String toString() {
        return "Vehiculos{" +
                "numRuedas=" + numRuedas +
                ", marca='" + marca + '\'' +
                ", kilometraje=" + kilometraje +
                ", color=" + color +
                '}';
    }

    //Métodos
    private void comprobarColor(String color) {
        switch (color.toUpperCase()) {
            case "NEGRO" -> this.color = Color.NEGRO;
            case "GRIS" -> this.color = Color.GRIS;
            case "ROJO" -> this.color = Color.ROJO;
            case "AZUL" -> this.color = Color.AZUL;
            default -> this.color = Color.BLANCO;
        }
    }


}
