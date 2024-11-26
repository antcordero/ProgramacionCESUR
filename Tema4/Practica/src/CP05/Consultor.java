package CP05;

public class Consultor extends Empleado{

    private String categoria;

    //Consttructor
    public Consultor(String dni, String nombre, String apellido, String domicilio, String codigoPostal, String ciudad, PuestoTrabajo puesto, String categoria) {
        super(dni, nombre, apellido, domicilio, codigoPostal, ciudad, puesto);
        this.categoria = categoria;
    }

    //Getters - Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //toString
    @Override
    public String toString() {
        return "Consultor{" +
                "categoria='" + categoria + '\'' + super.toString();
    }

    //Métodos
    public void getAtributos() {
        System.out.println(this);
    }
}
