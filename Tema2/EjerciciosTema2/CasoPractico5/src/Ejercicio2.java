import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        String dia;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndique el día de la semana: ");
        dia = sc.nextLine().toLowerCase();

        switch (dia) {
            case "lunes", "martes", "miercoles", "miércoles", "jueves", "viernes":
                System.out.println("Día laborable.");
                break;
            case "sabado", "sábado", "domingo":
                System.out.println("Día no laborable.");
                break;
            default:
                System.out.println("ERROR en la entrada de datos.");
        }

        sc.close();
    }
}
