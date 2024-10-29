public class CP06Ejercicio5 {
    public static void main(String[] args) {

        for (int i = 0; i <= 9 ; i++) {
            for (int j = i; j <= 9; j++) {
                if (j==9) {
                    System.out.printf("%d.", j);
                } else {
                    System.out.printf("%d,", j);
                }
            }
            System.out.println("");
        }
        
    }
}
