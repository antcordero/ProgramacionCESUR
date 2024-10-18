import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int numAlumnos;
        int precioAlumno;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nNúmero de alumnos: ");
        numAlumnos=sc.nextInt();

        if (numAlumnos<30) {
            System.out.print("Precio Total = 3000€\n");
            System.out.printf("Precio Total = %.2f €\n",  (double) (3000/numAlumnos));
        } else if (numAlumnos>=100) {
            precioAlumno = 65;
            System.out.printf("Precio por alumno = %d €\n", precioAlumno);
            System.out.printf("Precio Total = %d €\n", (numAlumnos*precioAlumno));
        } else if (numAlumnos>= 50 && numAlumnos<=99){
            precioAlumno = 70;
            System.out.printf("Precio por alumno = %d €\n", precioAlumno);
            System.out.printf("Precio Total = %d €\n", (numAlumnos*precioAlumno));
        } else if (numAlumnos>= 30 && numAlumnos<=49) {
            precioAlumno = 95;
            System.out.printf("Precio por alumno = %d €\n", precioAlumno);
            System.out.printf("Precio Total = %d €\n", (numAlumnos*precioAlumno));
        }

        sc.close();
    }
}
