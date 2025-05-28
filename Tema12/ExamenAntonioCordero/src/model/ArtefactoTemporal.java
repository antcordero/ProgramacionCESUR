package model;

public abstract class ArtefactoTemporal implements Exhilible, Comparable<ArtefactoTemporal>  {
    private int id;
    private String nombre;
    private int anioDescubrimiento;
    private String nivelAcceso;
    private String ubicacionActual;

    //Constructor
    public ArtefactoTemporal(int id, String nombre, int anioDescubrimiento, String nivelAcceso, String ubicacionActual) {
        this.id = id;
        this.nombre = nombre;
        this.anioDescubrimiento = anioDescubrimiento;
        this.nivelAcceso = nivelAcceso;
        this.ubicacionActual = ubicacionActual;
    }

    //Getters - Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioDescubrimiento() {
        return anioDescubrimiento;
    }

    public void setAnioDescubrimiento(int anioDescubrimiento) {
        this.anioDescubrimiento = anioDescubrimiento;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public String getUbicacionActual() {
        return ubicacionActual;
    }

    public void setUbicacionActual(String ubicacionActual) {
        this.ubicacionActual = ubicacionActual;
    }

    //toString

    @Override
    public String toString() {
        return " id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anioDescubrimiento=" + anioDescubrimiento +
                ", nivelAcceso='" + nivelAcceso + '\'' +
                ", ubicacionActual='" + ubicacionActual + '\'' +
                '}';
    }

    //Método getTipo
    public abstract String getTipo();

    //Comparable

    @Override
    public int compareTo(ArtefactoTemporal o) {
        return this.getId();

    }
}
