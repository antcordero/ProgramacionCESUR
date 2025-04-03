import javax.swing.*;

public class Aplicacion {
    public static void main(String[] args) {
        SwingUtilities.invokeLater((() -> {
            AppBlocNotas app = new AppBlocNotas();
            app.setVisible(true);
        }));
    }
}
