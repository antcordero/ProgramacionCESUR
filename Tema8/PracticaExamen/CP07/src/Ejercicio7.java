import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Ejercicio7 extends JFrame {

    private JPanel panel1;
    private JTextField tfNombre;
    private JTextField tfNota;
    private JTextArea areaNotas;
    private JButton btnAgregar;
    private JButton btnGuardar;
    private JButton btnCargar;

    //Arrays
    private String[] nombres;
    private double[] notas;
    private int indice = 0;

    public Ejercicio7() {
        setTitle("Gestion de Calificaciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        setSize(450, 400);
        setResizable(false);

        //Crear los Arrays en el inicio de la app
        nombres = new String[10];
        notas = new double[10];

        //Action Listeners
        btnAgregar.addActionListener(new ActionListener() {
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

        btnCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones(e);
            }
        });
    }

    /**
     * Acciones de los botones -> ActionListeners, este metodo escucha de dónde se pulsa el botón con el getSource()
     * @param e
     */
    public void acciones(ActionEvent e) {

        //Preguntar al evento quién a producido el evento

        //Botón de Cargar
        if (e.getSource() == btnCargar) {
            cargarNotas();
        }

        //Botón de Guardar
        if (e.getSource() == btnGuardar) {
            //El botón de guardar escribe con PrintWriter en el archivo
            guardarNotas();
        }

        //Botón de Agregar
        if (e.getSource() == btnAgregar) {
            agregarNotas();
        }


    }

    /**
     * Metodo para agregar notas
     */
    private void agregarNotas() {
        //Nombre no puede estar vacío
        String nombre = tfNombre.getText();
        double nota = Double.parseDouble(tfNota.getText());

        if (!nombre.isEmpty()) {
            //si no está vacío, preguntar si la nota está en el rango 0-10
            if (nota>=0 && nota<=10) {
                //Preguntar antes si existe ya ese nombre - Si no existe devuelve -1 y si existe 1.
                int posicion = buscarEstudiante();
                if (posicion == -1) {
                    nombres[indice] = nombre;
                    notas[indice] = nota;
                    indice++;
                    areaNotas.setText(areaNotas.getText() + nombre + "-" + nota + "\n");
                } else {
                    int opcion = JOptionPane.showConfirmDialog(panel1,"El estudiante "+nombre+" ya tiene una nota ¿Deseas modificarla?", "Modificar nota", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (opcion == JOptionPane.YES_OPTION) {
                        notas[posicion] = nota;
                        String texto="";
                        for (int i = 0; i < indice; i++) {
                            texto= texto + nombres[i] + "-" + notas[i] + "\n";
                        }
                        areaNotas.setText("");
                        areaNotas.setText(texto + "\n");
                        JOptionPane.showMessageDialog(panel1,"Nota modificada correctamente");
                    }
                }

                //Aquí hay un nombre válido y nota correcta
                //Ahora se agregan a los array y al textArea
                nombres[indice] = nombre;
                notas[indice] = nota;
                indice++;
                //escribir en el textArea
                areaNotas.setText(areaNotas.getText() + nombre + "-" + nota + "\n");

            } else {
                JOptionPane.showMessageDialog(panel1, "Por favor ingrese una nota valida.");
            }

        } else {
            //si está vacío mostrar mensaje
            JOptionPane.showMessageDialog(panel1, "El nombre no puede estar vacío");
        }
    }

    /**
     * Metodo para guardar notas, va desde 0 al índice que haya quedado al cargar
     */
    private void guardarNotas() {
        PrintWriter pw=null;

        try{
            pw=new PrintWriter("notas.txt");
            for (int i = 0; i < indice; i++) {
                pw.println(nombres[i]+"-"+notas[i]);
            }
            JOptionPane.showMessageDialog(panel1,"Notas guardadas correctamente");
        } catch (FileNotFoundException exx) {
            //Mensaje no existe el archivo
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

    /**
     * Metodo para buscar si un estudiante ya existe
     * @return
     */
    private int buscarEstudiante() {
        int posicion = -1;
        int contador = 0;
        boolean encontrado = false;
        while (!encontrado && contador < indice) {
            if (nombres[contador].equalsIgnoreCase(tfNombre.getText())) {
                encontrado = true;
                posicion = contador;
            } else
                contador++;
        }
        return posicion;
    }

    /**
     * Metodo para cargar notas, crear un objeto File, usa los dos arrays del constructor,
     *  lee las notas, y separa por el guion, mientras va leyendo el bucle, separa la cadena y la imprime en el textArea
     *
     *  Antes de cargar, se debe poner el textArea a vacío
     */
    private void cargarNotas() {
        File fichero = new File("notas.txt");

        //poner cada vez que se pulsa el botón de cargar el índice a cero
        indice = 0;

        if (fichero.exists()) {
            //Si existe que lo lea
            FileReader fr = null;
            BufferedReader br = null;

            try {
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                //Limpiar textArea
                areaNotas.setText("");

                String linea = br.readLine();

                //Leer y dividir por el guion las líneas
                while (linea != null) {
                    String[] datos = linea.split("-"); //esto parte el string por el guion y almacena en un array su contenido
                    nombres[indice] = datos[0]; //esta es la posición del nombre
                    notas[indice] = Double.parseDouble(datos[1]); //esta es la posición de la nota
                    indice++; //se aumenta para leer al siguiente alumno

                    //escribir en el textArea, escribiendo primero lo que ya tenga + Nombre - Nota
                    areaNotas.setText(areaNotas.getText() + datos[0] + "-" + datos[1] + "\n");

                    //Seguir leyendo
                    linea = br.readLine();
                }

            } catch (FileNotFoundException e) {
                //System.out.println("No se encontró el archivo");
            } catch (IOException e) {
                //System.out.println("Error al leer el fichero");
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
        } else {

        }
    }
}
