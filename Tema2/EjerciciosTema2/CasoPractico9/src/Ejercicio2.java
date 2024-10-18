import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        double horas;
        String turno="";
        String tipoDia="";
        double sueldo=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nNúmero de horas: ");
            horas= sc.nextInt();
        } while (horas<=0 || horas>=24);
        do {
            System.out.print("Indica el turno (Diurno o Nocturno): ");
            turno=sc.next().toLowerCase();
        } while (!(turno.equals("diurno") || turno.equals("nocturno")));
        do {
            System.out.print("Indica el tipo de día (Laborable o Festivo): ");
            tipoDia=sc.next().toLowerCase();
        } while (!(tipoDia.equals("laborable") || tipoDia.equals("festivo")));

        sc.close();

        //Calcular sueldo
        //Turno
        if (turno.equals("diurno")) {
            sueldo = horas*10;
            //Tipo dia
            if (tipoDia.equals("festivo")){
                sueldo *=1.10;
            }
        } else if (turno.equals("nocturno")){
            sueldo = horas*13.5;
            //Tipo día
            if (tipoDia.equals("festivo")){
                sueldo *=1.15;
            }
        }

        //Resultado
        System.out.printf("\nSueldo = %.2f €\n", sueldo);
    }
}
