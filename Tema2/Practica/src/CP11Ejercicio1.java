public class CP11Ejercicio1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 55; i+=5) {
            System.out.printf("%dºF -> %.2fºC\n", i, (double) ((((i*-32)*5))/9) );
        }
    }
}
