import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int i=0;
        String op;
        boolean flag = true;

        String articulo="";
        double precio;
        double coste=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nArtículo: ");
            articulo= sc.next();
            System.out.print("Precio del artículo: ");
            precio = Double.parseDouble(sc.next());

            //Lista
            articulo += articulo + " ";
            System.out.print("Más artículos? (si/no): ");
            op= sc.next().toLowerCase();

            //Flag
            if (op.equals("no")) {
                flag=false;
            }

            //Precio
            if (precio>=200) {
                coste = coste + (precio*0.85);
            } else if (precio>=100 && precio<200) {
                coste = coste + (precio*0.88);
            } else {
                coste = coste + (precio*0.90);
            }
        } while (flag);

        System.out.printf("\nTu lista de %s es: ", articulo);
        System.out.printf(" = %.2f€ ", coste);

        sc.close();

    }
}
