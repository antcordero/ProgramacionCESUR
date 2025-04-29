import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVfunciones {
    private static final String CSV_SEPARATOR = ",";

    public static void guardarConsolas(String filePath, List<Consola> consolas) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Consola consola : consolas) {
                String linea;
                if (consola instanceof ConsolaSobremesa) {
                    ConsolaSobremesa cs = (ConsolaSobremesa) consola;
                    linea = "SOBREMESA" + CSV_SEPARATOR +
                            cs.getNombre() + CSV_SEPARATOR +
                            cs.getFabricante() + CSV_SEPARATOR +
                            cs.getResolucionMaxima();
                } else {
                    ConsolaPortatil cp = (ConsolaPortatil) consola;
                    linea = "PORTATIL" + CSV_SEPARATOR +
                            cp.getNombre() + CSV_SEPARATOR +
                            cp.getFabricante() + CSV_SEPARATOR +
                            cp.getDuracionBateria();
                }
                bw.write(linea);
                bw.newLine();
            }
        }
    }

    public static List<Consola> cargarConsolas(String filePath) throws IOException {
        List<Consola> consolas = new ArrayList<>();
        File file = new File(filePath);

        if (!file.exists()) {
            return consolas;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(CSV_SEPARATOR);
                if (datos.length >= 4) {
                    String tipo = datos[0];
                    String nombre = datos[1];
                    String fabricante = datos[2];

                    if (tipo.equals("SOBREMESA")) {
                        String resolucion = datos[3];
                        consolas.add(new ConsolaSobremesa(nombre, fabricante, resolucion));
                    } else if (tipo.equals("PORTATIL")) {
                        int bateria = Integer.parseInt(datos[3]);
                        consolas.add(new ConsolaPortatil(nombre, fabricante, bateria));
                    }
                }
            }
        }
        return consolas;
    }

    public static void guardarVideojuegos(String filePath, List<Videojuego> videojuegos) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Videojuego juego : videojuegos) {
                String linea = juego.getTitulo() + CSV_SEPARATOR +
                        juego.getGenero() + CSV_SEPARATOR +
                        juego.getConsola().getNombre();
                bw.write(linea);
                bw.newLine();
            }
        }
    }

    public static List<Videojuego> cargarVideojuegos(String filePath, List<Consola> consolas) throws IOException {
        List<Videojuego> videojuegos = new ArrayList<>();
        File file = new File(filePath);

        if (!file.exists()) {
            return videojuegos;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(CSV_SEPARATOR);
                if (datos.length >= 3) {
                    String titulo = datos[0];
                    String genero = datos[1];
                    String nombreConsola = datos[2];

                    Consola consola = buscarConsolaPorNombre(consolas, nombreConsola);
                    if (consola != null) {
                        videojuegos.add(new Videojuego(titulo, genero, consola));
                    }
                }
            }
        }
        return videojuegos;
    }

    private static Consola buscarConsolaPorNombre(List<Consola> consolas, String nombre) {
        for (Consola c : consolas) {
            if (c.getNombre().equals(nombre)) {
                return c;
            }
        }
        return null;
    }
}
