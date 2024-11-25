package CP07;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 7\n");

        //Instancias
        //Actores
        Actor a1 = new Actor("nombreActor1", 26);
        Actor a2 = new Actor("nombreActor2", 27);
        //Director
        Director d1 = new Director("nombreDirector1", 30);
        Director d2 = new Director("nombreDirector2", 31);
        //Película
        Pelicula p1 = new Pelicula("tituloPelícula1", 2024, "thriller", a1, d1);
        Pelicula p2 = new Pelicula("tituloPelícula2", 2023, "drama", a2, d2);

        //Detalles
        p1.mostrarDetalles();
        System.out.println("");
        p2.mostrarDetalles();
    }
}
