import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuántas bolas blancas? ");
        int blancas = sc.nextInt();
        System.out.print("Cuántas bolas negras? ");
        int negras = sc.nextInt();
        sc.close();
        Urna miUrna = new Urna(blancas, negras);
        while (miUrna.totalBolas()>1){
            if (miUrna.bola() == miUrna.bola()){
                miUrna.ponerBlanca();
            } else {
                miUrna.ponerNegra();
            }
            System.out.println(" - Total: Blancas: " + miUrna.blancas+", Negras: " + miUrna.negras);
        }
        System.out.println("La bola es "+miUrna.bola());
    }
}
