import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LectorProductos extends JFrame {
    private JPanel panel1;
    private JButton btnCargar;
    private JComboBox<String> cbCategoria;
    private JLabel lblMedia;
    private JLabel lblCaro;
    private JTextArea areaTexto;
    private Producto[] productos;
    private int numProductos;

    public LectorProductos() {
        setTitle("Lector de productos - CSV");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        productos = new Producto[1000];
        numProductos = 0;
        cbCategoria.addItem("Todas");
        cbCategoria.addItem("Tecnología");
        cbCategoria.addItem("Muebles");
        cbCategoria.addItem("Electrodomésticos");
        cbCategoria.addItem("Ropa");
        cbCategoria.addItem("Alimentos");

        UIManager.put("FileChooser.saveButtonText", "Guardar");
        UIManager.put("FileChooser.saveButtonToolTipText", "Guardar el archivo seleccionado");
        UIManager.put("FileChooser.cancelButtonText", "Cancelar");
        UIManager.put("FileChooser.cancelButtonToolTipText", "Cancelar");
        UIManager.put("FileChooser.newFolderButtonToolTipText","Nueva carpeta");
        UIManager.put("FileChooser.openButtonText", "Abrir");

        cbCategoria.addActionListener(e -> {
            filtrarProductos();
        });
        btnCargar.addActionListener(e -> {
            cargarArchivo();
        });
    }

    private void cargarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Cargar Archivo");
        fileChooser.setFileFilter(new FileNameExtensionFilter("CSV files", "csv"));
        int opcion = fileChooser.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(archivo));
                String linea = br.readLine();
                StringBuilder resultado = new StringBuilder();
                double media = 0;
                double caro = 0;
                while (linea != null) {
                    String[] datos = linea.split(",");
                    Producto producto = new Producto(datos[0],datos[1],datos[2]);
                    productos[numProductos] = producto;
                    numProductos++;
                    resultado.append(producto).append("\n");
                    if (Double.parseDouble(datos[1]) > caro ) {
                        caro = Double.parseDouble(datos[1]);
                    }
                    linea = br.readLine();
                    media += Double.parseDouble(producto.getPrecio());
                }
                areaTexto.setText(resultado.toString());
                media = media / numProductos;
                lblMedia.setText("Precio medio: " + String.format("%.2f€", media));
                lblCaro.setText("Producto más caro: " + String.format("%.2f€", caro));
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(panel1,"Archivo seleccionado no encontrado");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(panel1,"Error al leer el archivo");
            } finally {
                try {
                    if (br!=null)
                        br.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(panel1,"Error al cerrar el archivo");
                }
            }
        }
    }

    private void filtrarProductos() {
        StringBuilder resultado = new StringBuilder();
        areaTexto.setText("");
        double media = 0;
        double caro = 0;
        int contador = 0;
        for (int i = 0; i < numProductos; i++) {
            if (cbCategoria.getSelectedItem().equals("Todas")) {
                resultado.append(productos[i]).append("\n");
                media += Double.parseDouble(productos[i].getPrecio());
                contador++;
                if (Double.parseDouble(productos[i].getPrecio()) > caro) {
                    caro = Double.parseDouble(productos[i].getPrecio());
                }
            } else {
                if (cbCategoria.getSelectedItem().equals(productos[i].getCategoria())) {
                    resultado.append(productos[i]).append("\n");
                    media += Double.parseDouble(productos[i].getPrecio());
                    contador++;
                    if (Double.parseDouble(productos[i].getPrecio()) > caro) {
                        caro = Double.parseDouble(productos[i].getPrecio());
                    }
                }
            }
        }
        areaTexto.setText(resultado.toString());
        media = media /contador;
        lblMedia.setText("Precio medio: " + String.format("%.2f€", media));
        lblCaro.setText("Producto más caro: " + String.format("%.2f€", caro));
    }
}
