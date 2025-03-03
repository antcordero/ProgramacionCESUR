public class DiametroSuperiorExceptionplanetas extends Exception {

    public DiametroSuperiorExceptionplanetas (double  diametro) {
        super("Error. Diámetro superior a 100km: " + diametro);
    }
}
