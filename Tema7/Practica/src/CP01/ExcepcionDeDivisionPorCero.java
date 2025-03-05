package CP01;

public class ExcepcionDeDivisionPorCero extends Exception {

    public ExcepcionDeDivisionPorCero(int msg) {
        super("Trata DivisionPorCero: / por " + msg);
    }
}
