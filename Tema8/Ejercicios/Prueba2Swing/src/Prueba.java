import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prueba extends JFrame{

    private JPanel panel1;
    private JLabel lbl_Texto;
    private JButton btn_Limpiar;
    private JButton btn_Escribir;
    private JButton btn_autor;

    public Prueba(){
        setTitle("Control de eventos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        //setLocationRelativeTo(null);
        setBounds(350,350,250,250);
        setSize(250,250);
        btn_Limpiar.addActionListener(e -> {
            acciones(e);
        });
        btn_Escribir.addActionListener(e -> {
            acciones(e);
        });
        btn_autor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
    }

    private void acciones(ActionEvent e) {
        //Si pulsa el botón de limpiar
        if (e.getSource() == btn_Limpiar) {
            lbl_Texto.setText("---");
            setSize(350,350);
        }

        //Si pulsa el botón de escribir
        if (e.getSource() == btn_Escribir) {
            lbl_Texto.setText("Hola Mundo");
            setSize(450,450);
        }

        //Si pulsa el botón autor
        if (e.getSource() == btn_autor) {
            lbl_Texto.setText("Autor: Antonio Cordero");
            setSize(450,450);
        }
    }


}
