package CP05;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String codigoPostal;
    private String ciudad;
    private PuestoTrabajo puesto;

    //Constructor
    public Empleado(String dni, String nombre, String apellido, String domicilio, String codigoPostal, String ciudad, PuestoTrabajo puesto) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.puesto = puesto;
    }

    //Getters - Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public PuestoTrabajo getPuesto() {
        return puesto;
    }

    public void setPuesto(PuestoTrabajo puesto) {
        this.puesto = puesto;
    }

    //toString
    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", puesto=" + puesto.getDescripcion() +
                '}';
    }

    //Metodo
    public void getAtributos() {
        System.out.println(this);
    }
}
