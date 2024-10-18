    /*
     *  Ejercicio 26
     *  Realiza un programa que pida primero un número y a continuación un dígito.
     *  El programa nos debe dar la posición (o posiciones) contando de izquierda a
     *  derecha que ocupa ese dígito en el número introducido.
     */

    import java.util.Scanner;

    public class LibroJavaBuclesEj26 {

    public static void main(String[] args) {

        int num;
        int digito;
        int nInverso;
        int i=1;
        int j=0;

        StringBuilder posicion = new StringBuilder(" ");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese un numero: ");
        num = sc.nextInt();
        System.out.print("Ahora un dígito dentro de ese número: ");
        digito = sc.nextInt();

        //Invertir número primero
        nInverso = invertirNumero(num);

        //Partir número
        while (nInverso>0) {
            //Comprobar resto = digito para contar posición/es
            if(nInverso%10==digito) {
                posicion.append(i).append(" ");
                j++;
            }
            nInverso/=10;
            i++;    //Contador de la posición
        }

        //Resultado
        if (j==0) {
            System.out.printf("El digito %d no se encontraba en ninguna posición\n", digito);
        } else if (j==1) {
            System.out.printf("El digito %d está en la posición %s\n", digito, posicion.toString());
        } else {
            System.out.printf("El digito %d está en las posiciones %s\n", digito, posicion.toString());
        }

        sc.close();
    }

    /*
    * Función para dar la vuelta a un número
    * int num
    * */
    public static int invertirNumero(int n) {

        int nInvertido = 0;

        //Reducir número
        while (n>0) {
            nInvertido = nInvertido*10 + (n%10);
            n /= 10;
        }

        return nInvertido;
    }
}
