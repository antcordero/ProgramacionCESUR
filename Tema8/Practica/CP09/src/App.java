import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraSwing calculadora = new CalculadoraSwing();
            calculadora.setVisible(true);
        });
    }
}
