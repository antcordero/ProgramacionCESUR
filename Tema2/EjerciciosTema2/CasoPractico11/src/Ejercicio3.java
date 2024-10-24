import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int segundos;
        int hora;
        int minutos;
        int resto;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEscribe el número de segundos: ");
        segundos=sc.nextInt();

        sc.close();

        //Cáculo
        hora=segundos/3600;
        minutos = (segundos - (hora*3600))/60;
        resto = (segundos - (hora*3600)) - (minutos*60);

        System.out.printf("Equivale a %d horas, %d minutos y %d segundos\n", hora, minutos, resto);
    }
}
