package CP010;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class LectorProductos extends JFrame{
    private JPanel panel1;
    private JButton btnCargarCSV;
    private JComboBox cbCategoria;
    private JLabel lblCategoria;
    private JLabel lblPredioMedio;
    private JLabel lblPrecioCaro;
    private JTextArea textArea;

    public LectorProductos(){
        setTitle("Lector de productos - CSV");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        setBounds(400, 300, 600, 500);

        btnCargarCSV.addActionListener(e -> {
            cargarCSV();
        });

        cbCategoria.addItem("Todas");
        cbCategoria.setSelectedItem("Todas");

        cbCategoria.addActionListener(e -> {
            filtrarProductos();
        });

    }

    private void filtrarProductos() {

        FileReader fr = null;
        BufferedReader br = null;

        textArea.setText("");

        // Para comparar el contenido de los comboBox convertir a String el item seleccionado

        String seleccion = (String) cbCategoria.getSelectedItem();

        try {

            fr = new FileReader("./misArchivos/productos.csv");
            br = new BufferedReader(fr);

            String linea = br.readLine();
            String categoria;
            int contadorProductos = 0;
            double sumaPrecios = 0;
            double precio = 0;
            double precioMedio = 0;
            double precioMax = 0;

            while (linea != null) {
                String [] dividir = linea.split(",");
                categoria = dividir[2];
                if (seleccion.equals("Todas") || seleccion.equals(categoria)) {
                    textArea.append("Nombre: " +dividir[0] + "\n" + "Precio: " + dividir[1] + " €\n" + "Categoría: " + categoria + "\n\n");
                    precio = Double.parseDouble(dividir[1]);
                    if (precio > precioMax) {
                        precioMax = precio;
                    }
                    sumaPrecios += precio;
                    contadorProductos++;
                }
                linea = br.readLine();
                precioMedio = sumaPrecios/contadorProductos;
            }
            lblPredioMedio.setText(String.format("Precio medio: %.2f€" , precioMedio));
            lblPrecioCaro.setText(String.format("Precio más caro: %.2f€" , precioMax));

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(panel1, "Archivo no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panel1, "Error al leer el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (fr != null){
                    fr.close();
                }
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(panel1, "Error al leer el archivo ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void cargarCSV() {
        File archivo = new File("./misArchivos/productos.csv");
        JFileChooser fc = new JFileChooser(archivo);
        fc.setDialogTitle("Selecciona un archivo");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "csv");
        fc.setFileFilter(filtro);
        int seleccion = fc.showOpenDialog(panel1);

        FileReader fr = null;
        BufferedReader br = null;

        String categorias = ",";

        try {
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File fichero = fc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                String linea = br.readLine();

                while (linea != null) {
                    String[] dividir = linea.split(",");
                    String categoria = dividir[2];
                    // Saca la categoría de la línea que está leyendo
                    if (!categorias.contains(categoria)) {
                        cbCategoria.addItem(categoria);
                        categorias += categoria;
                    }
                    // Mostrar los productos en el textArea
                    textArea.append("Nombre: " +dividir[0] + "\n" + "Precio: " + dividir[1] + " €\n" + "Categoría: " + categoria + "\n\n");
                    linea = br.readLine();
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(panel1, "Archivo no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panel1, "Error al leer el archivo", "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (fr != null){
                    fr.close();
                }
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(panel1, "Error al cerrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}
