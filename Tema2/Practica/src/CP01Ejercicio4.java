import java.util.Scanner;

public class CP01Ejercicio4 {
    public static void main(String[] args) {

        double calificacion;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIndique la calificación: ");
            calificacion = sc.nextDouble();
        } while (calificacion<0 || calificacion > 10);

        sc.close();

        if (calificacion >= 0 && calificacion < 4) {
            System.out.println("Insuficiente");
        } else if (calificacion >= 4 && calificacion < 6) {
            System.out.println("Regular");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("Bien");
        } else if (calificacion >= 7 && calificacion < 9) {
            System.out.println("Notable");
        } else if (calificacion >= 9 && calificacion < 10) {
            System.out.println("Sobresaliente");
        }

    }
}
