public class Smartphone extends Dispositivo {

    public Smartphone(String modelo, String marca, boolean conectado) {
        super(modelo, marca, conectado);
    }

    //Método adicional
    public void hacerLlamada(String numero) {
        System.out.println("El Smartphone está llamando al número " + numero);
    }
}
