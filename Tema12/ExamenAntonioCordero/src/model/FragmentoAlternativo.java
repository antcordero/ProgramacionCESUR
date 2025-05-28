package model;

public class FragmentoAlternativo extends ArtefactoTemporal {
    private double nivelDivergencia;
    private boolean riesgoParadoja;

    //Constructor
    public FragmentoAlternativo(int id, String nombre, int anioDescubrimiento, String nivelAcceso, String ubicacionActual, double nivelDivergencia, boolean riesgoParadoja) {
        super(id, nombre, anioDescubrimiento, nivelAcceso, ubicacionActual);
        this.nivelDivergencia = nivelDivergencia;
        this.riesgoParadoja = riesgoParadoja;
    }

    //Getters-Setters
    public double getNivelDivergencia() {
        return nivelDivergencia;
    }

    public void setNivelDivergencia(double nivelDivergencia) {
        this.nivelDivergencia = nivelDivergencia;
    }

    public boolean isRiesgoParadoja() {
        return riesgoParadoja;
    }

    public void setRiesgoParadoja(boolean riesgoParadoja) {
        this.riesgoParadoja = riesgoParadoja;
    }

    //toString
    @Override
    public String toString() {
        return "FragmentoAlternativo{" +
                "nivelDivergencia=" + nivelDivergencia +
                ", riesgoParadoja=" + riesgoParadoja +
                '}';
    }


    //Métodos abstractos
    @Override
    public String getTipo() {
        return "FragmentoAlternativo";
    }


    @Override
    public boolean esExhibible() {
        boolean esExhibible;

        if (riesgoParadoja==false) {
            esExhibible = true;
        } else {
            esExhibible = false;
        }

        return esExhibible;
    }
}
