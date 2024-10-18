import java.util.Scanner;

public class LibroJavaBuclesEj19 {
    /*
    * Ejercicio 19
        Realiza un programa que pinte una pirámide por pantalla. La altura se debe
        pedir por teclado. El carácter con el que se pinta la pirámide también se debe
        pedir por teclado
    * */

    public static void main(String[] args) {

        int altura;
        char caracter;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDe la altura de la pirámide: ");
        altura = sc.nextInt();
        System.out.print("De la carácter de la pirámide: ");
        caracter = sc.next().charAt(0);

        // Bucle pirámide
        for (int i=0; i<altura; i++) {
            // Pintar carácter
            for (int j=0; j<i+1; j++) {
                System.out.printf("%c ", caracter);
            }
            //Salto de línea
            System.out.println("");
        }

        sc.close();
    }
}
