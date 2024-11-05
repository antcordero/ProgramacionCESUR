import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int cantidad;

        Scanner sc = new Scanner(System.in);

        //Nueva instancia del producto
        Producto p1 = new Producto("libro", 22.99, 15);

        System.out.print("\nCantidad que se vende: ");
        cantidad= sc.nextInt();

        System.out.printf("Se han vendido %d unidades\n", cantidad);

        sc.close();

    }
}
