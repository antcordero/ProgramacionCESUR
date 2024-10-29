import java.util.Scanner;

public class CP06Ejercicio1 {
    public static void main(String[] args) {

        int n;
        int num;
        int mayor=0;
        int menor=0;
        int contPares=0;
        int sumaPares=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIntroduce el número de veces: ");
            n=sc.nextInt();
        } while (n < 0);

        System.out.print("Introduce el número 1: ");
        num=sc.nextInt();

        //Para el mayor y menor
        mayor = num;
        menor = num;

        //Contar pares
        if (num%2==0 && num!=0) {
            sumaPares+=num;
            contPares++;
        }

        for (int i = 2; i <= n; i++) {
            System.out.printf("Introduce el número %d: ", i);
            num=sc.nextInt();
            //Contar pares
            if (num%2==0 && num!=0) {
                sumaPares+=num;
                contPares++;
            }

            //Mayor
            if (num>mayor) {
                mayor = num;
            }
            //Menor
            if (num<menor) {
                menor = num;
            }

        }

        sc.close();

        System.out.println("El mayor de todos es el " + mayor);
        System.out.println("El menor de todos es el " + menor);

        if (contPares>0) {
            System.out.printf("La media de los números pares introducidos es: %.2f\n", (double) (sumaPares/contPares));
        } else {
            System.out.println("No había ningún número par");
        }

    }
}
