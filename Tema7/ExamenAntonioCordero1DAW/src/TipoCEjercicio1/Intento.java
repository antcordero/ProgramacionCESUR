package TipoCEjercicio1;

public class Intento {

    private long timestamp;
    private String resultado;

    //Constructor
    public Intento(long timestamp, String resultado) {
        //this.timestamp = System.currentTimeMillis();
        this.resultado = resultado;
    }

    public Intento() {

    }

    //getters - setters
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

    //toString
    @Override
    public String toString() {
        return "Intento en " +  timestamp + "ms - Resultado:" + resultado + "\n";
    }
}
