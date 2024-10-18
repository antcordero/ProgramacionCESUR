import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int nota;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndique su nota: ");
        nota = sc.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.print("Valor introducido para la nota incorrecto." +
                    "\nVuelva a introducir de nuevo el valor: ");
            nota = sc.nextInt();
        }

        switch (nota) {
            case 0, 1, 2, 3:
                System.out.printf("Su nota %d, corresponde a Insufciente.", nota);
                break;
            case 4, 5:
                System.out.printf("Su nota %d, corresponde a Regular.", nota);
                break;
            case 6:
                System.out.printf("Su nota %d, corresponde a Bien.", nota);
                break;
            case 7, 8:
                System.out.printf("Su nota %d, corresponde a Notable.", nota);
                break;
            case 9, 10:
                System.out.printf("Su nota %d, corresponde a Sobresaliente.", nota);
                break;
        }

        sc.close();
    }
}
