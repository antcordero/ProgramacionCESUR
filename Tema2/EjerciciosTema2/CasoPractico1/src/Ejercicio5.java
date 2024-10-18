import java.util.Scanner;

public class Ejercicio5 {
    //Muestra y cuenta los números que hay entre 1 y 100 que son múltiplos de 2 o 3

    public static void main(String[] args) {

        int i; //Contador
        int multiplo;
        int contMultiplo = 0;

        Scanner sc =  new Scanner(System.in);

        System.out.print("\n Escoja el divisor para mostrar sus múltiplos: ");
        multiplo=sc.nextInt();

        if (multiplo==2) {

            for (i=1 ; i<=100 ; i++){
                if (multiplo%2==0){
                    System.out.printf("-> %d\n", multiplo);
                }
                multiplo++;
                contMultiplo++;
            }

            System.out.printf("\nEn total hay %d múltiplos de 2 entre 1 y 100\n", contMultiplo);

        } else if (multiplo==3){

            for (i=1 ; i<100 ; i++){
                if (multiplo%3==0){
                    System.out.printf("-> %d\n", multiplo);
                }
                multiplo++;
                contMultiplo++;
            }

            System.out.printf("\nEn total hay %d múltiplos de 3 entre 1 y 100\n", contMultiplo);

        } else {
            System.out.println("Error al introducir el dato.");
        }

        sc.close();
    }
}
