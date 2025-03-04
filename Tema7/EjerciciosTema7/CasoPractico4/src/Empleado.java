public class Empleado {
    private String nombre;
    private double salarioBase;
    private double bonificacion;

    /*
    public Empleado(String nombre, double salarioBase, double bonificacion) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }
    */

    //Constructor vacío
    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString() {
        return "Emppleado: " + nombre +
                "\nSalario Base: " + salarioBase + "€" +
                "\nBonificación: " + bonificacion + "€" +
                "\nSalario Total: " + (salarioBase + bonificacion) + "€";
    }


}
