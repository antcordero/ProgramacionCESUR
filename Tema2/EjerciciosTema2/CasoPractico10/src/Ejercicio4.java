import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int opJG;
        int opPC;

        int contJG=0;
        int contPC=0;

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nJuego -> Piedra / Papel / Tijera");

        do {
            //Opcion del jugador
            System.out.println("\nElige tu arma: ");
            System.out.print("0-Piedra\n1-Papel\n2-Tijera\n");
            System.out.print("> ");
            opJG=sc.nextInt();
            //Opcion del PC
            opPC=r.nextInt(2) + 1;
            System.out.printf("Arma jugador: %d - Arma ordenador: %d\n", opJG, opPC);

            //JG Piedra - PC - Tijeras
            if (opJG==0 && opPC==2) {
                System.out.println("Gana el jugador. Piedra rompe tijeras.");
                contJG++;
            }
            //JG Piedra - PC - Papel
            else if (opJG==0 && opPC==1) {
                System.out.println("Gana el ordenador. Papel envuelve a piedra.");
                contPC++;
            }
            //JG Piedra - PC - Piedra
            else if (opJG==0 && opPC==0) {
                System.out.println("Empate.");
            }
            //#######################
            //JG Papel - PC - Piedra
            else if (opJG==1 && opPC==0) {
                System.out.println("Gana el jugador. Papel envuelve piedra");
                contJG++;
            }
            //JG Papel - PC - Tijera
            else if (opJG==1 && opPC==2) {
                System.out.println("Gana el ordenador. Tijeras corta papel");
                contPC++;
            }
            //JG Papel - PC - Papel
            else if (opJG==1 && opPC==2) {
                System.out.println("Empate");
            }
            //#######################
            //JG Tijeras - PC - Piedra
            else if (opJG==2 && opPC==0) {
                System.out.println("Gana el ordenador. Piedra rompe tijeras.");
                contPC++;
            }
            //JG Tijeras - PC - Papel
            else if (opJG==2 && opPC==1) {
                System.out.println("Gana el jugador. Tijeras rompe papel.");
                contJG++;
            }
            //JG Tijeras - PC - Tijeras
            else if (opJG==2 && opPC==2) {
                System.out.println("Empate");
            }

            //Mostrar marcador
            System.out.println("Marcador\n========");
            System.out.printf("Jugador: %d - Ordenador: %d\n", contJG, contPC);

        } while ((contJG<3) && (contPC<3));

        System.out.println("FIN DEL JUEGO");

        sc.close();
    }
}
