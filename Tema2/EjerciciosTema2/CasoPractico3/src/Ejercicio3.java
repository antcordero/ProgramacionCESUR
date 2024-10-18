import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        String nombre;
        double sueldo;

        Scanner sc =  new Scanner(System.in);

        System.out.print("\nNombre: ");
        nombre = sc.nextLine();

        System.out.print("Sueldo Bruto: ");
        sueldo = sc.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.printf("Sueldo líquido:  %.2f €\n", (sueldo-(sueldo*0.2)));

        sc.close();
    }
}
