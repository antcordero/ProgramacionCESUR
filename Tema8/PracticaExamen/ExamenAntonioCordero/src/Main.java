import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            Examen e = new Examen();
            e.setVisible(true);
        });
    }
}
