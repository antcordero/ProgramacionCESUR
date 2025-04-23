import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
           GestionNotas gest = new GestionNotas();
           gest.setVisible(true);
        });
    }
}
