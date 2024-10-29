public class CP06Ejercicio4 {
    public static void main(String[] args) {

        for (int i = 0; i <= 9 ; i++) {
            for (int j = 0; j <= i; j++) {
                if (j==i) {
                    System.out.printf("%d.", j);
                } else {
                    System.out.printf("%d,", j);
                }
            }
            System.out.println("");
        }
    }
}
