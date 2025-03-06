package TipoCEjercicio1;

public class SistemaSeguridad {
    private String calveCorrecta;
    private int consecutiveFailures;
    private long lockExpirationTime;
    private long baseLockDuration;
    private int lockMultiplier;
    private Intento[] historial;
    private int numIntentos;


    //Constructores
    public SistemaSeguridad(String calveCorrecta, int consecutiveFailures, long lockExpirationTime, long baseLockDuration, int lockMultiplier, Intento historial, int numIntentos) {
        this.calveCorrecta = calveCorrecta;
        this.consecutiveFailures = consecutiveFailures;
        this.lockExpirationTime = lockExpirationTime;
        this.baseLockDuration = baseLockDuration;
        this.lockMultiplier = lockMultiplier;
        this.historial = new Intento[]{};
        this.numIntentos = 3;
    }

    public SistemaSeguridad() {
    }

    //getters - setters


    //Métodos
    public void acceder(String clave) throws CuentaBloqueadaException, CredencialesIncorrectasException, DemasiadosIntentosException {

        long tiempoAhora = System.currentTimeMillis();

        //BLOQUEADA?
        if (tiempoAhora < lockExpirationTime) {
            long tiempoRestante = lockExpirationTime - tiempoAhora;
            throw new CuentaBloqueadaException("Cuenta bloqueada. Intenta de nuevo en " + tiempoRestante / 1000 + " segundos.");
        }

        //Verifica contraseña
        if (clave.equals(clave)) {
            registrarIntento("Éxito");
            consecutiveFailures = 0;
            lockMultiplier = 1;
            System.out.println("Acceso concedido.");
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

        //descartar el últmo registros y mover
        for (int i = historial.length - 1; i > 0; i--) {
            historial[i] = historial[i - 1];
        }

        historial[0] = nuevoIntento;

        //
        if (numIntentos < historial.length) {
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
