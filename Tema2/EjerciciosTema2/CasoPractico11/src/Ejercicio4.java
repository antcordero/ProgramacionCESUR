import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int veces;
        int a;
        int b;
        int suma;
        int intento;
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        //Números aleatorios + suma
        a=r.nextInt(6)+1;
        b=r.nextInt(6)+1;
        suma = a+b;

        System.out.print("\nCuántos intentos necesitas para adivinar la suma de los dos dados? ");
        veces= sc.nextInt();

        //Autocomprobación
        System.out.printf("a = %d // b = %d // suma = %d\n", a, b, suma);

        for (int j = 1; j <= veces; j++) {

            System.out.printf("Intento nº%d: ", j);
            intento=sc.nextInt();

            if (intento<suma) {
                System.out.println("Tu suma es menor");
            } else if (intento>suma) {
                System.out.println("Tu suma es mayor");
            } else {
                System.out.println("Suma correcta");
                flag = false;
            }
        }

        if (!flag) {
            System.out.printf("Los números eran el %d y el %d - Suma = %d\n", a, b, suma);
        }

        sc.close();
    }
}
