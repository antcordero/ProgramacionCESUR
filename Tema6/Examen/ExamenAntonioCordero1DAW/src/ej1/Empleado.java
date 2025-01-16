package ej1;

public class Empleado {
    private static String nombre;
    private static Rol rolEmpleado;
    private static double salarioBase;
    private final static double BONO_BASE = 1.10; //bono del 10%

    //Constrsuctor
    public Empleado(String nombre, Rol rolEmpleado, double salarioBase) {
        this.nombre = nombre;
        setRolEmpleado(rolEmpleado);
        this.salarioBase = salarioBase;
    }

    //Getter - Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(Rol rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    //toString
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", rolEmpleado=" + rolEmpleado +
                ", salarioBase=" + salarioBase +
                ", BONO_BASE=" + BONO_BASE +
                '}';
    }

    //Métodos

    /*
     *  método para añadir el bono extra (además del bono base)
     */
    public static double sueldoUnitarioEmpleado() {
        double resultado = salarioBase;

        switch (rolEmpleado.toString()) {
            case "ADMIN" -> resultado = resultado + (resultado*BONO_BASE) + 1000;
            case "GERENTE" -> resultado = resultado + (resultado*BONO_BASE) + 500;
            case "EMPLEADO" -> resultado = resultado + (resultado*BONO_BASE);
        }

        return resultado;
    }


}
