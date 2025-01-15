package tipoB.ej1;

public class Empleado {
    private String nombre;
    private Rol rolEmpleado;
    private double salarioBase;
    private final double bonoBase; //aplicable a todos los empleado por igual

    //
    public Empleado(String nombre, String rolEmpleado, double salarioBase) {
        this.nombre = nombre;
        comprobarRol(rolEmpleado);
        this.salarioBase = salarioBase;
        this.bonoBase = 100.00;
    }

    //
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        comprobarRol(rolEmpleado);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonoBase() {
        return bonoBase;
    }

    //
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", rolEmpleado=" + rolEmpleado +
                ", salarioBase=" + salarioBase +
                ", bonoBase=" + bonoBase +
                '}';
    }

    //Métodos

    /*
     *  Comprobar rol
     */
    private void comprobarRol(String rolEmpleado) {
        switch (rolEmpleado.toLowerCase()) {
            case "administrador"-> this.rolEmpleado = Rol.ADMIN;
            case "gerente" -> this.rolEmpleado = Rol.GERENTE;
            case "empleado" -> this.rolEmpleado = Rol.EMPLEADO;
        }
    }



}
