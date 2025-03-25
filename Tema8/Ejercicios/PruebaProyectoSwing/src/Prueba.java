import javax.swing.*;

public class Prueba extends JFrame {

    private JPanel panel1;

    public Prueba() {
        setTitle("Hola Mundo!");
        //este hace que se pueda cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        //pack minimiza la ventana de la app
        //pack();
        //poner el tamaño de la ventana manualmente
        setSize(350,300);
        //setMinimunSize y setMaximunSize

        //este método centra la posición de la aplicación en la pantalla
        setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
