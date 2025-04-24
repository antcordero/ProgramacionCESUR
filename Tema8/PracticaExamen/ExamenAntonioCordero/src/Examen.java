import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Examen extends JFrame{
    private JPanel panel1;
    private JComboBox cbDepartamento;
    private JLabel lbSueldoMedio;
    private JLabel lbSueldoMaximo;
    private JTextArea areaTexo;
    private JButton btnCargar;

    private double sueldoMedio;
    private double suma;
    private double sueldoMaximo;
    private String nombreEmpleadoSueldoMaximo;

    private Empleado[] empleados;
    private int contador;


    public Examen() {
        setTitle("Gestor de Contactos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        setSize(700, 500);

        sueldoMedio = 0;
        suma = 0;
        sueldoMaximo = 0;
        empleados = new Empleado[30];
        contador = 0;
        nombreEmpleadoSueldoMaximo = "";

        //nombre de los departamentos del combobox
        cbDepartamento.addItem("Todos");
        cbDepartamento.setSelectedItem("Todos");

        //Botón cargar csv
        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Controlar error al darle de nuevo al botón de cargar
                areaTexo.setText("");
                contador = 0;
                sueldoMedio = 0;
                suma = 0;
                sueldoMaximo = 0;
                nombreEmpleadoSueldoMaximo = "";

                cargarCSV();
            }
        });

        //comboBox para los Departamentos
        cbDepartamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexo.setText("");
                lbSueldoMedio.setText("Sueldo Medio: - €");
                lbSueldoMaximo.setText("Sueldo Máximo: - €");
                nombreEmpleadoSueldoMaximo = "";
                sueldoMedio = 0;
                suma = 0;
                sueldoMaximo = 0;

                seleccionarDepartamento();
            }
        });
    }


    /**
     * Método para cargar el archivo csv
     */
    public void cargarCSV() {
        //Leer el archivo
        File archivo = new File("empleados.csv");

        //FileChooser para el botón
        JFileChooser fileChooser = new JFileChooser(archivo);
        fileChooser.setDialogTitle("Selecciona un archivo");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "csv");
        fileChooser.setFileFilter(filtro);
        int opcionComboBox = fileChooser.showOpenDialog(panel1);

        BufferedReader br = null;

        String departemantos = ",";

        try {
            br = new BufferedReader(new FileReader(archivo));
            String linea = br.readLine();

            while (linea != null) {
                String[] datos = linea.split(",");
                //Nombre, Sueldo, Departamento
                Empleado empleado = new Empleado(datos[0], datos[1], datos[2]);
                empleados[contador] = empleado;
                contador++;

                //Anañdir al text area
                areaTexo.setText(areaTexo.getText() + empleado.toString() + "\n");

                //Para el comboBox leer los departamentos y añadirlos
                String departemanto = datos[2];
                if (!departemantos.contains(departemanto)) {
                    cbDepartamento.addItem(departemanto);
                    departemantos = departemantos + departemanto;
                }

                //Calcular sueldo medio
                double sueldo = Double.parseDouble(datos[1]);
                suma = suma + sueldo;

                //máximo sueldo
                if (sueldo > sueldoMaximo) {
                    sueldoMaximo = sueldo;
                    nombreEmpleadoSueldoMaximo = datos[0];
                }

                linea = br.readLine();
            }

            //cálculo del sueldo medio
            sueldoMedio = suma / contador;

            //escribir en los label los sueldos
            lbSueldoMedio.setText("Sueldo Medio: " + String.format("%.2f",sueldoMedio) + " €");
            lbSueldoMaximo.setText("Sueldo máximo: (" + nombreEmpleadoSueldoMaximo + "): " + String.format("%.2f",sueldoMaximo) + " €");

        } catch (FileNotFoundException e) {
            JOptionPane.showInputDialog(panel1,"Error la cargar el archivo. No existe el archivo.");
        } catch (IOException e) {
            JOptionPane.showInputDialog(panel1,"Error al leer el archivo");

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(panel1, "Error al cerrar el archivo");
            }
        }

    }

    /**
     * Método para que al seleccionar el departamento en el comboBox, muestra lo seleccionado
     */
    public void seleccionarDepartamento() {
        //leer el archivo
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("empleados.csv");
            br = new BufferedReader(fr);

            String linea = br.readLine();

            String seleccionComboBox = (String) cbDepartamento.getSelectedItem();
            String seleccion = "";

            double sueldo = 0;

            while (linea != null) {
                String [] datosEmp = linea.split(",");
                seleccion = datosEmp[2];

                if (seleccionComboBox.equals(seleccion)) {
                    //Para los departamentos
                    areaTexo.append("Nombre: " + datosEmp[0] + "\n" + "Sueldo: " + datosEmp[1] + " €\n" + "Departamento: " + seleccionComboBox + "\n" + "\n");

                    //sueldo máximo
                    sueldo = Double.parseDouble(datosEmp[1]);
                    if (sueldo > sueldoMaximo) {
                        sueldoMaximo = sueldo;
                        nombreEmpleadoSueldoMaximo = datosEmp[0];
                    }
                    suma = suma + sueldo;
                    contador++;

                } else if (seleccionComboBox.equals("Todos")) {
                    //Para Todos
                    areaTexo.append("Nombre: " + datosEmp[0] + "\n" + "Sueldo: " + datosEmp[2] + "\n" + "Departamento: " + seleccionComboBox + "\n" + "\n");

                    //sueldo máximo
                    sueldo = Double.parseDouble(datosEmp[1]);
                    if (sueldo > sueldoMaximo) {
                        sueldoMaximo = sueldo;
                        nombreEmpleadoSueldoMaximo = datosEmp[0];
                    }
                    suma = suma + sueldo;
                    contador++;
                }

                linea = br.readLine();
            }

        //escribir en los label
        sueldoMedio = suma / contador;
        lbSueldoMedio.setText("Sueldo Medio: " + String.format("%.2f",sueldoMedio) + " €");
        lbSueldoMaximo.setText("Sueldo máximo: (" + nombreEmpleadoSueldoMaximo + "): " + String.format("%.2f",sueldoMaximo) + " €");

        } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(panel1,"Error: Archivo no encontrado");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panel1, "Error al leer el archivo");
        } finally {
            try {
                if (br!=null) {
                    br.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(panel1, "Error al cerrar el archivo");
            }

        }

    }

}
