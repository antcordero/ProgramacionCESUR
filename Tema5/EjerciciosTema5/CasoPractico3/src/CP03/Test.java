package CP03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nTema 5 - Caso Práctico 3");

        double nota;
        int total = 0;
        double[] alumnos = new double[total];

        Scanner sc = new Scanner(System.in);

        System.out.print("Indica el número total de alumnos: ");
        total=sc.nextInt();

        System.out.println("Introducir notas: ");
        for (int i = 1; i <= total ; i++) {
            System.out.printf("Nota del alumno %d: ", i);
            nota=sc.nextDouble();
            alumnos[i] = nota;
        }


        sc.close();

    }
}
