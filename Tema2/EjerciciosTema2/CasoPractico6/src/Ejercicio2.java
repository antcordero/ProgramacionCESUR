import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int num;
        int pEntera;
        int resto=0; //Resto para números de dos dígitos menores a 39

        String numRomano = "";

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nIntroduzca un numero: ");
            num = sc.nextInt();
        } while (num<0);

        //  Si es 1000 clavado
        if (num==1000) {
            numRomano += "M";
        }
        //  Si está entre 900 y 999 -> CM
        if (num<=999 && num>=900) {
            numRomano += "CM";
            num = (num%100);
        }
        //  Si está entre 500 y 899
        if (num<=899 && num>=500) {
            num -= 500;
            pEntera = num/100;
            numRomano += "D";

            for (int i = 2; i < pEntera; i++) {
                numRomano += "C";
            }
        }
        //  Si está entre 400 y 499
        if (num<=499 && num>=400) {
            numRomano += "CD";
            num = (num%100);
        }
        //  Si está entre 100 y 399
        if (num<=399 && num>=100) {
            pEntera = num/100;
            num = (num%100);
            for (int i = 0; i < pEntera; i++) {
                numRomano += "C";
            }
        }
        //  Si está entre 99 y 90
        if (num<=99 && num>=90) {
            numRomano += "XC";
            num = (num%10);
        }
        //  Si está entre 50 y 89 ->L
        if (num<=89 && num>=50) {
            num -= 50;
            pEntera = num/10;
            numRomano += "L";

            for (int i = 0; i < pEntera; i++) {
                numRomano += "X";
            }
        }

        //  Si está entre 40 y 49
        if (num<=49 && num>=40) {
            numRomano += "XL";
            num = (num%10);
        }
        // Si está entre 39 y 10
        if (num<=39 && num>=10) {
            num -= 10;
            pEntera = num/10;
            numRomano += "X";
            resto = num%10;

            for (int i = 0; i < pEntera; i++) {
                numRomano += "X";
            }
        }
        // Si es 19 o 9
        if (num==19 || num==9) {
            if (num==19) {
                numRomano += "XIX";
            } else {
                numRomano += "IX";
            }
        }

        // Si está entre 1 y 8 -> Fullería
        if (num==8 || resto==8) {
            numRomano += "VIII";
        }
        if (num==7 || resto==7) {
            numRomano += "VII";
        }
        if (num==6 || resto==6) {
            numRomano += "VI";
        }
        if (num==5 || resto==5) {
            numRomano += "V";
        }
        if (num==4 || resto==4) {
            numRomano += "IV";
        }
        if (num==3 || resto==3) {
            numRomano += "III";
        }
        if (num==2 || resto==2) {
            numRomano += "II";
        }
        if (num==1 || resto==1) {
            numRomano += "I";
        }

        System.out.println(numRomano);

        sc.close();
    }
}
