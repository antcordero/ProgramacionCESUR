package CP010;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            LectorProductos lectorProductos = new LectorProductos();
            lectorProductos.setVisible(true);
        });
    }
}
