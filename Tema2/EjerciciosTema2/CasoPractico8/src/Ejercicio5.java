import java.util.Objects;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        char modelo;
        int talla;
        double precioMetroTela;
        int unidades;
        double metrosTela=0;
        double precioFinal=0;
        double ganancia=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nFábrica de pantalones:");

        System.out.print("\nIndica el modelo: ");
        modelo=sc.next().toLowerCase().charAt(0);
        System.out.print("Indica la talla (30/32/36): ");
        talla=Integer.parseInt(sc.next());
        System.out.print("Indica el precio del metro de tela €: ");
        precioMetroTela=sc.nextDouble();
        System.out.print("Indica las unidades: ");
        unidades=sc.nextInt();

        sc.close();

        //Calcular metros de tela y lo que cuesta
        if (modelo=='a') {
            //metros de tela
            metrosTela=unidades*1.50;
            //precioTotal
            precioFinal=(metrosTela*precioMetroTela)*1.80;
        } else if (modelo=='b') {
            //metros de tela
            metrosTela=unidades*1.80;
            //precioTotal
            precioFinal=(metrosTela*precioMetroTela)*1.95;
        }

        //Calcular el añadido si es talla 32 o 36
        if (talla==32 || talla==36) {
            precioFinal=precioFinal*1.04;
        }

        //Calcular ganancia
        ganancia=(precioFinal*1.30)-precioFinal;

        //Resultado
        System.out.printf("\nCosto de hacer los pantalones = %.2f €\nPrecio de venta %.2f €\nGanancias = %.2f €\n", precioFinal, (precioFinal*1.30), ganancia);

    }
}
