public class Ejercicio4 {

    public static void main(String[] args) {

        int i;
        int suma = 0;

        for (i=50  ; i>=20 ; i = i -2) {

            //Quitar "+" del final
            if (i>20){
                System.out.printf("%d + ", i);
            } else {
                System.out.printf("%d", i);
            }

            suma = suma + i;
        }
        System.out.printf("\nSuma %d", suma);
    }
}
