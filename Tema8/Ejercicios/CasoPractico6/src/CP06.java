import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CP06 extends JFrame {
    private JPanel Panel_Principal;
    private JLabel lbl_Titulo;
    private JLabel lbl_intro;
    private JTextField txtField_EscribirNum;
    private JButton btn_Adivinar;
    private JLabel lbl_Pista;
    private JLabel lbl_contIntentos;
    private JButton btn_nuevoJuego;

    private int numSecreto;
    private int numIntroducido;
    private int cont;

    Random r = new Random();

    //Constructor
    public CP06() {
        setTitle("Juego - Adivina el número secreto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Panel_Principal);
        setBounds(600,350,750,250);

        //Generar número aleatorio cada vez que se inicie la app
        this.numSecreto = r.nextInt(100) + 1;
        this.cont = 0;

        //Eventos
        //caja de texto para escribir números
        txtField_EscribirNum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        //Boton Adivinar
        btn_Adivinar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        //Boton nuevo juego
        btn_nuevoJuego.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });

    }

    //Método
    public void acciones(ActionEvent e) {

        cont++;
        lbl_contIntentos.setText("Intentos: " + cont);

        //recogerNúmero del textField
        if (e.getSource() == btn_Adivinar) {
            try {

                numIntroducido = Integer.parseInt(txtField_EscribirNum.getText());
                cont++;
                lbl_contIntentos.setText("Intentos: " + cont);

                // Lógica de comparación
                if (numIntroducido<1 || numIntroducido>100) {
                    //lbl_Pista.setText("Número introducido fuera de rango");
                    JOptionPane.showMessageDialog(null,"Número introducido fuera de rango");
                } else if (numIntroducido > numSecreto) {
                    lbl_Pista.setText("El secreto es menor");
                } else if (numIntroducido < numSecreto) {
                    lbl_Pista.setText("El secreto es mayor");
                } else {
                    lbl_Pista.setText("¡Correcto! Has adivinado el número en " + cont + " intentos");
                    btn_Adivinar.setEnabled(false);
                    txtField_EscribirNum.setEnabled(false);
                }
            } catch (NumberFormatException ex) {
                //lbl_Pista.setText("Error: Debes ingresar un número válido");
                JOptionPane.showMessageDialog(null, "Error: Debes ingresar un número válido");
            }
        }


        //Reiniciar juego
        if (e.getSource() == btn_nuevoJuego) {
            numSecreto = r.nextInt(100) + 1;
            cont = 0;
            lbl_Pista.setText("---");
            txtField_EscribirNum.setText("");
            lbl_contIntentos.setText("Intentos: " + cont);

            btn_Adivinar.setEnabled(true);
            txtField_EscribirNum.setEnabled(true);
        }

    }


}
