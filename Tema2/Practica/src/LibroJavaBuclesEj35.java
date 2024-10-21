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
        int nuevaAltura;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndica la altura: ");
        altura=sc.nextInt();

        sc.close();

        nuevaAltura=altura*2;

        //Pirámide normal
        for (int i = 0; i < nuevaAltura ; i++) {
            //Primer triángulo -> normal
            if (altura<=nuevaAltura/2) {
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
            //Segundo triángulo -> invertido
            } else {
                //Pirámide invertida
                for (int k = 0; k < altura ; k++) {
                    //espacios
                    for (int n = 0; n < i - 1; n++) {
                        System.out.print(" ");
                    }

                    //carácter
                    for (int m = 0; m < i + 1; m++) {
                        if ((m == 0) || (m == i)) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            }
            //salto de línea
            System.out.println("");
        }
    }
}
