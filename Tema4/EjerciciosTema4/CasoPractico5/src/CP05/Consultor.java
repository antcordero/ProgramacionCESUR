package CP05;

public class Consultor extends Empleado {
    private String categoria;

    //Constructor

    public Consultor(String dni, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad, PuestoTrabajo puesto, String categoria) {
        super(dni, nombre, apellidos, domicilio, codigoPostal, ciudad, puesto);
        this.categoria = categoria;
    }

    //Getters & Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Consultor{" +
                "categoria='" + categoria + '\'' +
                '}';
    }

    //Métodos
    @Override
    public void getAtributos() {
        super.getAtributos();
        System.out.println("Categoría: " + this.categoria);
    }
}
