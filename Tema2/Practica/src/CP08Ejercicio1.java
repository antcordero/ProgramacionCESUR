import java.util.Scanner;

public class CP08Ejercicio1 {
    public static void main(String[] args) {

        int num;
        boolean esPrimo = true;
        int i = 2;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntroduce un número: ");
        num=sc.nextInt();

        sc.close();

        while (esPrimo && i<num/2) {
            if (num%i==0) {
                esPrimo=false;
            }
            i++;
        }

        if (num==1 || !esPrimo) {
            System.out.println("No es Primo");
        } else {
            System.out.println("Es primo");
        }
    }
}
