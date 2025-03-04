import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nHasentur");

        Scanner sc = new Scanner(System.in);

        boolean finBucle = false;

        while (!finBucle) {
            Empleado empleado = new Empleado();

            //Nombre + opción de fin
            System.out.print("\nIntroduzca eI nombre del empleado: ");
            String nombre = sc.nextLine();
            if (nombre.equals("FIN") || nombre.equals("fin")) {
                finBucle = true;
                System.out.println("Finalizando la entrada de empleados.");
            } else {
                empleado.setNombre(nombre);

                //Salario
                System.out.print("Introduzca el salario base: ");
                double salario = Double.parseDouble(sc.nextLine());
                try {
                    if (salario <= 0) {
                        throw new SalarioInvalidoException(salario);
                    } else {
                        empleado.setSalarioBase(salario);

                        //Bonus
                        System.out.print("Introduzca el bonificacion: ");
                        double bonificacion = Double.parseDouble(sc.nextLine());
                        try {
                            if ((bonificacion > salario/2) || (bonificacion <= 0)) {
                                throw new BonificacionInvalidaException(bonificacion);
                            } else {
                                empleado.setBonificacion(bonificacion);

                                //Imprimir datos del empleado
                                System.out.println(empleado.toString());

                            }
                        } catch (BonificacionInvalidaException exBonus) {
                            System.out.println(exBonus.getMessage());
                        }

                    }
                } catch (SalarioInvalidoException exSalario) {
                    System.out.println(exSalario.getMessage());
                }
            }
        }
    }
}
