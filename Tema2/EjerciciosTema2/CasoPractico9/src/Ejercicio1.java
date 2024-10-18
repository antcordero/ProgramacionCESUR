import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int lado;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIndica el lado: ");
            lado= sc.nextInt();
        } while (lado<=1);

        sc.close();

        for (int i = 1; i <= lado; i++) {
            //Linea inicial y final
            if (i==1 || i==lado) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("* ");
                }
            }
            //primer carácter, espacios y columna final
            if (i>1&&i<lado) {
                for (int j = 1; j <= lado ; j++) {
                    if (j==1 || j==lado) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            //Salto de línea
            System.out.println("");
        }
    }
}
