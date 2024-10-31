import java.util.Scanner;

public class CP04Ejercicio2 {
    public static void main(String[] args) {

        int num;
        int par=0;
        int impar=0;
        int positivo=0;
        int negativo=0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("nº %d -> : ", i);
            num = sc.nextInt();
            //Comprobar
            if (num!=0 && num%2==0) {
                par++;
            } else {
                impar++;
            }
            if (num>0) {
                positivo++;
            } else {
                negativo++;
            }
        }

        sc.close();

        System.out.printf("Pares: %d\nImpares: %d\nPositivos: %d\nNegativos: %d\n", par, impar, positivo, negativo);

    }
}
