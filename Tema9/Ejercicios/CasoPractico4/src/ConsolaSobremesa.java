public class ConsolaSobremesa extends Consola {
    private String resolucionMaxima;

    public ConsolaSobremesa(String nombre, String fabricante, String resolucionMaxima) {
        super(nombre, fabricante);
        this.resolucionMaxima = resolucionMaxima;
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Consola de Sobremesa:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Resolución Máxima: " + resolucionMaxima + " pulgadas");
    }
}
