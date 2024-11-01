import java.util.Scanner;

public class CP11Ejercicio5 {
    public static void main(String[] args) {

        int num;
        int numInicial;
        int potencia=0;
        int digito;
        int suma=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEscribe un número: ");
        num = sc.nextInt();
        numInicial = num;

        sc.close();

        //Averiguar el número de dígitos para ver qué potencia usar
        while (num>0) {
            num/=10;
            potencia++;
        }

        //Separar número y hacer la potencia
        num=numInicial;
        while (num>0) {
            digito=num%10;
            suma += (int) Math.pow(digito, potencia);
            num/=10;
        }

        //Resultado
        if (suma==numInicial) {
            System.out.printf("%d es un número narcisista\n", numInicial);
        } else {
            System.out.printf("%d no es un número narcisista\n", numInicial);
        }

    }
}
