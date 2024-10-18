import java.util.Scanner;

public class EjercicioNumeroPrimoDani {

    /*
    * Comprobar que un número sea positivo y primo
    *
    * Probar con la lógica de Dani Rodríguez del diagrama de flujo de datos
    */

    public static void main(String[] args) {

        int num;
        int cont;
        int contDivisores = 0;

        Scanner sc = new Scanner(System.in);

        //Pedir número + comprobación
        do {
            System.out.print("\nIngrese el numero: ");
            num = sc.nextInt();
        } while (num < 0);

        //Inicializar el contador al número
        cont = num;

        //Hacer operación y contar los divisores cada vez que sea el resto cero
        do {
            if (num%cont == 0) {
                contDivisores++;
            }
            cont--;
        } while (cont>=1);

        //Comprobar cuántos divisores hay
        if (contDivisores>2) {
            System.out.printf("El numero %d no es primo\n", num);
        } else {
            System.out.printf("El numero %d es primo\n", num);
        }

        sc.close();
    }
}
