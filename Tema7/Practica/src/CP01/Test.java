package CP01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 1 - Tema 7\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int num1 = sc.nextInt();
        System.out.print("Numero 2: ");
        int num2 = sc.nextInt();

        DivisionPorCero div1 = new DivisionPorCero();

        div1.division(num1, num2);

        System.out.println("\tVolviendo de main");
    }
}
