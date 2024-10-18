import java.util.Scanner;

public class Ej3WhatsApp {
    //Ejercicio 3: Calculadora de Promedio

    public static void main(String[] args) {

        final int TOTAL = 5;

        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double nota5;

        double promedio;

        Scanner sc = new Scanner(System.in);

        //Pedir notas
        System.out.println("\nIntroduzca las notas de las 5 asignaturas: ");
        System.out.print("Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        nota2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        nota3 = sc.nextDouble();
        System.out.print("Nota 4: ");
        nota4 = sc.nextDouble();
        System.out.print("Nota 5: ");
        nota5 = sc.nextDouble();

        //Cálculo del promedio
        promedio = (nota1 + nota2 + nota3 + nota4) / TOTAL;

        //Chequeo
        if (promedio >= 5) {
            System.out.println("Aprobó");
        } else {
            System.out.println("No aprobó");
        }

        sc.close();
    }
}
