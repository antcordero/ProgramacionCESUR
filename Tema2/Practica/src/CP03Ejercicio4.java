public class CP03Ejercicio4 {
    public static void main(String[] args) {

        int suma = 0;

        for (int i = 50; i >= 20; i-=2) {
            suma += i;
            if (i>20) {
                System.out.printf("%d + ", i);
            } else {
                System.out.printf("%d. ", i);
            }
        }

        System.out.println("\nSuma = " + suma);

    }
}
