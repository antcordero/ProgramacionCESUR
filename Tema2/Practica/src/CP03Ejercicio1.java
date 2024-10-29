import java.util.Scanner;

public class CP03Ejercicio1 {
    public static void main(String[] args) {

        int anio;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIndica el año del nacimiento: ");
            anio = sc.nextInt();
        } while (anio>2024 && anio<=0) ;

        sc.close();

        //Calcular edad
        System.out.printf("Año: %d edad %d\n", anio, (2024-anio));
    }
}
