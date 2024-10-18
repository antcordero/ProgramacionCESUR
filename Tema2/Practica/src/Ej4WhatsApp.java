import java.util.Scanner;

public class Ej4WhatsApp {

    public static void main(String[] args) {
        //Ejercicio 4: Conversor de Temperatura

        double tempCelsius;
        double tempFahrenheit;

        char temp;

        Scanner sc = new Scanner(System.in);

        //Preguntar primero a que temperatura quiere convertir para preguntarle los datos luego
        System.out.print("\nA qué temperatura quiere convertir (C / F)? ");
        temp = sc.next().charAt(0);

        //Conversión
        // Grados centígrados = (grados Fahrenheit − 32) × 5/9
        // Grados Fahrenheit = (grados centígrados × 9/5) +32

        switch (temp) {
            case 'C':
                System.out.print("De la temperatura en ºCelsius: ");
                tempCelsius = sc.nextDouble();
                System.out.printf("La temperatura en Farenheit es: %.2f F\n", ( (tempCelsius * (9/5)) + 32) );
                break;
            case 'F':
                System.out.print("De la temperatura en ºFarenheit: ");
                tempFahrenheit = sc.nextDouble();
                System.out.printf("La temperatura en ºCelsius es: %.2f ºC\n", ( (tempFahrenheit -32) * (5/9)) );
                break;

            default:
                System.out.println("Error en la introduccíon de datos.");
        }

        sc.close();
    }
}

