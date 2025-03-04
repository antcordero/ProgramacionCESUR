public class SalarioInvalidoException extends Exception {

    public SalarioInvalidoException(double salario) {
        super("Salario inválido, no se puede registrar el empleado.");
    }
}
