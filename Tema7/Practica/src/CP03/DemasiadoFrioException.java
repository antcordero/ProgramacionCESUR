package CP03;

public class DemasiadoFrioException extends Limites {
    public DemasiadoFrioException(int temp) {
        super("Demasiado Frio = " + temp);
    }
}
