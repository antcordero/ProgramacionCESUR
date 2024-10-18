import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        int num;
        int numInicial = 0;
        int nInverso   = 0;

        int guardarCeros=0;

        int opcion;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nEscriba un número entero positivo: ");
            num = sc.nextInt();
        } while (num<0);

        //Igualar num a numInicial solo para la impresión final del resultado
        numInicial = num;

        //Marcar opción de la conversión
        System.out.print("¿A qué quiere convertir? (1: binario / 2: octal / 3: hexadecimal) ");
        opcion = sc.nextInt();

        switch (opcion) {
            //binario
            case 1:
                //Primero guardar ceros para que de "inverso de 100 = 001" y no solamente 1
                //Hay que contar ceros finales
                while (num%2==0 && num!=0) {
                    guardarCeros++;
                    num /= 2;
                }

                while (num>0) {
                    nInverso = nInverso*10 + (num%2);
                    num /= 2;
                }

                //Imprimir el número inverso
                System.out.printf("El número invertido a %d es ", numInicial);

                System.out.printf("%d",nInverso);

                //Ponerle los ceros al número inverso ANTES del número distinto de cero
                for (int i = 0; i < guardarCeros ; i++) {
                    System.out.print("0");
                }

                System.out.println("");
            break;

            //octal
            case 2:

                while (num%8==0 && num!=0) {
                    guardarCeros++;
                    num /= 8;
                }

                while (num>0) {
                    nInverso = nInverso*10 + (num%8);
                    num /= 8;
                }

                //Imprimir el número inverso
                System.out.printf("El número invertido a %d es ", numInicial);

                System.out.printf("%d",nInverso);

                //Ponerle los ceros al número inverso ANTES del número distinto de cero
                for (int i = 0; i < guardarCeros ; i++) {
                    System.out.print("0");
                }

                System.out.println("");
            break;

            //hexadecimal
            case 3:

                while (num%16==0 && num!=0) {
                    guardarCeros++;
                    num /= 16;
                }

                while (num>0) {
                    nInverso = nInverso*10 + (num%16);
                    num /= 8;
                }

                //Imprimir el número inverso
                System.out.printf("El número invertido a %d es ", numInicial);

                System.out.printf("%d",nInverso);

                //Ponerle los ceros al número inverso ANTES del número distinto de cero
                for (int i = 0; i < guardarCeros ; i++) {
                    System.out.print("0");
                }

                System.out.println("");
                break;
        }

        sc.close();
    }
}
