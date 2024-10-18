import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int num;
        int cont = 2;

        boolean primo = true;

        Scanner sc = new Scanner(System.in);

        //Pedir dato + comprobación
        do {
            System.out.print("\nDe un número entero positivo: ");
            num = sc.nextInt();
        } while (num<0) ;

        while (cont<=num-1 && primo) {
            if (num%cont == 0) {
                primo = false;
            }
            cont++;
        }

        //Imprimir resultado
        if (primo && num>1) {
            System.out.printf("%d es primo\n", num);
        } else {
            System.out.printf("%d no es primo\n", num);
        }

        sc.close();
    }
}
