import javax.swing.*;

public class AppBlocNotas extends JFrame{
    private JPanel panel1;
    private JTextArea textArea1;
    private JPanel panel2;

    //Menu
    JMenuBar barraMenu = new JMenuBar();
    JMenu menuArchivo = new JMenu("Archivo");
    JMenuItem abrir = new JMenuItem("Abrir");
    JMenuItem guardar = new JMenuItem("Guardar");
    JMenuItem salir = new JMenuItem("Salir");

    menuArchivo.add(abrir);
    menuArchivo.add(guardar);
    menuArchivo.addSeparator();
    menuArchivo.add(salir);
    barraMenu.add(menuArchivo);

    setJMenuBar(barraMenu);

    public AppBlocNotas() {
        setTitle("Bloc de notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
        setBounds(750,300,450,450);
        
    }
}
