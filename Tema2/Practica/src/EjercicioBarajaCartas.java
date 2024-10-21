import java.util.Random;
import java.util.Scanner;

/*
     *  2. Realiza un programa que muestre al azar el nombre de una carta de
     *    la baraja francesa. Esta baraja está dividida en cuatro palos: picas,
     *    corazones, diamantes y tréboles. Cada palo está formado por 13 cartas,
     *    de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7,
     *    8, 9, 10, J, Q, K y A (que sería el 1).
     *
     *    Para convertir un número en
     *    una cadena de caracteres podemos usar String.valueOf(n).
     */
public class EjercicioBarajaCartas {
        public static void main(String[] args) {

            int numCarta;
            int paloCarta;
            String carta = "";
            String palo = "";

            String op = "";
            boolean flag = true;

            Random r = new Random();
            Scanner sc = new Scanner(System.in);

            System.out.print("\nEscoja una carta al azar: ");

            do {

                numCarta=r.nextInt(13) + 1;

                //Escoger número o letra
                if (numCarta==1 || (numCarta>=11 && numCarta<=13)) {
                    switch (numCarta) {
                        case 1 -> carta = "A";
                        case 11 -> carta = "J";
                        case 12 -> carta = "Q";
                        case 13 -> carta = "K";
                    }
                }

                //Escoger palo
                paloCarta=r.nextInt(4) + 1;

                switch (paloCarta) {
                    case 1 -> palo = "Trébol";
                    case 2 -> palo = "Picas";
                    case 3 -> palo = "Diamantes";
                    case 4 -> palo = "Corazones";
                }

                //Resultado
                if (numCarta==1 || (numCarta>=11 && numCarta<=13)) {
                    System.out.println("Su carta es: " + carta + " de " + palo);
                } else {
                    System.out.println("Su carta es: " + numCarta + " de " + palo);
                }

                //Flag
                System.out.print("\nQuiere otra carta? (si/no): ");
                op=sc.next().toLowerCase();

                if (op.equals("no")) {
                    flag = false;
                }

            } while (flag);


            sc.close();
        }
}
