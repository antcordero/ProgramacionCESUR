import Criaturas.*;

public class Test {
    public static void main(String[] args) {
        // Creación de criaturas
        Elfo legolas = new Elfo("Legolas");
        Troll shrek = new Troll("Shrek");
        Enano gimli = new Enano("Gimli");

        // Mostrar estado inicial
        System.out.println("=== Estado inicial ===");
        System.out.println(legolas);
        System.out.println(shrek);
        System.out.println(gimli);
        System.out.println();

        // Batalla 1: Elfo vs Troll
        System.out.println("=== Batalla 1: Elfo vs Troll ===");
        legolas.luchar(shrek);

        // Recuperación
        System.out.println("\n=== Recuperación ===");
        legolas.recuperar();
        shrek.descansar();

        // Batalla 2: Troll vs Enano
        System.out.println("\n=== Batalla 2: Troll vs Enano ===");
        shrek.luchar(gimli);

        // Curar con elfo
        System.out.println("\n=== Curación ===");
        legolas.curar(gimli);

        // Mostrar estado final
        System.out.println("\n=== Estado final ===");
        System.out.println(legolas);
        System.out.println(shrek);
        System.out.println(gimli);
    }
}