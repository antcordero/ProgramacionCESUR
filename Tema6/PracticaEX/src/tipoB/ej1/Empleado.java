package tipoB.ej1;

public class Empleado {
    private String nombre;
    private Rol rolEmpleado;
    private double salarioBase;
    private final double bonoBase; //aplicable a todos los empleados por igual

    //
    public Empleado(String nombre, String rolEmpleado, double salarioBase) {
        this.nombre = nombre;
        comprobarRol(rolEmpleado);
        this.salarioBase = salarioBase;
        bonoBase = 100.00;
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

    /*
     *  Calcular el salario final de cada empleado en función de su rol y un bono estático.
     *  Para:
     *      - admin: 500
     *      - gerente: 1000
     *      - empleado: 100
     */
    public double calcularSalarioUnitario() {
        double resultado = 0;

        switch (rolEmpleado) {
            case ADMIN -> resultado += this.salarioBase + 500 + bonoBase;
            case GERENTE -> resultado += this.salarioBase + 1000 + bonoBase;
            case EMPLEADO -> resultado += this.salarioBase + 100 + bonoBase;
        }

        return resultado;
    }

    /*
     *   Los empleados deben ser gestionados en un array dentro de la clase Empresa.
     */



}
