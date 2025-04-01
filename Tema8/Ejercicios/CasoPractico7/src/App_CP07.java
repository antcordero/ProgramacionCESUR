import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class App_CP07 extends JFrame {

    //Arrays para almacenamiento
    private String[] nombres = new String[30];
    private double[] notas = new double[30];
    private int contador = 0;

    //Componentes de la interfaz Swing
    private JPanel panel1;
    private JPanel Panel2;
    private JPanel Panel3;
    private JPanel Panel4;
    private JPanel Panel5;
    private JButton agregarNotasButton;
    private JButton guardarNotasButton;
    private JButton cargarNotasButton;
    private JTextField nombreDelEstudianteTextField;
    private JTextField calificacionTextField;
    private JTextArea textArea1;

    public App_CP07() {
        setTitle("Gestión de Calificaciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
        setBounds(750,300, 450,450);

        //Configurar listeners para los botones
        agregarNotasButton.addActionListener(this::agregarNotaAction);
        cargarNotasButton.addActionListener(this::guardarNotasAction);
        guardarNotasButton.addActionListener(this::cargarNotasAction);
    }

    private void agregarNotaAction(ActionEvent e) {
        String nombre = nombreDelEstudianteTextField.getText().trim();
        String notaStr = calificacionTextField.getText().trim();

        //Validar campos
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double nota = Double.parseDouble(notaStr);
            if (nota < 0 || nota > 10) {
                JOptionPane.showMessageDialog(this, "La nota debe estar entre 0 y 10", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Verificar si el estudiante ya existe
            int indiceExistente = -1;
            for (int i = 0; i < contador; i++) {
                if (nombres[i].equalsIgnoreCase(nombre)) {
                    indiceExistente = i;
                    break;
                }
            }

            if (indiceExistente >= 0) {
                //Preguntar si desea modificar
                int respuesta = JOptionPane.showConfirmDialog(this,
                        "El estudiante ya existe. ¿Desea modificar su nota?",
                        "Confirmar", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    notas[indiceExistente] = nota;
                }
            } else {
                //Agregar nuevo estudiante
                if (contador < nombres.length) {
                    nombres[contador] = nombre;
                    notas[contador] = nota;
                    contador++;
                } else {
                    JOptionPane.showMessageDialog(this,
                            "No se pueden agregar más estudiantes (límite alcanzado)",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            //Actualizar el área de texto
            actualizarTextArea();

            //Limpiar campos
            nombreDelEstudianteTextField.setText("");
            calificacionTextField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "La nota debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarNotasAction(ActionEvent e) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\AntonioCorderoMolina\\Desktop\\Programación\\Tema8\\Ejercicios\\CasoPractico7.\\src\\notas.txt"))) {
            for (int i = 0; i < contador; i++) {
                writer.println(nombres[i] + " - " + notas[i]);
            }
            JOptionPane.showMessageDialog(this, "Notas guardadas correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar las notas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarNotasAction(ActionEvent e) {
        File archivo = new File("C:\\Users\\AntonioCorderoMolina\\Desktop\\Programación\\Tema8\\Ejercicios\\CasoPractico7.\\src\\notas.txt");
        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(this, "El archivo de notas no existe", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            contador = 0;
            String linea;
            while ((linea = reader.readLine()) != null && contador < nombres.length) {
                String[] partes = linea.split(" - ");
                if (partes.length == 2) {
                    nombres[contador] = partes[0];
                    try {
                        notas[contador] = Double.parseDouble(partes[1]);
                        contador++;
                    } catch (NumberFormatException ex) {
                        //Ignorar línea si la nota no es válida
                    }
                }
            }
            actualizarTextArea();
            JOptionPane.showMessageDialog(this, "Notas cargadas correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar las notas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarTextArea() {
        textArea1.setText(""); //Limpiar el área de texto

        for (int i = 0; i < contador; i++) {
            textArea1.append(nombres[i] + " - " + notas[i] + "\n");
        }
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}

