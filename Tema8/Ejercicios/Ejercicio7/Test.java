package Ejercicio7;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater((() -> {
            GestiondeCalificaciones p = new GestiondeCalificaciones();
            p.setVisible(true);
        }));
    }
}