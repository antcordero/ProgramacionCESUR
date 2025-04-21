public class SmartTV extends Dispositivo{

    public SmartTV(String modelo, String marca, boolean conectado) {
        super(modelo, marca, conectado);
    }

    //Método adicional
    public void reproducirVideo(String video) {
        System.out.println("La SmartTV está reproduciendo un vídeo de " + video);
    }

}
