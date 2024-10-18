    /*
    * Ejercicio 35
    * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
    * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
    * igual a 3, en caso contrario se debe mostrar un mensaje de error.
    *
    * Ejemplo:
    * Por favor, introduzca la altura de la X: 5
    * *   *
    *  * *
    *   *
    *  * *
    * *   *
    *
    * */

    import java.util.Scanner;

    public class LibroJavaBuclesEj35 {

    public static void main(String[] args) {

        int altura;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndica la altura: ");
        altura=sc.nextInt();

        //Pirámide normal
        for (int i = 0; i < altura ; i++) {
            //espacios
            for (int j = 0; j < altura-i ; j++) {
                System.out.print(" ");
            }

            //carácter
            for (int l=0; l<i+1; l++) {
                if ((l==0) || (l==i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            //salto
            System.out.println("");
        }

        //fila última
        for (int l = 0; l <= altura; l++) {
            System.out.print("* ");
        }

/*
        //Pirámide invertida
        for (int i = altura; i >= 0 ; i++) {
            //espacios
            for (int j = 0; j <  ; j--) {
                System.out.print(" ");
            }

            //carácter
            for (int l=0; l<i+1; l++) {
                if ((l==0) || (l==i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            //salto
            System.out.println("");
        }
*/

        sc.close();
    }
}
