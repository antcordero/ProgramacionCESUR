package CP01;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 1 - Tema 3\n");

        //Instancias
        Persona p1 = new Persona("Daniel", 25, "fluido");
        Persona p2 = new Persona("Peti", 25, "binarie");

        //Imprimir personas
        p1.mostrarInfo();
        p2.mostrarInfo();

        //Cumplir años
        System.out.println("\nEl año que viene tendrán 1 año más");
        p1.cumplirAnios();
        p2.cumplirAnios();

        //Resultado
        p1.mostrarInfo();
        p2.mostrarInfo();

    }
}
