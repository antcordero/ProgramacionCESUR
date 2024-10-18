import java.util.Locale;
import java.util.Scanner;

public class MoureDevEj5AreaPoligono {
    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */

    public static void main(String[] args) {

        String figura;

        Scanner sc = new Scanner(System.in);

        //Pedir figura
        System.out.print("\nDi la figura (Triángulo, Cuadrado, Rectángulo): ");
        figura = sc.nextLine().toLowerCase();

        //Imprimir formula llamando a la función, llamando la función
        darArea(figura);


        sc.close();
    }

    /*
    *   Función para devolver por pantalla una fórmula de una figura geométrica
    *   String figura
    */
    public static void darArea(String figura) {

        String area = "";

        switch (figura) {
            case "triángulo", "triangulo":
                area = "(Base * Altura) / 2";
                System.out.println("La formula para un " + figura + " es: " + area);
                break;
            case "cuadrado":
                area = "Base * Base";
                System.out.println("La formula para un " + figura + " es: " + area);
                break;
            case "rectangulo", "rectángulo":
                area = "Base * Altura";
                System.out.println("La formula para un " + figura + " es: " + area);
                break;
            default:
                System.out.println("Error.");
        }
    }
}
