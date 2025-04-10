import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App extends JFrame {

    private JTextField txtNombre;
    private JTextField txtTelefono;
    private JTextField txtEmail;
    private JComboBox<String> cmbCategoria;
    private JComboBox<String> cmbFiltroCategoria;
    private JTextArea txtAreaContactos;

    private JPanel panel1;
    private JPanel panel2;
    private JLabel lbl_Nombre;
    private JLabel lblTelefono;
    private JLabel lblEmail;
    private JLabel lblCategoria;
    private JComboBox comboBox_Categoria;
    private JPanel panel3;
    private JPanel panel4;
    private JButton btn_NuevoContacto;
    private JButton btn_CargarContactos;
    private JButton btn_GuardarContactos;

    private List<Contacto> contactos;

    public App() {
        setTitle("Gestión de Contactos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setBounds(700, 200, 500, 600);

        contactos = new ArrayList<>();

        btn_NuevoContacto.addActionListener(e -> agregarContacto());
        btn_CargarContactos.addActionListener(e -> cargarContactosDesdeCSV());
        btn_GuardarContactos.addActionListener(e -> guardarContactosEnCSV());
        cmbFiltroCategoria.addActionListener(e -> filtrarContactos());
    }

    //Métodos

    /**
     * Método para agregar contacto
     */
    private void agregarContacto() {
        String nombre = txtNombre.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String email = txtEmail.getText().trim();
        String categoria = (String) cmbCategoria.getSelectedItem();

        if (nombre.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (categoria.equals("Todas")) {
            JOptionPane.showMessageDialog(this, "Selecciona una categoría específica.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (contactos.size() >= 30) {
            JOptionPane.showMessageDialog(this, "No puedes agregar más de 30 contactos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Contacto nuevoContacto = new Contacto(nombre, telefono, email, categoria);
        contactos.add(nuevoContacto);

        JOptionPane.showMessageDialog(this, "Contacto agregado correctamente.");
        actualizarListaContactos();
    }

    /**
     * Actualizar contactos
     */
    private void actualizarListaContactos() {
        txtAreaContactos.setText("");
        for (Contacto c : contactos) {
            txtAreaContactos.append(c.toString() + "\n");
        }
    }

    /**
     * Cargar contactos desde un csv
     */
    private void cargarContactosDesdeCSV() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] datos = line.split(",");
                    if (datos.length == 4) {
                        Contacto contacto = new Contacto(datos[0], datos[1], datos[2], datos[3]);
                        contactos.add(contacto);
                    } else {
                        JOptionPane.showMessageDialog(this, "Archivo mal formado.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "Contactos cargados correctamente.");
                actualizarListaContactos();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    /**
     * Imprimir los contactos en un csv
     */
    private void guardarContactosEnCSV() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("contactos.csv"))) {
            for (Contacto c : contactos) {
                pw.println(c.getNombre() + "," + c.getTelefono() + "," + c.getEmail() + "," + c.getCategoria());
            }
            JOptionPane.showMessageDialog(this, "Contactos guardados correctamente en 'contactos.csv'.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Filtrar contactos
     */
    private void filtrarContactos() {
        String filtro = (String) cmbFiltroCategoria.getSelectedItem();

        txtAreaContactos.setText("");

        for (Contacto c : contactos) {
            if (filtro.equals("Todas") || c.getCategoria().equals(filtro)) {
                txtAreaContactos.append(c.toString() + "\n");
            }
        }
    }


}
