public class DiametroInferiorException extends Exception {

    public DiametroInferiorException (double  diametro) {
        super("Error. Diámetro inferior a 20km: " + diametro);
    }

}
