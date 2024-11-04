import java.util.Random;
import java.util.Scanner;

public class CP10Ejercicio4PiedraPapelTijera {
    public static void main(String[] args) {

        int opJG;
        int opPC;

        int contJG=0;
        int contPC=0;

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("\nJuego Piedra | Papel | Tijera");
        System.out.println("=============================");

        do {
            //Mensaje + opción del jugador
            System.out.println("\nElige tu arma: ");
            System.out.println("0 -> Piedra");
            System.out.println("1 -> Papel");
            System.out.println("2 -> Tijeras");
            System.out.print("> ");
            opJG = sc.nextInt();

            //Opción del pc
            opPC=r.nextInt(3);
            //Mensaje de armas seleccionadas
            System.out.printf("Arma del jugador: %d - Arma del PC: %d \n", opJG, opPC);

            //Operaciones de comprobación
            //Jugador con piedra
            if (opJG==0) {
                if (opPC==0) {

                } else if (opPC==1) {
                    System.out.println("Gana el PC. Papel envuelve a Piedra");
                    contPC++;
                } else if (opPC==2) {
                    System.out.println("Gana el Jugador. Piedra rompe Tijeras.");
                    contJG++;
                }

            }
            //Jugador con Papel
            if (opJG==1) {
                if (opPC==0) {
                    System.out.println("Gana el Jugador. Papel envuelve a Piedra");
                    contJG++;
                } else if (opPC==1) {
                    System.out.println("Empate");
                } else if (opPC==2) {
                    System.out.println("Gana el PC. Tijeras corta a Papel.");
                    contPC++;
                }

            }//Jugador con Tijeras
            if (opJG==2) {
                if (opPC==0) {
                    System.out.println("Gana el PC. Piedra rompe Tijeras.");
                    contPC++;
                } else if (opPC==1) {
                    System.out.println("Gana el Jugador. Tijeras corta a Papel.");
                    contJG++;
                } else if (opPC==2) {
                    System.out.println("Empate");
                }
            }

            System.out.println("\nMarcador\n========");
            System.out.printf("Jugaddor: %d - PC: %d \n", contJG, contPC);

        } while (contJG<3 && contPC<3);

    }
}
