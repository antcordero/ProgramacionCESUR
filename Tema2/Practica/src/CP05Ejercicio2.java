import java.util.Scanner;

public class CP05Ejercicio2 {
    public static void main(String[] args) {

        String dia;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDía de la semana: ");
        dia = sc.nextLine().toLowerCase();

        switch (dia) {
            case "lunes", "martes", "miercoles", "miércoles", "jueves", "viernes":
                System.out.println("\nLaborable");
            break;

            case "sabado", "sábado", "domingo":
                System.out.println("\nNo laborable");
            break;
        }

    }
}
