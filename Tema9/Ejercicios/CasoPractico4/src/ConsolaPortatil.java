public class ConsolaPortatil extends Consola {
    private double duracionBateria;

    public ConsolaPortatil(String nombre, String fabricante, double duracionBateria) {
        super(nombre, fabricante);
        this.duracionBateria = duracionBateria;
    }

    public double getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(double duracionBateria) {
        this.duracionBateria = duracionBateria;
    }


    @Override
    public void mostrarDetalles() {
        System.out.println("Consola Portátil:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Duración Batería: " + duracionBateria + " horas");
    }
}
