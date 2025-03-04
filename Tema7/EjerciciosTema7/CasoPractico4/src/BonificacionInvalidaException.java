public class BonificacionInvalidaException extends Exception {

    public BonificacionInvalidaException(double bonificacion) {
        super ("La bonificación no pueden ser negativas ni superar el 50% del salario base\n Introduzca los datos de nuevo");
    }
}
