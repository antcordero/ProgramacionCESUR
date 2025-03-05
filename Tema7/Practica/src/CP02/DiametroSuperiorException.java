package CP02;

public class DiametroSuperiorException extends Exception {
    public DiametroSuperiorException(String nombre) {
        super("ERROR. Diametro del planeta "+ nombre +" es mayor a 100km");
    }
}
