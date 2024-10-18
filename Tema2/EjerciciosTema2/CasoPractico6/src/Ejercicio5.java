import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int i;
        int j;

        int cont=0;

        Scanner sc = new Scanner(System.in);

        for (i=0; i<=9 ; i++) {
            for (j=9; j>=i ; j--) {
                System.out.printf("%d,", cont);
                cont++;
            }
            cont=i+1;
            System.out.println("");
        }

        sc.close();
    }
}
