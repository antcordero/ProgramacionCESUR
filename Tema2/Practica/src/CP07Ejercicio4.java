import java.util.Scanner;

public class CP07Ejercicio4 {
    public static void main(String[] args) {

        int cantidad;
        int cont500=0;
        int cont200=0;
        int cont100=0;
        int cont50=0;
        int cont20=0;
        int cont10=0;
        int cont5=0;
        int cont2=0;
        int cont1=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIntroduce la cantidad: ");
            cantidad = sc.nextInt();
        } while (cantidad<0);

        sc.close();

        //Desglose de billetes
        while (cantidad>500) {
            cantidad -= 500;
            cont500++;
        }
        while (cantidad>200) {
            cantidad -= 200;
            cont200++;
        }
        while (cantidad>100) {
            cantidad -= 100;
            cont100++;
        }
        while (cantidad>50) {
            cantidad -= 50;
            cont50++;
        }
        while (cantidad>20) {
            cantidad -= 20;
            cont20++;
        }
        while (cantidad>10) {
            cantidad -= 10;
            cont10++;
        }
        while (cantidad>5) {
            cantidad -= 5;
            cont5++;
        }
        while (cantidad>2) {
            cantidad -= 1;
            cont2++;
        }
        while (cantidad>1) {
            cantidad -= 1;
            cont1++;
        }

        //Mensaje
        if (cont500>=1) {
            System.out.printf("Billetes de 500€: %d\n", cont500);
        }
        if (cont200>=1) {
            System.out.printf("Billetes de 200€: %d\n", cont200);
        }
        if (cont100>=1) {
            System.out.printf("Billetes de 100€: %d\n", cont100);
        }
        if (cont50>=1) {
            System.out.printf("Billetes de 50€: %d\n", cont50);
        }
        if (cont20>=1) {
            System.out.printf("Billetes de 20€: %d\n", cont20);
        }
        if (cont10 >=1) {
            System.out.printf("Billetes de 10€: %d\n", cont10);
        }
        if (cont5>=1) {
            System.out.printf("Billetes de 5€: %d\n", cont5);
        }
        if (cont2 >=1) {
            System.out.printf("Monedas de 2€: %d\n", cont2);
        }
        if (cont1 >=1) {
            System.out.printf("Monedas de 1€: %d\n", cont1);
        }
    }
}
