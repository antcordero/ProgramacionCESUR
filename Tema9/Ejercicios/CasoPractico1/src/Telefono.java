public abstract class Telefono {
    private String numero;

    public Telefono(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void llamarANumero(String num) {
        System.out.println("Llamando al teléfono " + num);
    }

    public void recibirLlamada(String num) {
        System.out.println("Recibiendo llamada del teléfono " + num);
    }
}
