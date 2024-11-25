public class Consultor extends Empleado {
    private String categoria;

    public Consultor(String dni, String nombre, String apellidos, String domicilio, String codPostal, String ciudad, PuestoTrabajo puesto, String categoria) {
        super(dni, nombre, apellidos, domicilio, codPostal, ciudad, puesto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString()+" Consultor{" +
                "categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    public void getAtributos() {
        super.getAtributos();
        System.out.println(" Consultor{" +
                "categoria='" + categoria + '\'' +
                '}');
    }
}
