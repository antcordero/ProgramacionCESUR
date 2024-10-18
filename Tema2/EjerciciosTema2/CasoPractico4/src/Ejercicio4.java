import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        //Función para elevar potencias Math.pow(a,b) a elevado a b

        //Contadores
        int i;
        int j;
        int k;

        int elevado = 3;

        //Variables
        int a;
        int b;

        //Resultados
        int sumaA=0;
        double sumaB = 0;
        double opC = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDe el valor de a: ");
        a = sc.nextInt();
        System.out.print("De el valor de b: ");
        b = sc.nextInt();

        //Primera opción (a>b)
        if (a>b) {
            for (i=100 ; i<=1000 ; i++) {
                if ((i*(i+1)/5)%5==0) {
                    sumaA = sumaA + i;
                }
            }
            System.out.printf("Suma para a>b = %d", sumaA);

        //Segunda opción (a=b)
        } else if (a==b) {
            // 1/A + 5/A + 9/A + ... + 45/A
            for (j=1 ; j<=45 ; j = j+4) {
                sumaB = sumaB + (double) j/a;
            }
            System.out.printf("Suma para a=b = %.2f", sumaB);

        //Tercera opción (a<b)
        } else {
            //(b-a) * (2^3 + 4^6 + 6^9 + ... + 20^30
            for (k=2 ; k<=20 ; k=k+2) {
                opC = opC + Math.pow(k,elevado);
                elevado=elevado+3;
            }
            System.out.printf("Resultado de a<b = %.2f", ( (b-a)*(opC) ) );
        }

        sc.close();
    }
}
