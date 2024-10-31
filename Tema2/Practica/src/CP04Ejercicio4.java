import java.util.Scanner;

public class CP04Ejercicio4 {
    public static void main(String[] args) {

        int a;
        int b;
        int suma=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nNúmero A: ");
        a = sc.nextInt();
        System.out.print("Número B: ");
        b = sc.nextInt();

        if (a>b) {
            for (int i=100; i<=1000 ; i++) {
                if ((i*(i+1)/5)%5==0) {
                    suma += i;
                }
            }
        } else if (a==b) {
            for (int j=1; j<=45 ; j++) {
                suma += (j/a);
            }
        } else if (a<b) {

            suma = (b-a) * ()
        }

    }
}
