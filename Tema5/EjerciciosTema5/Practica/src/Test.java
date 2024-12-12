import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nTema 5 - Caso Práctico 3\n");

        double nota;
        int total;
        int cont = 1;
        double suma = 0;
        double media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Indica el número total de alumnos: ");
        total=sc.nextInt();
        double[] alumnos = new double[total];

        //3 recorridos al array
        //Primero asignar las notas a los alumnos
        System.out.println("\nIntroducir notas: ");
        for (int i = 0; i < total ; i++) {
            do {
                System.out.printf("Nota del alumno %d: ", cont);
                nota=sc.nextDouble();
            } while (nota<=0 || nota>10);
            alumnos[i] = nota;
            cont++;
        }

        //Segundo - sumar todas las notas y tener la media
        for (int i = 0; i < alumnos.length ; i++) {
            suma = suma + alumnos[i];
        }

        media = suma/total;

        System.out.printf("\nLa suma total de las notas es = %.2f\n", suma);
        System.out.printf("La media de las todas las notas es = %.2f\n", media);

        //Tercero - mostrar los alumnos con notas superiores a la media
        System.out.println("\nAlumnos con una nota superior a la media: ");
        for (int i = 0; i < alumnos.length ; i++) {
            if(alumnos[i]>media) {
                System.out.printf("Nota del alumno: %.2f\n", alumnos[i]);
            }
        }

        sc.close();
    }
}
