package CP02;

public class ValorNegativoException extends Exception {

    public ValorNegativoException(int diametro) {
        super("El diametro introducido: " + diametro + " no es válido -> Vuelva a introducir el diametro.");
    }
}
