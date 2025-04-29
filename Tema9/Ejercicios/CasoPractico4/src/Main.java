public class Main {
    public static void main(String[] args) {
        SistemaGestion sistema = new SistemaGestion();
        MenuPrincipal menu = new MenuPrincipal(sistema);
        menu.iniciar();
    }
}