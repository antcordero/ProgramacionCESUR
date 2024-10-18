    /*
     *  Ejercicio 20
     *  Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
     */

    import java.util.Scanner;

    public class LibroJavaBuclesEj20 {

    public static void main(String[] args) {

        int altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPirámide hueca");
        do {
            System.out.print("Altura de la pirámide: ");
            altura = sc.nextInt();
        } while (altura<0);

        //Bucle pirámide
        for (int i=0; i<altura; i++) {
            //Pintar solo la última línea
            if (i==altura-1) {
                for (int k=1; k<=i+1; k++) {
                    System.out.print(" *");
                }
            } else {
                //Segundo for para pintar espacios
                for (int j = 0; j < altura-i ; j++) {
                    System.out.print(" ");
                }
                //Tercer for para pintar carácter de los bordes
                for (int l=0; l<i+1; l++) {
                    if ((l==0) || (l==i)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            //Salto de línea
            System.out.println("");
        }

        sc.close();
    }
}
