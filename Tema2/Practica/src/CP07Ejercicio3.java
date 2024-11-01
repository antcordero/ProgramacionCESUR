import java.util.Scanner;

public class CP07Ejercicio3 {
    public static void main(String[] args) {

        int numAlumnos;
        int costeAlumno=0;
        int costeTotal=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nNúmero de alumnos para el viaje: ");
            numAlumnos=sc.nextInt();
        } while (numAlumnos<0);

        sc.close();

        if (numAlumnos>=100) {
            costeAlumno=65;

        } else if (numAlumnos>=50 && numAlumnos<=99) {
            costeAlumno=70;
        } else if (numAlumnos>=30 && numAlumnos<=49) {
            costeAlumno=95;
        }

        if (numAlumnos<=29) {
            costeTotal=3000;
            System.out.printf("Cada Alumno paga = %.2f€\n", (double) (costeTotal/numAlumnos));
            System.out.printf("Precio final para %d Alumnos = %d€\n", numAlumnos, costeTotal);
        } else {
            costeTotal=costeAlumno*numAlumnos;
            System.out.printf("Cada Alumno paga = %d€\n", costeAlumno);
            System.out.printf("Precio final para %d Alumnos = %d€\n", numAlumnos, costeTotal);
        }



    }
}
