import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int i;
        int j;

        Scanner sc = new Scanner(System.in);

        for (i=0; i<=9 ; i++) {
            for (j=0; j<i+1 ; j++) {
                System.out.printf("%d,", j);
            }
            System.out.println("");
        }

        sc.close();
    }
}
