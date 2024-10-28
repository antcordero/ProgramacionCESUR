import java.util.Scanner;

public class CP02Ejercicio3 {
    public static void main(String[] args) {

        double radio;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nCálculo del área de un círculo");

        do {
            System.out.print("Radio: ");
            radio=sc.nextDouble();
        } while (radio<=0);

        sc.close();
        //Cálculo
        //Área = (PI * radio * radio)

        System.out.printf("Área del triángulo = %.2f\n", (Math.PI * radio * radio) );

    }
}
