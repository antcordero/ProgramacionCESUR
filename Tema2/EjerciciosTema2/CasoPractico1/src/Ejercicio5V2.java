import java.util.Scanner;

public class Ejercicio5V2 {
    //Muestra y cuenta los números que hay entre 1 y 100 que son múltiplos de 2 o 3

    public static void main(String[] args) {

        int i; //Contador
        int contMultiplo = 0;

        System.out.print("\n Múltiplos de 2 y 3\n" +
                            "-------------------");

        for (i=1 ; i <= 100 ; i++) {

            if ((i%2==0) || (i%3==0)){
                System.out.printf("\n-> %d", i);
                contMultiplo++;
            }
        }

        System.out.printf("\nEn total hay %d múltiplos de 2 ó 3 entre 1 y 100\n", contMultiplo);
    }
}