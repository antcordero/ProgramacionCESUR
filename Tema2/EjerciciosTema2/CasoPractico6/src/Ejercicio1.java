import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int numX;
        int numY;
        int mayor=0;
        int menor=0;
        int sumaPares=0;
        int pares=0;

        int i;

        Scanner sc = new Scanner(System.in);

        //  Comprobación para que el número de veces no sea negativo.
        do {
            System.out.print("\nIntroduce el número de veces: ");
            numX=sc.nextInt();
        } while (numX<=0);

        for (i=1 ; i<=numX ; i++) {
            System.out.printf("Introduce el número %d: ", i);
            numY=sc.nextInt();

            //  Guardar mayor y menor
            if (numY>mayor) {
                mayor=numY;
            }
            if (menor<numY) {
                menor=numY;
            }

            //  Contar Pares y no contar 0 como par
            if ((numY%2==0) && (numY!=0)) {
                sumaPares += numY;
                pares++;
            }
        }

        System.out.printf("El mayor de todos es el %d", mayor);
        System.out.printf("\nEl menor de todos es el %d", menor);

        //Comprobación de pares
        if (pares>0){
            System.out.printf("\nLa media de los números pares introducidos es %.2f", ((double) (sumaPares/pares)) );
        } else {
            System.out.println("No hay pares.");
        }
        sc.close();
    }
}
