public class Test {
    public static void main(String[] args) {
        MovilCamara miMovil = new MovilCamara("123456789", "MSE", "7712", "Movifone");
        miMovil.realizarFoto("4K");
        miMovil.llamarANumero("987654321");
        miMovil.recibirLlamada("1234");
    }
}
