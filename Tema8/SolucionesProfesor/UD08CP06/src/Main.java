import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Adivinar adivinar = new Adivinar();
            adivinar.setVisible(true);
        });
    }
}
