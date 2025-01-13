package CP03;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 3 - Tema 5\n");

        int numAlumnos = 0;
        double nota;
        double total = 0;
        double media;
        int contAlumnos = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número total de alumnos: ");
        numAlumnos = sc.nextInt();

        double[] notas = new double[numAlumnos];

        //Dar valores de la nota
        for (int i = 0; i < notas.length; i++) {

            do {
                System.out.printf("Nota del %dº Alumno: ", contAlumnos);
                nota = sc.nextDouble();
                if (nota<0 || nota>11) {
                    System.out.println("Nota inválidad, vuelva a introducir la nota correcta");
                }
            } while (nota<=0 || nota>=10);

            notas[i] = nota;
            contAlumnos++;
        }
        
        sc.close();

        //Calcular media
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        media = total / numAlumnos;
        System.out.printf("Media de notas: %.2f \n", media);

        //Mostrar alumnos con notas superiores
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.printf("El alumno %d con nota superior a la media con %.2f\n", i+1, notas[i]);
            }
        }

    }
}
