public class Ejercicio3 {

    public static void main(String[] args) {

        //Condición n*(n+1)/2 = múltiplo de 7
        //Múltiplo de 7 => n%7==0

        int i;

        int num;
        int cont = 0;
        int suma = 0;

        /*
        Sumar los numeros n del contador, por ejemplo, entre [20,25],
        cumplen la condición los números 20 y 21, solo se suman estos números,
        no los resultados obtenidos de la operación.
         */
        for (i=20 ; i<=3500; i++) {
            num = (i*(i+1)/2);
            if (num%7==0) {
                suma = suma + i;
                cont++;
                //System.out.printf("%d\n", i);
            }
        }

        System.out.printf("\n%d números cumplen la condición", cont);
        System.out.printf("\nSuma total = %d\n", suma);
    }
}
