import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int rango;
        int intento;
        int aleatorio;
        int num;
        boolean flag = true;
        int i=1;

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEscribe el máximo número posible (de 1 a ...): ");
        rango=sc.nextInt();

        aleatorio=r.nextInt(rango) + 1;

        System.out.print("En cuántos intentos?: ");
        intento=sc.nextInt();

        //Adivinar número
        do {
            System.out.printf("Intento nº%d: Adivina el número\n>", i);
            num=sc.nextInt();
            //Menor o mayor
            if (num>aleatorio) {
                System.out.println("El número es más pequeño...");
            } else if (num<aleatorio){
                System.out.println("El número es más grande...");
            }
            //Comprobación
            if (num==aleatorio) {
                flag = false;
                System.out.println("Eres un crack!!! Lo has adivinado!!!");
            }
            intento--;
            i++;
        } while (flag && intento>0);

        if (!flag || intento==0) {
            System.out.printf("Ohhhh, no lo has adivinado!!\nHas superado el número máximo de intentos. El número era el %d.\n", aleatorio);
        }

        sc.close();

    }
}
