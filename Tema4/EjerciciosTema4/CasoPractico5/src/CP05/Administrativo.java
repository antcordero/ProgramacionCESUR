package CP05;

public class Administrativo extends Empleado{
    private int antiguedad;

    //Constructor
    public Administrativo(String dni, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad, PuestoTrabajo puesto, int antiguedad) {
        super(dni, nombre, apellidos, domicilio, codigoPostal, ciudad, puesto);
        this.antiguedad = antiguedad;
    }

    //Setters & Getters

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "Administrativo{" +
                "antiguedad='" + antiguedad + '\'' +
                '}';
    }

    //Métodos
    @Override
    public void getAtributos() {
        super.getAtributos();
        System.out.println("Antigüedad: " + this.antiguedad);
    }
}
