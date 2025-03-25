import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //función lambda () -> {...}
        SwingUtilities.invokeLater(() -> {
                Prueba p = new Prueba();
                p.setVisible(true);
        });
    }
}
