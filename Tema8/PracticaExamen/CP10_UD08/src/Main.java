import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CP10 cp10 = new CP10();
            cp10.setVisible(true);
        });
    }
}
