public class Tarea {
    private String titulo;
    private String descripcion;
    private String fecha;

    public Tarea(String titulo, String descripcion, String fecha) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Tarea(String titulo) {
        this.titulo = titulo;
    }

    public Tarea() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tarea: " + titulo + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Fecha de Vencimiento:" + fecha;
    }
}
