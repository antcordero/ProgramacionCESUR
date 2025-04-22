import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class Contactos {
    private String nombre;
    private String numTlf;
    private String correo;

    public Contactos(String nombre, String numTlf, String correo) {
        this.nombre = nombre;
        this.numTlf = numTlf;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTlf() {
        return numTlf;
    }

    public void setNumTlf(String numTlf) {
        this.numTlf = numTlf;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono:" + numTlf + " Email:" + correo + "\n";
    }

    //Métodos

    /**
     * Método para agregar contactos
     * @param nombre
     * @param numTlf
     * @param correo
     */
    public void agregarContacto(String nombre, String numTlf, String correo) {

        if (buscarContacto(nombre) == null) {
            PrintWriter pw = null;
            try {
                pw = new PrintWriter(new FileWriter("contactos.txt", true));
                pw.println(nombre + ", " + numTlf + ", " + correo);

                System.out.println("Contacto agregado correctamente");

            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo");
            } finally {
                if (pw != null) {
                    pw.close();
                }
            }

        } else {
            System.out.println("El contacto ya existe");
        }

    }

    public Contactos buscarContacto(String nombre) {
        BufferedReader br = null;

        Contactos contacto = null;

        try {
            br = new BufferedReader(new FileReader("contactos.txt"));
            String linea = br.readLine();
            boolean encontrado = false;

            while (linea!=null && !encontrado) {
                String [] datos = linea.split(",");
                if (datos[0].equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    System.out.println("Contacto encontrado");
                    System.out.println(linea);
                    contacto = new Contactos(datos[0], datos[1], datos[2]);
                } else {
                    linea = br.readLine();
                }
            }

            if (!encontrado) {
                System.out.println("Contacto no encontrado");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo contactos.txt");
            }
        }

        return contacto;
    }

}
