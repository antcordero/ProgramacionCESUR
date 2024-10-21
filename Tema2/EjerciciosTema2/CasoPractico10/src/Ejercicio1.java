import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nIndica los lados del triángulo: ");

        do {
            System.out.print("A: ");
            a=sc.nextDouble();
            System.out.print("B: ");
            b=sc.nextDouble();
            System.out.print("C: ");
            c=sc.nextDouble();
        } while (a<0 || b<0 || c<0);

        sc.close();

        //Rectángulo
        if (((a*a)+(b*b))==(c*c)) {
            System.out.println("El triángulo es rectángulo.");
        } else if ( ((a==b && b!=c) || (b==c && a!=c)) || (a==c && a!=b) ) {
            System.out.println("El triángulo es isósceles.");
        } else if (a==b && b==c) {
            System.out.println("El triángulo es equilátero.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
    }
}
