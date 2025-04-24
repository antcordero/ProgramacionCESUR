public class Empleado {
    private String nombre;
    private String sueldo;
    private String departamento;

    public Empleado(String nombre, String sueldo, String departamento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\n" +
                "Sueldo: " + sueldo + " €\n" +
                "Departamento: " + departamento + "\n";
    }
}
