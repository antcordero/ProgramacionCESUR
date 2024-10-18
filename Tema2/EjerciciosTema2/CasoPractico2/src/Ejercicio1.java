import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int edad;
        double peso;

        Scanner sc =  new Scanner(System.in);

        System.out.print("\nEdad: ");
        edad = sc.nextInt();
        System.out.print("Peso: ");
        peso = sc.nextDouble();

        System.out.printf("Tu edad es %d años y pesas %f kg.", edad, peso);

        sc.close();
    }
}
