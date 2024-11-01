import java.util.Scanner;

public class CP07Ejercicio2 {
    public static void main(String[] args) {

        int anio;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nAño: ");
            anio = sc.nextInt();
        } while (anio<0);

        boolean condicion1 = (anio%4==0 && anio%100!=0);
        boolean condicion2 = (anio%400==0 && anio%100==0);

        if (condicion1 || condicion2) {
            System.out.printf("El año %d es bisiesto\n", anio);
        } else {
            System.out.printf("El año %d no es bisiesto\n", anio);
        }

    }
}
