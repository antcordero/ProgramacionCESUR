import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class Ejercicio8 extends JFrame {

    private JPanel panel1;
    private JTextArea areaTexto;

    public Ejercicio8() {
        setTitle("Bloc de Notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        setSize(450, 450);
        //setResizable(false);

        //Añadir la barra de menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Archivo");
        //Opciones del menú
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem salir = new JMenuItem("Salir");
        menu.add(abrir);
        menu.add(guardar);
        menu.addSeparator();
        menu.add(salir);
        //añadir el menú a la barra de menú
        menuBar.add(menu);
        setJMenuBar(menuBar);

        //Añadir eventos para los botones del menú
        abrir.addActionListener(e -> {
            abrirArchivo();
        });
        guardar.addActionListener(e -> {
            guardarArchivo();
        });
        salir.addActionListener(e -> {
            System.exit(0);
        });

    }

    //Métodos

    /**
     * Metodo para guardar, este metodo escribe en el archivo lo que escribamos por teclado en el textArea
     */
    private void guardarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo de Notas", "txt"));

        int opcion = fileChooser.showSaveDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            //Si es approve, se obtiene el archivo donde se va a guardar
            File archivo = fileChooser.getSelectedFile();

            PrintWriter pw = null;
            try {
                pw = new PrintWriter(new FileWriter(archivo));
                //escribir de golpe en vez de línea a línea
                areaTexto.write(pw);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(panel1, "Archivo no encontrado");
            } finally {
                if (pw != null)
                    pw.close();
            }
        }
    }

    /**
     * Metodo para abrir un archivo, leer su contenido y mostrarlo en el text Area
     */
    private void abrirArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos txt", ".txt"));

        int opcion = fileChooser.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            //Crear el objeto file dando la opción de elegir el archivo
            File archivo = fileChooser.getSelectedFile();
            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader(archivo));
                //Se puede leer línea a línea y que añada al text Area línea por línea
                //esta es otra forma:
                areaTexto.read(br, null);
                //Hacer que el puntero vaya al final del texto
                String texto = areaTexto.getText();
                areaTexto.setCaretPosition(texto.length());

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(panel1, "Achivo no encontrado");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(panel1, "Error al leer el archivo");
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                }catch (IOException e){
                    JOptionPane.showMessageDialog(panel1, "Error al cerrar el archivo");
                }
            }
        }
    }


}
