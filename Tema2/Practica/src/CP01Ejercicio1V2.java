import java.util.Scanner;

public class CP01Ejercicio1V2 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;

        int mayor;
        String posicion = "primer";

        Scanner sc = new Scanner(System.in);

        System.out.print("\nPrimer número: ");
        num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Tercer número: ");
        num3 = sc.nextInt();

        sc.close();

        //Comprobaciones
        mayor = num1;

        if (num2>mayor) {
            posicion = "segundo";
            mayor = num2;
        }
        if (num3>mayor) {
            posicion = "tercer";
            mayor = num3;
        }

        System.out.printf("El %s número (%d) es el mayor\n", posicion, mayor);
    }
}
