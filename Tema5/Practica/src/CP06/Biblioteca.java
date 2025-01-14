package CP06;

import java.util.Arrays;

public class Biblioteca {
    private int capMaxima;
    private Ejemplar[] almacen;

    /*
     *  En el Constructor se va a inicializar
     *  la Biblioteca con la capacidad máxima del array de ejemplares
     */
    public Biblioteca(int capMaxima) {
        almacen = new Ejemplar[capMaxima];
    }

    public Ejemplar[] getEjemplar() {
        return almacen;
    }

    public void setEjemplar(Ejemplar[] ejemplar) {
        this.almacen = ejemplar;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                ", almacen=" + Arrays.toString(almacen) +
                '}';
    }

    //Métodos

    /*
     *
     */
    public void agregarEjemplar(Ejemplar ej) {
        //verificar si hay espacio y agregar
        int i = 0;
        boolean encontrado = false;
        while (i<almacen.length && encontrado==false) {
            if (almacen[i]==null) {
                almacen[i] = ej;
                encontrado = true;
            }
            i++;
        }
        // Si no se encontró espacio
        if (encontrado==false) {
            System.out.println("No hay espacio libre.");
        }

    }

    /*
     *
     */
    public void eliminarEjemplar(String titulo) {
        boolean econtrado = false;
        int i = 0;
        while (i<almacen.length && !econtrado) {
            if (almacen[i]!=null && almacen[i].getTitulo().equals(titulo)) {
                almacen[i] = null;
                econtrado = true;
            }
            i++;
        }
        if (econtrado==true) {
            System.out.println("No se ha encontrado el título que buscabas.");
        } else {
            System.out.println("El ejemplar " + titulo + " se ha eliminado");
        }
    }

    /*
     *
     */
    public void mostrarEjemplares() {
        for (int i = 0; i < almacen.length; i++) {
            if (almacen[i] instanceof Libros) {
                almacen[i].mostrarInfo();
            } else if (almacen[i] instanceof Revista) {
                almacen[i].mostrarInfo();
            } else if (almacen[i]==null) {
                System.out.println("***Espacio libre.***");
            } else {
                System.out.print("Ejemplar solo -> ");
                almacen[i].mostrarInfo();
            }
        }
    }
}
