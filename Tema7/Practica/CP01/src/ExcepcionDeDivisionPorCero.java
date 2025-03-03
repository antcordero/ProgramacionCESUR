public class ExcepcionDeDivisionPorCero extends Exception {

    public ExcepcionDeDivisionPorCero(double num) {
        super("Trata Excepción de División Por cero: " + num);
    }

}
