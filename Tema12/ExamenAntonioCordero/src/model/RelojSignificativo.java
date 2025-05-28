package model;

public class RelojSignificativo extends ArtefactoTemporal {
    private String eventoHistorico;

    //Constructor
    public RelojSignificativo(int id, String nombre, int anioDescubrimiento, String nivelAcceso, String ubicacionActual, String eventoHistorico) {
        super(id, nombre, anioDescubrimiento, nivelAcceso, ubicacionActual);
        this.eventoHistorico = eventoHistorico;
    }

    //Getters-Setters
    public String getEventoHistorico() {
        return eventoHistorico;
    }

    public void setEventoHistorico(String eventoHistorico) {
        this.eventoHistorico = eventoHistorico;
    }

    //toString
    @Override
    public String toString() {
        return "RelojSignificativo{" + super.toString() +
                ", eventoHistorico='" + eventoHistorico + '\'' +
                '}';
    }

    //Métodos Abstractos
    @Override
    public String getTipo() {
        return "RelojSignificativo";
    }

    @Override
    public boolean esExhibible() {
        return getNivelAcceso().equalsIgnoreCase("bajo");
    }
}