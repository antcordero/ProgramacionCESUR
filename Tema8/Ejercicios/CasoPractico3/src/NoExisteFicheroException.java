public class NoExisteFicheroException extends Exception{
    public NoExisteFicheroException(String nombreArchivo) {
        super("ERROR. El archivo " + nombreArchivo + " no existe");
    }
}
