import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Calculadora extends JFrame{
    private JPanel panel1;
    private JTextField Display;
    private JLabel DisplayLabel;
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

    private double num1;
    private double num2;
    private String operando;
    private double resultado = 0;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperando() {
        return operando;
    }

    public void setOperando(String operando) {
        this.operando = operando;
    }

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
            DisplayLabel.setText("0");
        }
        if (e.getSource() == btn1) {
            DisplayLabel.setText("1");
        }
        if (e.getSource() == btn2) {
            DisplayLabel.setText("2");
        }
        if (e.getSource() == btn3) {
            DisplayLabel.setText("3");
        }
        if (e.getSource() == btn4) {
            DisplayLabel.setText("4");
        }
        if (e.getSource() == btn5) {
            DisplayLabel.setText("5");
        }
        if (e.getSource() == btn6) {
            DisplayLabel.setText("6");
        }
        if (e.getSource() == btn7) {
            DisplayLabel.setText("7");
        }
        if (e.getSource() == btn8) {
            DisplayLabel.setText("8");
        }
        if (e.getSource() == btn9) {
            DisplayLabel.setText("9");
        }

        //Operaciones
        if (e.getSource() == btnSumar) {
            DisplayLabel.setText("");
            num1 = (Double.parseDouble(DisplayLabel.getText()));
            num2 = (Double.parseDouble(DisplayLabel.getText()));
            setResultado(num1 + num2);
        }

        if (e.getSource() == btnRestar) {
            DisplayLabel.setText("");
            num1 = (Double.parseDouble(DisplayLabel.getText()));
            num2 = (Double.parseDouble(DisplayLabel.getText()));
            setResultado(num1 - num2);
        }

        if (e.getSource() == btnMultiplicar) {
            DisplayLabel.setText("");
            num1 = (Double.parseDouble(DisplayLabel.getText()));
            num2 = (Double.parseDouble(DisplayLabel.getText()));
            setResultado(num1 * num2);
        }

        if (e.getSource() == btnDividir) {
            DisplayLabel.setText("");
            num1 = (Double.parseDouble(DisplayLabel.getText()));
            num2 = (Double.parseDouble(DisplayLabel.getText()));


            try {
                if (num2==0) {
                    throw new ArithmeticException("Division by zero");
                }
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(panel1,"No se puede dividir por cero", "Error Aritmético",JOptionPane.ERROR_MESSAGE);
            }

            setResultado(num1 / num2);
        }

        if (e.getSource() == btnIgual) {

            DisplayLabel.setText(String.valueOf(resultado));
        }
    }
}
