import java.util.Scanner;

public class Ej1WhatsApp {
    // Ejercicio 1: Calculadora Básica

    public static void main(String[] args) {

        String op;

        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nCalculadora básica");
        System.out.print(     "-----------------\n");

        // Petición de números (dos solamente)
        System.out.print("De el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("De el segundo número: ");
        num2 = sc.nextDouble();

        // Petición de operación
        System.out.print("Seleccione la operación (suma, resta, multiplica, divide): ");
        op = sc.next();

        //Convertir texto
        op = op.toLowerCase();

        //Cálculo

        switch (op) {
            case "suma":
                System.out.printf("El resultado es: %f", (num1 + num2));
                break;
            case "resta":
                System.out.printf("El resultado es: %f", (num1 - num2));
                break;
            case "multiplica":
                System.out.printf("El resultado es: %f", (num1 * num2));
                break;
            case "divide":
                //Comprobación si el divisor es 0
                if (num2 == 0) {
                    System.out.println("Error, no se puede dividir por 0.");
                } else {
                    System.out.printf("El resultado es: %f", (num1 / num2));
                }
                break;
        }

        sc.close();
    }
}
