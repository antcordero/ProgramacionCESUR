package CP02;

public class DiametroInferiorException extends Exception {

    public DiametroInferiorException(String nombre) {
        super("ERROR. Diametro del planeta "+ nombre +" es menor a 20km");
    }

}
