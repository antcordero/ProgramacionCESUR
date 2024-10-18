import java.util.Scanner;

public class EjercicioPiramide {

    public static void main(String[] args) {

        int altura;

        int c = 0;

        Scanner sc = new Scanner(System.in);

        //Pedir altura del lado + comprobación
        do {
            System.out.print("\nDe la altura: ");
            altura = sc.nextInt();
        } while (altura<=0);

        for (int i = 0; i <= altura; i++) {
            //Pintar espacios
            for (int e = 0 ; e<=altura-i ; e++){
                //Pintar carácter

            }
            //Salto de línea
            System.out.println(" ");
        }

        sc.close();
    }
}
