public class Revista extends Ejemplar{
    private String numEdicion;
    private Frecuencia frecuencia;

    public Revista(String titulo, String autor, String anhoPublicacion, String numEdicion, String frecuencia) {
        super(titulo, autor, anhoPublicacion);
        this.numEdicion = numEdicion;
        comprobarFrecuencia(frecuencia);
    }

    public String getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(String numEdicion) {
        this.numEdicion = numEdicion;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        comprobarFrecuencia(frecuencia);
    }

    @Override
    public String toString() {
        return super.toString()+" - Revista{" +
                "numEdicion='" + numEdicion + '\'' +
                ", frecuencia=" + frecuencia +
                '}';
    }

    public void mostrarInfo(){
        System.out.println(this);
    }

    private void comprobarFrecuencia(String frecuencia){
        switch (frecuencia.toUpperCase()){
            case "SEMANAL" -> this.frecuencia = Frecuencia.SEMANAL;
            case "MENSUAL" -> this.frecuencia = Frecuencia.MENSUAL;
            case "TRIMESTRAL" -> this.frecuencia = Frecuencia.TRIMESTRAL;
            case "SEMESTRAL" -> this.frecuencia = Frecuencia.SEMESTRAL;
            default -> this.frecuencia = Frecuencia.ANUAL;
        }
    }
}
