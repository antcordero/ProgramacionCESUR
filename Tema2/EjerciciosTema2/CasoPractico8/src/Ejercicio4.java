import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        int cantidad;

        Scanner sc =  new Scanner(System.in);

        System.out.print("\n¿Cuánto dinero tienes? ");
        cantidad= sc.nextInt();

        if (cantidad<=10) {
            System.out.println("Puedes regalarle una Tarjeta regalo");
        } else if (cantidad>10 && cantidad<=20) {
            System.out.println("Puedes regalarle Bombones ó Bombones más una tarjeta regalo.");
        }  else if (cantidad>20 && cantidad<=50) {
            System.out.println("Puedes regalarle Flores, Flores más Bombones más una tarjeta regalo.");
        } else if (cantidad>50) {
            System.out.println("Puedes comprar un anillo o más cosas");
        }

        sc.close();
    }
}
