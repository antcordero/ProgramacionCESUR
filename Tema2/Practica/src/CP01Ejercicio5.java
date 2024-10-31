public class CP01Ejercicio5 {
    public static void main(String[] args) {

        int cont=0;

        for (int i = 1; i <=30 ; i++) {

            if ((i % 2 == 0) || (i % 3 == 0)) {
                //Quitar coma final
                if (i == 30) {
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("%d, ", i);
                }

                cont++;
            }
        }
        //Resolución
        System.out.printf("\nTotal números: %d", cont);
    }
}
