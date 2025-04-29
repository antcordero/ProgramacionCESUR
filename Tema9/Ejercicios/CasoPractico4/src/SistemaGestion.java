import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SistemaGestion implements Gestion {
    private List<Consola> consolas;
    private List<Videojuego> videojuegos;
    private String consolasFilePath = "consolas.csv";
    private String videojuegosFilePath = "videojuegos.csv";

    public SistemaGestion() {
        this.consolas = new ArrayList<>();
        this.videojuegos = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos() {
        try {
            consolas = CSVfunciones.cargarConsolas(consolasFilePath);
            videojuegos = CSVfunciones.cargarVideojuegos(videojuegosFilePath, consolas);
        } catch (IOException e) {
            System.out.println("Error al cargar datos: " + e.getMessage());
        }
    }

    private void guardarDatos() {
        try {
            CSVfunciones.guardarConsolas(consolasFilePath, consolas);
            CSVfunciones.guardarVideojuegos(videojuegosFilePath, videojuegos);
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    //Resto de los métodos
    //(obtenerConsolas, obtenerVideojuegos, obtenerVideojuegosPorConsola, buscarConsola)

    @Override
    public void agregarConsola(Consola consola) {
        consolas.add(consola);
        guardarDatos();
    }

    @Override
    public void agregarVideojuego(Videojuego videojuego) {
        videojuegos.add(videojuego);
        guardarDatos();
    }

    @Override
    public List<Consola> obtenerConsolas() {
        return null;
    }

    @Override
    public List<Videojuego> obtenerVideojuegos() {
        return null;
    }

    @Override
    public List<Videojuego> obtenerVideojuegosPorConsola(String nombreConsola) {
        return null;
    }

    @Override
    public Consola buscarConsola(String nombreConsola) {
        return null;
    }


}