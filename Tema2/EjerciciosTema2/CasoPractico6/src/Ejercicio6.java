public class Ejercicio6 {

    public static void main(String[] args) {

        int i;
        int j;

        for (i=1; i<=9 ; i++) {
            for (j=1; j<=i ; j++) {
                System.out.printf("%d,", i);
            }
            System.out.println("");
        }
    }
}
