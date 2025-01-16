package ejercicio1;

public class Test {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(4);

        empresa.agregarEmpleado(0, new Empleado("Juan", Rol.ADMIN, 3000));
        empresa.agregarEmpleado(1, new Empleado("Ana", Rol.GERENTE, 2000));
        empresa.agregarEmpleado(2, new Empleado("Carlos", Rol.EMPLEADO, 1500));
        empresa.agregarEmpleado(3, new Empleado("Lucía", Rol.EMPLEADO, 1600));

        empresa.mostrarSalarios();
        System.out.printf("Total de salarios: %.2f€%n",empresa.calcularSalarioTotal());
    }
}
