import java.util.Scanner;

public class CP05Ejercicio5 {
    public static void main(String[] args) {

        int ninias;
        int ninios;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("¿Cuántas niñas hay? ");
            ninias = sc.nextInt();
        } while (ninias < 0);

        do {
            System.out.print("¿Cuántas niños hay? ");
            ninios = sc.nextInt();
        } while (ninios < 0);

        sc.close();

        System.out.printf("Hay un %.2f%% de niñas y un %.2f%% de niños", (((ninias * 1.0) / (ninios + ninias)) * 100), (((ninios * 1.0) / (ninios + ninias)) * 100));
    }
}
