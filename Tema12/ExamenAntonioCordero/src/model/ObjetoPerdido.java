package model;

public class ObjetoPerdido extends ArtefactoTemporal {
    private String civilizacion;
    private String autenticidad;

    //Constructor
    public ObjetoPerdido(int id, String nombre, int anioDescubrimiento, String nivelAcceso, String ubicacionActual, String civilizacion, String autenticidad) {
        super(id, nombre, anioDescubrimiento, nivelAcceso, ubicacionActual);
        this.civilizacion = civilizacion;
        this.autenticidad = autenticidad;
    }

    //Getters-Setters
    public String getCivilizacion() {
        return civilizacion;
    }

    public void setCivilizacion(String civilizacion) {
        this.civilizacion = civilizacion;
    }

    public String getAutenticidad() {
        return autenticidad;
    }

    public void setAutenticidad(String autenticidad) {
        this.autenticidad = autenticidad;
    }

    //toString
    @Override
    public String toString() {
        return "ObjetoPerdido{" + super.toString() +
                ", civilizacion='" + civilizacion + '\'' +
                ", autenticidad='" + autenticidad + '\'' +
                '}';
    }

    //Métodos Abstractos
    @Override
    public String getTipo() {
        return "ObjetoPerdido";
    }

    @Override
    public boolean esExhibible() {
        return autenticidad.equalsIgnoreCase("alta");
    }
}