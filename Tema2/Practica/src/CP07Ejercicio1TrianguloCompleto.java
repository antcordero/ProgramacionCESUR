import java.util.Scanner;

public class CP07Ejercicio1TrianguloCompleto {
    public static void main(String[] args) {

        int altura;
        int ancho=1;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nAltura: ");
            altura = sc.nextInt();
        } while (altura<1);

        sc.close();

        //Pintar
        for (int i = 1; i <= altura; i++) {
            //Pintar espacios
            for (int j = 0; j < altura-i; j++) {
                if (j == altura - i) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
            //Pintar carácter
            for (int j = 1; j <= ancho; j++) {
                System.out.print("*");
            }
            //Salto de línea
            System.out.println("");
            ancho+=2;
        }

    }
}
