package TipoCEjercicio1;

public class SistemaSeguridad {
    private String calveCorrecta;
    private int consecutiveFailures;
    private long lockExpirationTime;
    private long baseLockDuration;
    private int lockMultiplier;
    private Intento[] historial;
    private int numIntentos;


    //Constructor
    public SistemaSeguridad() {
        this.calveCorrecta = "seguro123";
        this.historial = new Intento[numIntentos];
        this.numIntentos = 3;
    }


    //Métodos
    public void acceder(String clave) throws CuentaBloqueadaException, CredencialesIncorrectasException, DemasiadosIntentosException {

        long tiempoAhora = System.currentTimeMillis();

        //BLOQUEADA?
        if (tiempoAhora < lockExpirationTime) {
            long tiempoRestante = lockExpirationTime - tiempoAhora;
            throw new CuentaBloqueadaException("Cuenta bloqueada. Intenta de nuevo en " + tiempoRestante / 1000 + " segundos.");
        }

        //Verifica contraseña
        if (calveCorrecta.equals(clave)) {

            registrarIntento("Éxito");
            consecutiveFailures = 0;
            lockMultiplier = 1;
            System.out.println("Acceso concedido");

        } else {

            consecutiveFailures++;
            registrarIntento("Fallo");

            if (consecutiveFailures >= 3) {

                lockExpirationTime = tiempoAhora + baseLockDuration * lockMultiplier;
                lockMultiplier *= 2;
                consecutiveFailures = 0;
                throw new DemasiadosIntentosException();

            } else {
                throw new CredencialesIncorrectasException("Credenciales incorrectas. Intento " + consecutiveFailures + " de 3.");
            }
        }
    }

    private void registrarIntento(String resultado) {

        Intento nuevoIntento = new Intento(System.currentTimeMillis(), resultado);

        boolean lleno = false;

        for (int i = 0; i < historial.length ; i++) {
            if (historial[i]==null){
                lleno = true;
            }
        }

        //descartar el últmo registros y mover si el array está lleno
        if (lleno == true) {
            for (int i = historial.length - 1; i > 0; i--) {
                historial[i] = historial[i - 1];
            }

            historial[historial.length-1] = nuevoIntento;


        } else if (numIntentos < historial.length) {

            numIntentos++;

        }

    }

    public void mostrarHistorial() {
        System.out.println("Historial de intentos:");
        for (int i = 0; i < numIntentos; i++) {
            System.out.println(historial[i].toString());
        }
    }


}
