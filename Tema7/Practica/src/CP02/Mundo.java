package CP02;

public class Mundo {

    private String nombre;
    private int diametro;
    private boolean habitable;

    //Constructores
    public Mundo(String nombre, int diametro, boolean habitable) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.habitable = habitable;
    }

    public Mundo() {
        this.nombre = "";
        this.diametro = 0;
        this.habitable = false;
    }

    //Getters - Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    //toString
    @Override
    public String toString() {
        return "Mundo{" +
                "nombre='" + nombre + '\'' +
                ", diametro=" + diametro +
                ", habitable=" + habitable +
                '}';
    }
}
