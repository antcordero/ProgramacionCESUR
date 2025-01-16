package ej1;

import java.util.Arrays;

import static ej1.Empleado.sueldoUnitarioEmpleado;

public class Empresa {
    private Empleado[] empleados;
    private int cont;

    public Empresa(int maximo) {
        this.empleados = new Empleado[maximo];
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    //toString
    @Override
    public String toString() {
        return "Empresa{" +
                "empleados=" + Arrays.toString(empleados) +
                '}';
    }

    //Métodos
    /*
     *  mérodo para agregar empleados
     */
    public void agregarEmpleado(int cont, Empleado empleado) {
        int i = 0;

        while (i<empleados.length) {
            if(empleados[i]!= null) {
                empleados[i] = empleado;
                System.out.println("empelado añadido");
            }
            i++;
        }
    }

    /*
     *  método para utilizar el nombre del empleado
     */
    private String nombreEmpleado(){

        String nombre ="";

        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i]!=null) {
                nombre += "" + empleados[i];
            }
        }
        return nombre;
    }

    /*
     *  mostrar salarios de cada empleado
     */
    public void mostrarSalarios() {

        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i]!=null) {
                System.out.printf("%s: %.2f\n", nombreEmpleado() ,sueldoUnitarioEmpleado());
            }
        }
    }

    /*
     *  Método para calccular salario de todos
     */
    public double calcularSalarioTotal() {
        double resultado = 0;

        for (int i = 0; i < empleados.length; i++) {
            resultado += sueldoUnitarioEmpleado();
        }

        return resultado;
    }

}
