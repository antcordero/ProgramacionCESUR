import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        final int MAX = 10;

        Mundo[] miArray = new Mundo[MAX];

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = new Mundo();
        }

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < miArray.length; i++) {
            System.out.print("Nombre del planeta: ");
            String nombre = sc.nextLine();
            miArray[i].setNombre(nombre);

            try {
                System.out.print("Diámetro del planeta: ");
                double diametro = Double.parseDouble(sc.nextLine());
                miArray[i].setDiametro(diametro);
            } catch (NumberFormatException nfe) {
                System.out.println("Error, el valor debe ser numérico. Volver a introducir el valor");
                i--;
            } catch (ValorNegativoException vne) {

            }

        }

    }
}
