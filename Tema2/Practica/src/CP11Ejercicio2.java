import java.util.Random;
import java.util.Scanner;

public class CP11Ejercicio2 {
    public static void main(String[] args) {

        int veces;
        int tirada;
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        int cont6=0;

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        do {
            System.out.print("\n¿Cuántas veces lanzo el dado? ");
            veces = sc.nextInt();
            if (veces <= 0) {
                System.out.print("No puede ser 0 veces, vuelve a introducir un nuevo dato...");
            }
        } while (veces <= 0);

        for (int i = 1; i <= veces; i++) {
            tirada=r.nextInt(6)+1;
            if (tirada==1) {
                cont1++;
            } else if (tirada==2) {
                cont2++;
            } else if (tirada==3) {
                cont3++;
            } else if (tirada==4) {
                cont4++;
            } else if (tirada==5) {
                cont5++;
            } else if (tirada==6) {
                cont6++;
            }
        }

        sc.close();

        System.out.printf("Ha salido el 1 = %d veces\n", cont1);
        System.out.printf("Ha salido el 2 = %d veces\n", cont2);
        System.out.printf("Ha salido el 3 = %d veces\n", cont3);
        System.out.printf("Ha salido el 4 = %d veces\n", cont4);
        System.out.printf("Ha salido el 5 = %d veces\n", cont5);
        System.out.printf("Ha salido el 6 = %d veces\n", cont6);
    }
}
