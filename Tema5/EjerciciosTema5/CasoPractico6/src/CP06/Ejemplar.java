package CP06;

public class Ejemplar {

    private String tiutlo;
    private String autor;
    private String anyoPublicacion;

    //Constructor
    public Ejemplar(String tiutlo, String autor, String anyoPublicacion) {
        this.tiutlo = tiutlo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
    }

    //Getter - Setter
    public String getTiutlo() {
        return tiutlo;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(String anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    //toString
    @Override
    public String toString() {
        return "Ejemplar: " +
                "Tiutlo: " + tiutlo +
                ", Autor: " + autor +
                ", Año de Publicación = " + anyoPublicacion +
                "\n";
    }

    //Método mostrarInfo
    public void mostrarInfo() {
        System.out.println(this);
    }

}
