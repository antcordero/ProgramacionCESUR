import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int altura;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIndique la altura: ");
            altura = sc.nextInt();
        } while (altura<0);

        //Primer for para salto de línea
        for (int i = 1; i<=altura ; i++) {

            //Segundo for para pintar espacios
            for (int j = 0; j < altura-i ; j++) {
                System.out.print(" ");
            }

            //Tercer for para pintar carácter
            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }

            //Salto de línea
            System.out.println("");
        }

        sc.close();
    }
}
