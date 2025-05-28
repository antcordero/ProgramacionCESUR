package model;

public class ArtefactoPercepcion extends ArtefactoTemporal{
    private int duracion;
    private String tipoPercepcion;


    //Constructor
    public ArtefactoPercepcion(int id, String nombre, int anioDescubrimiento, String nivelAcceso, String ubicacionActual, int duracion, String tipoPercepcion) {
        super(id, nombre, anioDescubrimiento, nivelAcceso, ubicacionActual);
        this.duracion = duracion;
        this.tipoPercepcion = tipoPercepcion;
    }

    //Getters-Setters
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTipoPercepcion() {
        return tipoPercepcion;
    }

    public void setTipoPercepcion(String tipoPercepcion) {
        this.tipoPercepcion = tipoPercepcion;
    }

    //toString
    @Override
    public String toString() {
        return "ArtefactoPercepcion{" + super.toString() +
                "duracion=" + duracion +
                ", tipoPercepcion='" + tipoPercepcion + '\'' +
                '}';
    }


    //Métodos Abstractos
    @Override
    public String getTipo() {
        return "ArtefactoPercepcion";
    }

    @Override
    public boolean esExhibible() {

        boolean esExhibible;

        if (duracion<=60) {
            esExhibible = true;
        } else {
            esExhibible = false;
        }


        return esExhibible;
    }



}
