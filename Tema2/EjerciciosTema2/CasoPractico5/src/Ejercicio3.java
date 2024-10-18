import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int num;
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDe un número: ");
        num=sc.nextInt();

        //Cuadrado (^2) y cubo (^3) de los 4 números siguientes al número dado
        for (i=num; i<(num+5); i++) {
            //cuadrado = i * i
            //System.out.printf("Cuadrado de %d = %d", i, Math.pow(i,2));
            System.out.printf("Cuadrado de %d = %d", i, (i * i));
            //cubo = i * i * i
            //System.out.printf("Cuadrado de %d = %d", i, Math.pow(i,3));
            System.out.printf(" : Cubo de %d = %d\n", i, (i * i * i));
        }
        sc.close();
    }
}
