public class Administrativo extends Empleado{
    private int antiguedad;

    public Administrativo(String dni, String nombre, String apellidos, String domicilio, String codPostal, String ciudad, PuestoTrabajo puesto, int antiguedad) {
        super(dni, nombre, apellidos, domicilio, codPostal, ciudad, puesto);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return super.toString()+" Administrativo{" +
                "antiguedad=" + antiguedad +
                '}';
    }

    @Override
    public void getAtributos() {
        super.getAtributos();
        System.out.println(" Administrativo{" +
                "antiguedad=" + antiguedad +
                '}');
    }
}
