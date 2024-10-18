import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int num;
        int pEntera=0;
        int cont=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndique la cantidad de €: ");
        num=sc.nextInt();

        //Error
        if (num<=0) {
            System.out.println("Cantidad a cero o errónea");
        }

        //500 ó +
        while (num>=500) {
            num-=500;
            cont++;
        }
        System.out.printf("Billetes de 500€: %d\n", cont);
        cont=0;

        //200 ó +
        while (num>=200) {
            num-=200;
            cont++;
        }
        System.out.printf("Billetes de 200€: %d\n", cont);
        cont=0;

        //100 ó +
        while (num>=100) {
            num-=100;
            cont++;
        }
        System.out.printf("Billetes de 100€: %d\n", cont);
        cont=0;

        //50 ó +
        while (num>=50) {
            num-=50;
            cont++;
        }
        System.out.printf("Billetes de 50€: %d\n", cont);
        cont=0;

        //20 ó +
        while (num>=20) {
            num-=20;
            cont++;
        }
        System.out.printf("Billetes de 20€: %d\n", cont);
        cont=0;

        //10 ó +
        while (num>=10) {
            num-=10;
            cont++;
        }
        System.out.printf("Billetes de 10€: %d\n", cont);
        cont=0;

        //5 ó +
        while (num>=5) {
            num-=5;
            cont++;
        }
        System.out.printf("Billetes de 5€: %d\n", cont);
        cont=0;

        //Monedas de 2
        while (num>=2) {
            num-=2;
            cont++;
        }
        System.out.printf("Monedas de 2€: %d\n", cont);
        cont=0;

        //Monedas de 1€
        while (num>=1) {
            num-=1;
            cont++;
        }
        System.out.printf("Monedas de 1€: %d\n", cont);
        cont=0;

        sc.close();
    }
}
