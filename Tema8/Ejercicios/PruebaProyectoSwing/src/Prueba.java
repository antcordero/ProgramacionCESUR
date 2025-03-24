import javax.swing.*;

public class Prueba extends JFrame {

    private JPanel panel1;
    private JPanel panel;

    public Prueba() {
        setTitle("Hola Mundo!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
        setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
