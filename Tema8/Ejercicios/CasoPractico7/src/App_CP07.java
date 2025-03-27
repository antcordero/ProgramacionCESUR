import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class App_CP07 extends JFrame{
    private JPanel Panel_Principal;
    private JPanel Panel2;
    private JTextField textField_nombre;
    private JPanel Panel3;
    private JTextField textField_nota;
    private JPanel Panel4;
    private JPanel Panel5;
    private JTextArea textArea_info;
    private JButton btn_addNota;
    private JButton btn_saveNota;
    private JButton btn_loadNota;

    public App_CP07() {
        setTitle("Gestión de Calificaciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Panel_Principal);
        setBounds(750,300,450,450);

        textField_nombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        textField_nota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



        //Botones
        btn_addNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btn_saveNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btn_loadNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

}
