package TipoCEjercicio1;

public class Intento {

    private long timestamp;
    private String resultado;

    //
    public Intento(long timestamp, String resultado) {
        //this.timestamp = System.currentTimeMillis();
        this.resultado = resultado;
    }

    public Intento() {

    }

    //
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    //
    @Override
    public String toString() {
        return "Intento en " +  timestamp + "ms - Resultado:" + resultado + "\n";
    }
}
