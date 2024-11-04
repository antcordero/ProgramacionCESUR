import java.util.Scanner;

public class CP07Ejercicio5DecimalBinario {
    public static void main(String[] args) {

        int num;
        int numInicial;
        String binario = "";
        String octal = "";
        String hexadecimal = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntroduce un número: ");
        num = sc.nextInt();
        numInicial = num;

        sc.close();

        //Operaciones
        //1º Decimal a binario
        while (num>0) {
            binario = num%2 + binario;
            num/=2;
        }
        //2º Decimal a Octal
        num=numInicial;
        while (num>0) {
            octal = num%8 + octal;
            num/=8;
        }
        //3º Decimal a Hexadecimal
        num=numInicial;
        while (num>0) {
            switch (num%16) {
                case 1 -> hexadecimal = num%16 + "A";
                case 2 -> hexadecimal = num%16 + "B";
                case 3 -> hexadecimal = num%16 + "C";
                case 4 -> hexadecimal = num%16 + "D";
                case 5 -> hexadecimal = num%16 + "E";
                case 6 -> hexadecimal = num%16 + "F";
                default -> hexadecimal = num%16 + hexadecimal;
            }
            num/=16;
        }

        //Resultados
        if (numInicial==0) {
            System.out.printf("El número %d en binario es 0\n", numInicial);
            System.out.printf("El número %d en octal es 0\n", numInicial);
            System.out.printf("El número %d en hexadecimal es 0\n", numInicial);
        } else {
            System.out.printf("El número %d en binario es %s\n", numInicial, binario);
            System.out.printf("El número %d en octal es %s\n", numInicial, octal);
            System.out.printf("El número %d en hexadecimal es %s\n", numInicial, hexadecimal);
        }


    }
}
