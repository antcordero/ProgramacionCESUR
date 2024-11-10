package Ejercicio;

import java.util.Scanner;

public class CP05 {
    public static void main(String[] args) {

        int opcion;
        int cantidad;

        Scanner sc = new Scanner(System.in);

        //Nueva instancia del producto
        Producto p1 = new Producto("Libro", 22.99, 15);
        //Producto p2 = new Producto("Comic", 10.90, 20);

        do {
            System.out.printf("\nElige una opción para el producto %s\n", p1.getNombre());
            System.out.print("1-Vender | 2-Reabastecer | 3-Stock Actual | 4-Salir\n-> ");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1:
                    //Venta
                    System.out.printf("Cantidad que se vende de %s: ", p1.getNombre() );
                    cantidad=sc.nextInt();
                    p1.venderProducto(cantidad);
                break;

                case 2:
                    //Reabastecer
                    System.out.printf("Cantidad que se reabastece de %s: ", p1.getNombre() );
                    cantidad=sc.nextInt();
                    p1.reabastecer(cantidad);
                break;

                case 3:
                    //Mostrar Stock actual
                    p1.mostrarStock();
                break;

                case 4:
                    System.out.println("Gracias por usar el programa.");
                break;

                default:
                    System.out.println("Opción incorrecta. Vuelve a elegir");
                break;
            }
        } while (opcion!=4);

        sc.close();
    }
}
