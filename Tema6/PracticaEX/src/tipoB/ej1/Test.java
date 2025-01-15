package tipoB.ej1;

public class Test {
    public static void main(String[] args) {
        //Crear la empresa con capacidad para 10 empleados
        Empresa empresa = new Empresa(10);

        //Crear empleados
        Empleado e1 = new Empleado("Juan", "administrador", 3900);
        Empleado e2 = new Empleado("Ana", "gerente", 1900);
        Empleado e3 = new Empleado("Carlos", "empleado", 1800);
        Empleado e4 = new Empleado("Lucía", "empleado", 1900);

        //Agregar empleados a la empresa
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);

        //Mostrar info de los empleados
        System.out.printf("\n%s: %.2f", e1.getNombre(), e1.calcularSalarioUnitario());
        System.out.printf("\n%s: %.2f", e2.getNombre(), e2.calcularSalarioUnitario());
        System.out.printf("\n%s: %.2f", e3.getNombre(), e3.calcularSalarioUnitario());
        System.out.printf("\n%s: %.2f", e4.getNombre(), e4.calcularSalarioUnitario());

        //Calcular total y mostrar
        System.out.printf("\nTotal de salarios: %.2f€\n", empresa.calcularSalarioGlobal());
    }
}
