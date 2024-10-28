public class CP01Ejercicio5 {
    public static void main(String[] args) {

        for (int i = 1; i <=100 ; i++) {
            //Quitar cóma del final
            if ((i % 2 == 0) || (i % 3 == 0)) {
                if (i == 100) {
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("%d, ", i);
                }
            }
        }

    }
}
