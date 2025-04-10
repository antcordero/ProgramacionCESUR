public class Smartphone extends Dispositivo {

    public Smartphone(String modelo, String marca, boolean conectado) {
        super(modelo, marca, conectado);
    }

    @Override
    public void conectarWifi() {

    }

    @Override
    public void desconectarWifi() {

    }

    @Override
    public boolean estaConectado() {
        return false;
    }

    //Método adicional
    public void hacerLlamada(String numero) {
        System.out.println("El Smartphone está llamando al número " + numero);
    }
}
