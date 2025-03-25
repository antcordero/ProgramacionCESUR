import javax.swing.*;

public class Aplicacion {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
             CP06 app = new CP06();
             app.setVisible(true);
        });
    }
}
