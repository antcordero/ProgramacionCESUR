import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class CP10 extends JFrame {
    private JPanel panel1;
    private JTextField tfNombre;
    private JTextField tfTelefono;
    private JTextField tfEmail;
    private JComboBox<String> cbCategoria;
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

        //dar contenido al ComboBox
        cbCategoria.addItem("Todas");
        cbCategoria.addItem("Amigos");
        cbCategoria.addItem("Trabajo");
        cbCategoria.addItem("Familia");
        cbCategoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filtrarContactos();
            }
        });

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

    /**
     * Metodo para filtrar contactos
     */
    public void filtrarContactos() {
        StringBuilder texto = new StringBuilder();
        areaTexto.setText("");
        for (int i = 0; i < numContactos; i++) {
            if (cbCategoria.getSelectedItem().equals("Todas")) {
                texto.append(contactos[i].toString()).append("\n");
            } else {
                if (cbCategoria.getSelectedItem().equals(contactos[i].getCategoria())) {
                    texto.append(contactos[i].toString()).append("\n");
                }
            }
        }
    }

    public void acciones(ActionEvent e) {

        //***************
        //Guardar Contacto
        if (e.getSource() == btnGuardar) {
            //escribir en el archivo
            PrintWriter pw = null;
            try {
                pw = new PrintWriter(new FileWriter("contactos.csv"));
                for (int i = 0; i < numContactos; i++) {
                    pw.println(contactos[i].getNombre() + "," + contactos[i].getTelefono() + "," + contactos[i].getEmail() + "," + contactos[i].getCategoria());
                }

                JOptionPane.showMessageDialog(panel1, "Contactos guardados correctamente");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(panel1, "Error al guardar contactos");
            } finally {
                if (pw != null) {
                    pw.close();
                }
            }
        }

        //***************
        //Nuevo Contacto
        if (e.getSource() == btnNuevo) {
            //Debe comprobar que tenga todos los textField rellenos y la casilla del comboBox no fuese Todas
            if (!tfNombre.getText().isEmpty() && !tfTelefono.getText().isEmpty() && !tfEmail.getText().isEmpty()) {
                if (!cbCategoria.getSelectedItem().equals("Todas")) {
                    //Añadir el nuevo contacto -> se debe añadir al array
                    Contacto contacto = new Contacto(tfNombre.getText(), tfTelefono.getText(), tfEmail.getText(), cbCategoria.getSelectedItem().toString());
                    contactos[numContactos] = contacto;
                    numContactos++;

                    //Vaciar los textField
                    tfNombre.setText("");
                    tfTelefono.setText("");
                    tfEmail.setText("");

                    //Mensaje
                    JOptionPane.showMessageDialog(panel1, "Contacto agregado correctamente.  Recuerde Pulsar en 'Guardar contactos' para guardarlo en el archivo.");

                    //Actualizar el textArea con el nuevo contacto
                    areaTexto.setText(areaTexto.getText() + contacto.toString() + "\n");

                } else {
                    //Mensaje de error
                    JOptionPane.showMessageDialog(panel1, "Debe seleccionar una categoria.");

                }
            } else {
                //Mensaje de error
                JOptionPane.showMessageDialog(panel1, "Debe rellenar todos los campos");
            }
        }

        //****************
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
                        areaTexto.setText(areaTexto.getText() + contacto.toString() + "\n");

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
