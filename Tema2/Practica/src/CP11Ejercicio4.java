import java.util.Random;
import java.util.Scanner;

public class CP11Ejercicio4 {
    public static void main(String[] args) {

        int intentos;
        int opcion;

        int dado1;
        int dado2;
        int suma;
        int i=1;

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        //Tirada de los dados + suma
        dado1 = r.nextInt(6)+1;
        dado2 = r.nextInt(6)+1;
        suma = dado1 + dado2;

        //Pedir intentos
        System.out.print("\n¿Cuántos intentos necesitas para adivinar la suma de los dos dados? ");
        intentos = sc.nextInt();

        do {
            System.out.printf("Intento nº %d: ", i);
            opcion = sc.nextInt();
            if (opcion>suma) {
                System.out.println("Tu suma es mayor");
            } else if (opcion<suma) {
                System.out.println("Tu mayor es menor");
            } else if (opcion==suma) {
                System.out.println("Acertaste la suma");
                i=intentos+1;
            }
            i++;
        } while (i<=intentos);

        //Mensaje final
        System.out.printf("Los números eran el %d y %d - Suma = %d\n", dado1, dado2, suma);

        sc.close();
    }
}
