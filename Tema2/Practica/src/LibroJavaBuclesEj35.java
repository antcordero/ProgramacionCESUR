import java.util.Scanner;

/*
     * Ejercicio 35
     * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
     * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
     * igual a 3, en caso contrario se debe mostrar un mensaje de error.
     *
     * Ejemplo:
     * Por favor, introduzca la altura del rombo: 5
     *
     *  *   *
     *   * *
     *    *
     *   * *
     *  *   *
     *
     */
public class LibroJavaBuclesEj35 {

    public static void main(String[] args) {

        int altura;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndica la altura: ");
        altura=sc.nextInt();

        sc.close();

        //Pirámide invertida
        for (int i = 0; i < altura/2 ; i++) {
            //espacios
            for (int n = 0; n <= i - 1; n++) {
                System.out.print(" ");
            }

            //carácter
            for (int m = 0; m < (altura/2)+1; m++) {
                if ((m == 0) || (m == (altura/2)-i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //salto de línea
            System.out.println("");
        }

        //Pirámide normal
        for (int i = 0; i <= altura/2 ; i++) {
            //espacios
            for (int j = 0; j < (altura/2) - i; j++) {
                System.out.print(" ");
            }
            //carácter
            for (int l = 0; l < i + 1; l++) {
                if ((l == 0) || (l == i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            //salto de línea
            System.out.println("");
        }
    }

}
