import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSwing extends JFrame {
    private final JTextField campoTexto;
    private double primerNumero = 0;
    private String operacion = "";
    private boolean nuevaOperacion = false;

    public CalculadoraSwing() {
        // Configuración de la ventana
        setTitle("Calculadora Básica");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Campo de texto para mostrar números y resultados
        campoTexto = new JTextField();
        campoTexto.setFont(new Font("Arial", Font.BOLD, 24));
        campoTexto.setHorizontalAlignment(JTextField.RIGHT);
        campoTexto.setEditable(false);
        add(campoTexto, BorderLayout.NORTH);

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5));

        // Botones numéricos y operaciones
        String[] botones = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String textoBoton : botones) {
            JButton boton = new JButton(textoBoton);
            boton.setFont(new Font("Arial", Font.BOLD, 18));
            panelBotones.add(boton);

            // Agregar funcionalidad a los botones
            boton.addActionListener(new BotonListener());
        }

        add(panelBotones, BorderLayout.CENTER);
    }

    private class BotonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String textoBoton = ((JButton) e.getSource()).getText();

            if ("0123456789".contains(textoBoton)) { // Botones numéricos
                if (nuevaOperacion) {
                    campoTexto.setText("");
                    nuevaOperacion = false;
                }
                campoTexto.setText(campoTexto.getText() + textoBoton);
            } else if ("/+-*".contains(textoBoton)) { // Operaciones
                primerNumero = Double.parseDouble(campoTexto.getText());
                operacion = textoBoton;
                nuevaOperacion = true;
            } else if ("=".equals(textoBoton)) { // Calcular resultado
                double segundoNumero = Double.parseDouble(campoTexto.getText());
                double resultado = 0;

                switch (operacion) {
                    case "+":
                        resultado = primerNumero + segundoNumero;
                        break;
                    case "-":
                        resultado = primerNumero - segundoNumero;
                        break;
                    case "*":
                        resultado = primerNumero * segundoNumero;
                        break;
                    case "/":
                        if (segundoNumero != 0) {
                            resultado = primerNumero / segundoNumero;
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: División por cero", "ERROR", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        break;
                }

                campoTexto.setText(String.valueOf(resultado));
                nuevaOperacion = true;
            } else if ("C".equals(textoBoton)) { // Limpiar pantalla
                campoTexto.setText("");
                primerNumero = 0;
                operacion = "";
            }
        }
    }
}
