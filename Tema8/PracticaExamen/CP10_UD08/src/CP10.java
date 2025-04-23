import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class CP10 extends JFrame {
    private JPanel panel1;
    private JTextField tfNombre;
    private JTextField tfTelefono;
    private JTextField tfEmail;
    private JComboBox cbCategoria;
    private JTextArea areaTexto;
    private JButton btnNuevo;
    private JButton btnCargar;
    private JButton btnGuardar;

    private Contacto[] contactos;
    private int numContactos;

    public CP10() {
        setTitle("Gestor de Contactos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        setSize(450, 500);
        //setResizable(false);

        contactos = new Contacto[30];
        numContactos = 0;

        //Botones
        btnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
    }

    public void acciones(ActionEvent e) {

        //Cargar Contactos
        if (e.getSource() == btnCargar) {
            File archivo = new File("contactos.csv");
            if (archivo.exists()) {
                BufferedReader br = null;

                try {
                    br = new BufferedReader(new FileReader(archivo));
                    String linea = br.readLine();
                    while (linea != null) {
                        String[] datos = linea.split(",");
                        //Crear el contacto después de leer y separar
                        Contacto contacto = new Contacto(datos[0], datos[1], datos[2], datos[3]);
                        //Después de crear el contacto, añadir al array
                        contactos[numContactos] = contacto;
                        numContactos++;

                        //Añadir al textArea

                        //Seguir leyendo con el bucle
                        linea = br.readLine();
                    }
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(panel1, "No existe el archivo");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(panel1, "Error al leer el archivo");
                } finally {
                    try {
                        if (br != null) {
                            br.close();
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(panel1, "Error al cerrar el archivo");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(panel1, "No existe el archivo");
            }
        }

    }

}
