package CP02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nTema 5 - Caso Práctico 2\n");

        int b;
        int n;
        String bola1;
        String bola2;

        Scanner sc = new Scanner(System.in);

        //Instancia
        Urna u = new Urna();

        System.out.println("Número de Bolas\n---------------");
        System.out.print("Nº Blancas: ");
        b= sc.nextInt();
        u.setBlancas(b);
        System.out.print("Nº Negras: ");
        n= sc.nextInt();
        u.setNegras(n);

        System.out.println("Estado inicial: " + u.toString());

        //Mientras quede más de una bola en la urna, sacar dos bolas.
        while (u.totalBolas()>1) {
            bola1 = String.valueOf(u.bola());
            System.out.print("Bola 1: " + bola1);
            bola1=bola1.toUpperCase();
            //restar
            if (bola1.equals("BLANCAS")){
                u.setBlancas(u.getBlancas()-1);
            } else {
                u.setNegras(u.getNegras()-1);
            }

            bola2 = String.valueOf(u.bola());
            System.out.print("Bola 2: " + bola2);
            bola2=bola2.toUpperCase();
            //restar
            if (bola2.equals("BLANCAS")){
                u.setBlancas(u.getBlancas()-1);
            } else {
                u.setNegras(u.getNegras()-1);
            }

            /*Si ambas son del mismo color introducir una bola blanca en la urna;
             si son de distinto color introducir una bola negra*/
            if (bola1.equals(bola2)) {
                u.ponerBlanca();
            } else u.ponerNegra();

            System.out.println("Número total: " + u.toString());
        }

        //Cuando quede solo una bola, sacarla y mostrar su color.
        System.out.println("La última bola es de color: " + u.bola());

        sc.close();
    }
}
