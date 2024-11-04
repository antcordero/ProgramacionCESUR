import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int pagina;

        Scanner sc = new Scanner(System.in);

        Libro l1 = new Libro("El Imperio Final", "Brandon Sanderson", 675);

        //Mostar info inicial
        l1.mostrarInfo();

        //Indicar página actual
        System.out.print("\n¿A qué página quieres llegar?: ");
        pagina=sc.nextInt();
        for (int i = 0 ; i < pagina ; i++) {
            l1.leerPagina();
        }
        l1.mostrarInfo();

        //Reducir página hasta el principio
        l1.retrocederPagina();
        l1.mostrarInfo();

    }
}
