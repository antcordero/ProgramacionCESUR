import java.util.Scanner;

public class CP07Ejercicio1TrianguloVacío {
    public static void main(String[] args) {

        int altura;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nAltura: ");
            altura = sc.nextInt();
        } while (altura <= 2);

        for (int i = 1; i < altura ; i++) {
            //pintar espacios iniciales
            for (int j = 0; j < altura-i ; j++) {
                System.out.print(" ");
            }
            //Pintar carácter pero solo el primero y el último
            for (int j = 1; j <= i ; j++) {
                if (j==1 || j==i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //Salto de línea
            System.out.println("");
        }

        //Fila última completa
        for (int i = 0; i < altura ; i++) {
            System.out.print("* ");
        }

        sc.close();
    }
}
