import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int num1;
        int num2;
        double resultado;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDa el primer número: ");
        num1=sc.nextInt();
        System.out.print("Da el segundo número: ");
        num2=sc.nextInt();

        //Comprobación
        if ((num1==0) || (num2==0)) {
            System.out.println("No se puede dividir entre 0");
        } else if ((num1>num2)) {
            resultado = (double) num1 / num2;
            System.out.printf("Solución %d / %d = %.2f", num1, num2, resultado);
        } else {
            resultado = (double) num2 / num1;
            System.out.printf("Solución %d / %d = %.2f", num2, num1, resultado);
        }

        sc.close();
    }
}