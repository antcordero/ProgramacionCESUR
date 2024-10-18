    /*
     * Ejercicio 21
     *  Realiza un programa que vaya pidiendo números hasta que se introduzca un
     *  número negativo
     *
     *  y nos dice cuantos números se han introducido,
     *  la media de los impares
     *  y el mayor de los pares.
     *
     *  El número negativo solo se utiliza para
     *  indicar el final de la introducción de datos, pero no se incluye en el cómputo.
     */

    import java.util.Scanner;

    public class LibroJavaBuclesEj21 {

    public static void main(String[] args) {

        int num;
        int cont=0;
        int contImpar=0;
        int sumaImpar=0;
        int mayor=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEl programa se detiene al dar un número negativo");
        do {
            System.out.print("De un número:  ");
            num = sc.nextInt();
            if (num>0) {
                cont++;
            }
            if (num%2!=0 && num>0) {
                contImpar++;
                sumaImpar+=num;
            }
            if ((num%2==0 && num!=0) && num>mayor) {
                mayor=num;
            }

        } while (num>0);

        //Impresión de resultados
        System.out.printf("\nSe han introducido %d números en total\n", cont);
        System.out.printf("La media de los impares es %d / %d = %.2f\n", sumaImpar, contImpar, (sumaImpar*1.0/contImpar));
        System.out.printf("El número par mayor es %d\n", mayor);

        sc.close();
    }
}
