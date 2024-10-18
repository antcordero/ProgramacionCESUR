import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        int i; //Contador

        int numAlumnos=0;
        double nota;
        double suma = 0;

        int r;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndique el número de alumnos: ");
        numAlumnos = sc.nextInt();

        for (i=1 ; i<=numAlumnos ; i++) {
            System.out.printf("Diga la nota del alumno nº%d: ", i);
            nota = sc.nextDouble();

            suma = suma + nota;
        }

        System.out.printf("\nNota promedio final = %.2f\n", ((double) suma/numAlumnos));

        /*
        ########
        Con 'do while' me deja meter una nota antes
        y se le pregunta cada vez que meta una nueva nota si quiere
        intorducir una nueva nota, a cada nueva nota se aumenta el numAlumnos,
        es decir, un alumno nuevo al total. Suma va sumando la nota anterior más la nota nueva.
        ########
        */
        /*
        do {

            System.out.print("\nMarque una nota para el Alumno: ");
            nota = sc.nextDouble();
            numAlumnos++;
            suma += nota;

            System.out.print("\n¿Quiere añadir una nota más? (Sí=1 / No=0): ");
            r = sc.nextInt();

        } while (r!=0);
        */

        //System.out.printf("\nNota promedio final = %.2f\n", ((double) suma/numAlumnos));

        sc.close();
    }
}
