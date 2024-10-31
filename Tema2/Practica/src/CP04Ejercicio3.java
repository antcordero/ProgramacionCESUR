import java.util.Scanner;

public class CP04Ejercicio3 {
    public static void main(String[] args) {

        int suma=0;
        int cont=0;

        for (int i = 20; i <= 3500 ; i++) {
            if ((i*(i+1)/2)%7==0) {
                cont++;
                suma+=i;
            }
        }

        System.out.printf("Suma: %d\n", suma);
        System.out.printf("%d números cumplen la condición\n", cont);

    }
}
