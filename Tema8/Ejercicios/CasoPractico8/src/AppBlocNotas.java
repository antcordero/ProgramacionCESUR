import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class AppBlocNotas extends JFrame {
    private JPanel panel1;
    private JTextArea textArea1;
    private JPanel panel2;

    public AppBlocNotas() {
        setTitle("Bloc de notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
        setBounds(750, 300, 450, 450);

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

        //Event Listeners
        //Abrir para seleccionar archivo en el JFileChooser
        abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccionarArchivo();
            }
        });

        //Guardar archivo
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarArchivo();
            }
        });

        //Salir (Resetear textArea)
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
    }

    //Botón de abrir del Menú, abrir un JFileChooser
    private void seleccionarArchivo() {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto (*.txt)", "txt");
        fc.setFileFilter(filtro);

        int seleccion = fc.showOpenDialog(panel1);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                //Limpia el textArea
                textArea1.setText("");

                String linea;
                while ((linea = br.readLine()) != null) {
                    textArea1.append(linea + "\n");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Guardar archivo desde el JTextArea
    private void guardarArchivo() {
        JFileChooser fc = new JFileChooser();

        int seleccion = fc.showSaveDialog(panel1);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();

            //ver si es .txt
            if (!fichero.getName().endsWith(".txt")) {
                fichero = new File(fichero.getAbsolutePath() + ".txt");
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
                bw.write(textArea1.getText());
                JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
