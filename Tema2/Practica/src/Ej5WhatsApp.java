import java.util.Scanner;

public class Ej5WhatsApp {

    public static void main(String[] args) {
        //Ejercicio 5: Tabla de Multiplicar

        int num;
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntroduzca un numero: ");
        num = sc.nextInt();

        System.out.printf("Tabla de multiplicar del %d\n", num);
        System.out.println("--------------------------");

        for (i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }


        sc.close();
    }
}
