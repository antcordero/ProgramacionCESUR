import java.util.Scanner;

public class CP11Ejercicio3 {
    public static void main(String[] args) {

        int segundos;
        int horas;
        int minutos;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEscribe el número de segundos: ");
        segundos = sc.nextInt();

        sc.close();

        //Operaciones
        horas = (int) (segundos/3600);
        minutos = (int) (segundos - horas*3600) /60;
        segundos = segundos - (horas*3600) - (minutos*60);

        //Resultados
        System.out.printf("Equivale a %d horas, %d minutos y %d segundos\n", horas, minutos, segundos);
    }
}
