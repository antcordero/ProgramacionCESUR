public class ExcepcionDivisionPorCero extends Exception {

    public ExcepcionDivisionPorCero(double message) {
        super("Trata DivisionPorCero: / por " + message);
    }
}
