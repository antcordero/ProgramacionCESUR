package CP06;

public class Revista extends Ejemplar {
    private int numEdicion;
    private Frecuencia frecuencia;

    public Revista(String titulo, String autor, String anioPublicacion, int numEdicion, String frecuencia) {
        super(titulo, autor, anioPublicacion);
        this.numEdicion = numEdicion;
        comprobarFrecuencia(frecuencia);
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        comprobarFrecuencia(frecuencia);
    }

     //Métodos
     private void comprobarFrecuencia(String frecuencia) {
         switch (frecuencia.toLowerCase()) {
             case "semanal" -> this.frecuencia = Frecuencia.SEMANAL;
             case "mensual" -> this.frecuencia = Frecuencia.MENSUAL;
             case "trimestral" -> this.frecuencia = Frecuencia.TRIMESTRAL;
             default -> this.frecuencia = Frecuencia.DIARIA;
         }
     }

    //mostrarInfo sobreEscrito
    @Override
    public void mostrarInfo() {
        System.out.print(super.toString());
        System.out.printf("[Revista] Número de edición: %d - ", this.numEdicion);
        System.out.printf("Frecencia de publicación: %s", this.frecuencia);
    }
}
