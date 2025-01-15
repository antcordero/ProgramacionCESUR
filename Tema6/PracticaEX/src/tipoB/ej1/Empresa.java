package tipoB.ej1;

public class Empresa {
    private final Empleado[] empleados;
    private int contadorEmpleados = 0;

    public Empresa(int capacidadEmpleados) {
        this.empleados = new Empleado[capacidadEmpleados];
        this.contadorEmpleados++;
    }

    /*
     *  Metodo para agregar empleados
     */
    public void agregarEmpleado(Empleado empleado) {
        int i=0;
        boolean encontrado = false;
        while (i<empleados.length && encontrado == false) {
            if (empleados[i] == null) {
                empleados[i] = empleado;
                encontrado = true;
            }
            i++;
        }
    }

    /*
     *  Metodo para calcular el salario global
     */
    public double calcularSalarioGlobal() {
        double resultado = 0;
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                resultado += empleado.calcularSalarioUnitario();
            }
        }
        return resultado;
    }

}

