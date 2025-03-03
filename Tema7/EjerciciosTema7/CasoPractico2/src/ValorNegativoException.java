public class ValorNegativoException extends Exception {

    public ValorNegativoException (double  diametro) {
        super("Error. Valor Negativo: " + diametro);
    }
}
