import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        String mes;
        double compra;

        Scanner sc = new Scanner(System.in);

        System.out.print("\n¿Qué mes es? ");
        mes = sc.nextLine().toLowerCase();

        System.out.print("\n¿Qué importe? ");
        compra = sc.nextDouble();

        //mes.equalsIgnoreCase("octubre")
        if (mes.equals("octubre")){
            //Descuento de octubre
            System.out.printf("\nImporte %.2f €", (compra*0.85));
        } else {
            //Sin descuento el resto de meses
            System.out.printf("\nImporte %.2f €", compra);
        }

        sc.close();
    }
}
