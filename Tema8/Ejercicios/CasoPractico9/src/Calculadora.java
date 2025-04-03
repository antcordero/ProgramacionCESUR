import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    private JPanel panel1;
    private JTextField Display;
    private JPanel panel2;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDividir;
    private JPanel panel3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnMultiplicar;
    private JPanel panel4;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnRestar;
    private JPanel panel5;
    private JButton btnClear;
    private JButton btn0;
    private JButton btnIgual;
    private JButton btnSumar;

    private String num1;
    private String num2;
    private String operando;

    public Calculadora() {
        setTitle("Calculadora Simple");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setBounds(750,350,250,250);

        //##########################################
        // Botonera de operaciones
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText("");
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });

        //#######################################
        //Botonera de números
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
    }

    //Métodos para las operaciones
    private void acciones(ActionEvent e) {

        //Poner en el display los números
        if (e.getSource() == btn0) {
            Display.setText("0");
        }
        if (e.getSource() == btn1) {
            Display.setText("1");
        }
        if (e.getSource() == btn2) {
            Display.setText("2");
        }
        if (e.getSource() == btn3) {
            Display.setText("3");
        }
        if (e.getSource() == btn4) {
            Display.setText("4");
        }
        if (e.getSource() == btn5) {
            Display.setText("5");
        }
        if (e.getSource() == btn6) {
            Display.setText("6");
        }
        if (e.getSource() == btn7) {
            Display.setText("7");
        }
        if (e.getSource() == btn8) {
            Display.setText("8");
        }
        if (e.getSource() == btn9) {
            Display.setText("9");
        }

        //Operaciones
        if (e.getSource() == btnSumar) {
            num1 = Display.getText();
            Display.setText("");

        }

        if (e.getSource() == btnRestar) {

        }

        if (e.getSource() == btnMultiplicar) {

        }

        if (e.getSource() == btnDividir) {

        }

        if (e.getSource() == btnIgual) {
            num2 = Display.getText();

            
        }
    }





}
