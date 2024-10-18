import java.util.Scanner;

public class Ejercicio5 {
    // Leer la secuencia de de positivos que termina con 0
    // Imprimir el mayor de todos
    // Si se introduce un negativo mostrar un mensaje

    public static void main(String[] args) {

        int num;
        int mayor;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número positivo: ");
        num = sc.nextInt();
        mayor = num;

        while (num!=0) {
            System.out.print("Introduzca un número positivo: ");
            num = sc.nextInt();

            //Mensaje de número negativo
            if (num<0) {
                System.out.println("Número negativo.");
            }

            //Comprobar el mayor
            if (mayor<num) {
                mayor = num;
            }
        }

        System.out.printf("El mayor es = %d", mayor);
        sc.close();
    }
}
