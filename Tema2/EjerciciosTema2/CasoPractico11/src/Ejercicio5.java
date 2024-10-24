import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int num;
        int digito;
        int cont=0;
        double suma=0;
        int numInicial;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEscribe un número: ");
        num=sc.nextInt();
        numInicial=num;

        //Partir el número para contar la potencia
        do {
            digito=num%10;
            num/=10;
            cont++;
        } while (num>0);

        //Multiplicar cada dígito por la potencia
        num=numInicial;
        do {
            digito=num%10;
            num/=10;
            suma+=Math.pow(digito,cont);
        } while (num>0);

        //Comprobación
        if (suma==numInicial) {
            System.out.printf("%d es un número narcisista\n", numInicial);
        } else {
            System.out.printf("%d NO es un número narcisista\n", numInicial);
        }

        sc.close();
    }
}
