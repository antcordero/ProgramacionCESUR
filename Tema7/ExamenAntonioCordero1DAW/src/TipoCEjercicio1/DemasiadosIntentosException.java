package TipoCEjercicio1;

public class DemasiadosIntentosException extends Exception{
    public DemasiadosIntentosException() {
        super("Demasiados intentos fallidos. Cuenta bloqueada");
    }
}
