package CP05;

public class Administrador extends Empleado{
    private int antiguedad;

    //Constructor
    public Administrador(String dni, String nombre, String apellido, String domicilio, String codigoPostal, String ciudad, PuestoTrabajo puesto, int antiguedad) {
        super(dni, nombre, apellido, domicilio, codigoPostal, ciudad, puesto);
        this.antiguedad = antiguedad;
    }

    //Getter - Setter
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    //toString
    @Override
    public String toString() {
        return "Administrador{" +
                "antiguedad=" + antiguedad + super.toString();
    }

    //Metodo
    public void getAtributos() {
        System.out.println(this);
    }

}
