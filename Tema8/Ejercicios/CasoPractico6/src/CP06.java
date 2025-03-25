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

    private int numAleatorio;
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
        this.numAleatorio = r.nextInt(1,101);
        this.cont = 0;

        //Eventos
        txtField_EscribirNum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btn_Adivinar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
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
        if (numIntroducido == numAleatorio) {

        }

    }
}
