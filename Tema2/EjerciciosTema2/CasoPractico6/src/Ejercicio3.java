import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int i;
        int j;

        int altura;

        Scanner sc = new Scanner(System.in);

        //Pedir altura del lado + comprobación
        do {
            System.out.print("\nDe la altura: ");
            altura = sc.nextInt();
        } while (altura<=0);

        for (i=0; i<altura ; i++) {
            for (j=0; j<i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
}
