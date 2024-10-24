public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("\nGrados ºF a ºC");

        //Grados ºF de 5 en 5
        for (int i = 0; i <= 100; i+=5) {
            System.out.printf("%dºF -> %.2fºC\n", i, (((((i*1.0)-32)*5))/9));
        }

    }
}
