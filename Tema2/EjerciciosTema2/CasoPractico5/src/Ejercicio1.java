import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int num;
        int sumaPar = 0;
        int sumaImpar = 0;
        //double promedio;

        int par = 0;
        int impar = 0;

        int i;

        Scanner sc = new Scanner(System.in);

        for (i=1 ; i<=10 ; i++) {
            System.out.print("De un número: ");
            num=sc.nextInt();

            // Si es par
            if (num%2==0){
                par++;
                sumaPar += num;
            } else {    //Si es impar
                impar++;
                sumaImpar += num;
            }
        }

        //promedio = (double) sumaImpar / impar;
        //Condición para ver si se ponen infinitos, ya que dividir por 0 es infinito
        if (impar>0) {
            System.out.println("No se ha escrito ningún número impar.");
        }
        //Mensaje final
        System.out.printf("\nSon pares %d números\n" + par +
                            "Suma de los pares = %d\n" + sumaPar +
                            "Promedio de los impares = %.2f" + (double) sumaImpar / impar);

        sc.close();
    }
}
