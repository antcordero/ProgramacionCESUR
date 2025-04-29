public abstract class Consola {
    protected String nombre;
    protected String fabricante;

    //Constructor
    public Consola(String nombre, String fabricante) {
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Consola: Nombre: " + nombre + ", fabricante='" + fabricante + "\n";
    }

    /**
     * Método abstracto para mostrar detalles. No lleva cuerpo
     */
    public abstract void mostrarDetalles();

}
