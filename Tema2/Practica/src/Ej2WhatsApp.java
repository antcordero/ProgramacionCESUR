import java.util.Scanner;

public class Ej2WhatsApp {
    // Ejercicio 2: Número Par o Impar

    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPar o impar");
        System.out.print(     "----------\n");

        //Petición de números
        System.out.print("De el número: ");
        num = sc.nextInt();

        //Cálculo para ver si es par o impar
        if (num%2 == 1 ) {
            System.out.printf("El número %d es impar\n", num);
        } else {
            System.out.printf("El número %d es par\n", num);
        }

        sc.close();
    }
}
