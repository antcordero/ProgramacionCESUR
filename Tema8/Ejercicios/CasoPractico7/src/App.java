import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater((() -> {
            App_CP07 app = new App_CP07();
            app.setVisible(true);
        }));
    }
}
