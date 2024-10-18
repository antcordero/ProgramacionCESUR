import java.util.Scanner;

public class EjercicioDani {

    /*  Escribir un programa tal que dados 2 valores de entrada imprima
        siempre la división del mayor de esos dos números entre el menor de
        esos dos.
    */

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        if ((num1==0) || (num2==0)) {
            System.out.println("No se puede dividir un número entre 0.");
        } else {
            if (num1>num2) {
                System.out.printf("Resultado entre %d y %d = %.2f", num1, num2, ((double) num1 / num2));
            } else if (num2>num1) {
                System.out.printf("Resultado entre %d y %d = %.2f", num2, num1, ((double) num2 / num1));
            }
        }

        sc.close();
    }
}
