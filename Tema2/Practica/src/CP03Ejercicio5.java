import java.util.Scanner;

public class CP03Ejercicio5 {
    public static void main(String[] args) {

        int nAlumnos;
        boolean flag = true;
        double nota;
        double suma=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nCuántos alumnos?: ");
            nAlumnos=sc.nextInt();
        } while (nAlumnos<=0);

        for (int i = 1; i <= nAlumnos; i++) {
            System.out.printf("Nota del alumno %d: ", i);
            nota=sc.nextDouble();
            suma += nota;
        }

        sc.close();

        //Cálculo
        System.out.printf("La media de las calificaciones es: %.2f", (suma/nAlumnos) );

    }
}
