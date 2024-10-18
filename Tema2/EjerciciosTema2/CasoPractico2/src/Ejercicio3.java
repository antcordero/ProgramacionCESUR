import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        double radio;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nRadio: ");
        radio = sc.nextDouble();

        //Cálculo
        System.out.printf("\nEl área del círculo es: %.2f cm^2\n", (radio*radio*Math.PI));

        sc.close();
    }
}
