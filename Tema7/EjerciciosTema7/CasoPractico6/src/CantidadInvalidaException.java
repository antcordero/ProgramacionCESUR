public class CantidadInvalidaException extends Exception {

    public CantidadInvalidaException(double saldo) {
        super("ERROR -> Operación rechazada. Cantidad " + saldo + " es inválida.");
    }
}
