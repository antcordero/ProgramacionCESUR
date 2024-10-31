import java.util.Scanner;

public class CP05Ejercicio1 {
    public static void main(String[] args) {

        int n;
        int pares=0;
        int sumaPares=0;
        int impares=0;
        int sumaImpares=0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("nº %d -> ", i);
            n = sc.nextInt();

            if (n%2==0 && n!=0) {
                pares++;
                sumaPares+=n;
            } else if (n!=0) {
                impares++;
                sumaImpares+=n;
            }
        }

        sc.close();

        System.out.printf("Total de números pares = %d\nSuma de los pares = %d\n", pares, sumaPares);

        if (impares>0) {
            System.out.printf("Promedio de los impares = %.2f\n", (double) (sumaImpares/impares));
        } else {
            System.out.println("No había números impares.");
        }

    }
}
