import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de alumnos? ");
        int numAlumnos = sc.nextInt();
        double notas[] = new double[numAlumnos];
        double notaMedia=0;
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Nota del alumno "+(i+1)+": ");
            notas[i] = sc.nextDouble();
            notaMedia += notas[i];
        }
        sc.close();
        notaMedia/=numAlumnos;
        System.out.printf("Nota media de los alumnos: %.2f\n",notaMedia);
        System.out.println("ALUMNOS CON NOTA SUPERIOR A LA MEDIA");
        System.out.println("====================================");
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i]>notaMedia) {
                System.out.printf("Alumno %d: %.2f\n",i+1,notas[i]);
            }
        }
    }
}
