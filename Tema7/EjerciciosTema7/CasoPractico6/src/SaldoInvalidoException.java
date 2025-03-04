public class SaldoInvalidoException extends Exception{

    public SaldoInvalidoException(double saldo) {
        super("Saldo de una cuenta nunca puede ser negativo");
    }
}
