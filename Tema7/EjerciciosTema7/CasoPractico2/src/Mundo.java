public class Mundo {
    private String nombre;
    private double diametro;
    private boolean habitable;

    public Mundo(String nombre, double diametro, boolean habitable) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.habitable = habitable;
    }

    public Mundo() {
        this.nombre = "";
        this.diametro = 0;
        this.habitable = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }



}
