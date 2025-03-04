public class FondosInsuficientesException extends Exception {

    public FondosInsuficientesException(double saldoCuenta) {
        super("ERROR: Fondos Insuficientes. Saldo actual: " + saldoCuenta + "€");
    }
}
