import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int veces;
        int tirada;
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int num5=0;
        int num6=0;

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("\nCuántas veces se lanza el dado?: ");
        veces=sc.nextInt();

        sc.close();

        //Veces que se lanza el dado
        for (int i = 0; i < veces ; i++) {
            tirada=r.nextInt(6)+1;

            switch (tirada) {
                case 1 -> num1++;
                case 2 -> num2++;
                case 3 -> num3++;
                case 4 -> num4++;
                case 5 -> num5++;
                case 6 -> num6++;
                default -> System.out.println("ERROR");
            }
        }

        System.out.printf("Ha salido el 1 -> %d veces\n", num1);
        System.out.printf("Ha salido el 2 -> %d veces\n", num2);
        System.out.printf("Ha salido el 3 -> %d veces\n", num3);
        System.out.printf("Ha salido el 4 -> %d veces\n", num4);
        System.out.printf("Ha salido el 5 -> %d veces\n", num5);
        System.out.printf("Ha salido el 6 -> %d veces\n", num6);

    }
}
