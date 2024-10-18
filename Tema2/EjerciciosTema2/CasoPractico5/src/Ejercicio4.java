import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int a;
        int b;

        //Variable de control
        int c=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDe el número a: ");
        a=sc.nextInt();
        System.out.print("De el valor de b: ");
        b=sc.nextInt();

        //Guardar a en c
        c=a;
        //Dar valor de a en b
        a=b;
        //Dar valor de b en a
        b=c;

        System.out.printf("Valor de a = %d, valor de b = %b", a, c);

        sc.close();
    }
}
