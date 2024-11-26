package CP07;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 7 - Tema 4\n");

        //Instancias
        //Actores
        Actor a1 = new Actor("Esteban Quito", 26);
        Actor a2 = new Actor("Aitor Menta", 30);
        //Directores
        Director d1 = new Director("Arcipollo", 40);
        Director d2 = new Director("Piberploncio", 50);
        //Películas
        Pelicula pl1 = new Pelicula("Assaassaass", "2024", "drama", d1, a1);
        Pelicula pl2 = new Pelicula("Esseesseess", "2023", "comedia", d2, a2);

        System.out.println("Detalles película 1: ");
        pl1.mostrarDetalles();
        System.out.println("Detalles película 2: ");
        pl2.mostrarDetalles();

    }
}
