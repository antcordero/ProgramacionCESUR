import java.util.Scanner;

public class Ej2ConversorDecimalBinario {
    /*
     * Dar la vuelta a un número entero positivo
     * */

    public static void main(String[] args) {

        int num;
        int numInicial = 0;
        int nInverso   = 0;

        int guardarCeros=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nEscriba un número entero positivo: ");
            num = sc.nextInt();
        } while (num<0);

        //Igualar num a numInicial solo para la impresión final del resultado
        numInicial = num;

        // Control de excepción si es un número de un solo dígito o cero
        if (num>0 && num<=9) {
            System.out.printf("El número %d es igual, no tiene inverso CRACK.", num);
        } else {

            //Primero guardar ceros para que de "inverso de 100 = 001" y no solamente 1
            //Hay que contar ceros finales
            while (num%10==0 && num!=0) {
                guardarCeros++;
                num /= 10;
            }

            //Bucle while para reducir el número hasta cociente 0 de la division de num
            while (num>0) {
                /* ***** Aclaración
                 * Multiplicar el inverso, al inicio es cero, pero al sumarle el resto será positivo
                 * en la siguiente vuelta el número será de una décima más terminada en 0 y se le
                 * suma el dígito individual del resto
                 */
                nInverso = nInverso*10 + (num%10);

                //Quitar el último dígito al número inicial para bajarlo una décima
                num /= 10;
            }

            //Imprimir el número inverso
            System.out.printf("El número invertido a %d es ", numInicial);

            //Ponerle los ceros al número inverso ANTES del número distinto de cero
            for (int i = 0; i < guardarCeros ; i++) {
                System.out.print("0");
            }

            System.out.printf("%d\n",nInverso);
        }

        sc.close();
    }
}

