import java.util.List;

public interface Gestion {
    void agregarConsola(Consola consola);
    void agregarVideojuego(Videojuego videojuego);

    List<Consola> obtenerConsolas();
    List<Videojuego> obtenerVideojuegos();
    List<Videojuego> obtenerVideojuegosPorConsola(String nombreConsola);

    Consola buscarConsola(String nombreConsola);

}
