package CP06;

import java.util.Arrays;

public class Biblioteca {

    private int capacidad;
    private Ejemplar[] almacen;
    private Ejemplar ejemplar; //Association

    //Constructor
    public Biblioteca(int capacidad, Ejemplar[] almacen, Ejemplar ejemplar) {
        this.capacidad = capacidad;
        this.almacen = almacen;
        this.ejemplar = ejemplar;
    }

    public Biblioteca() {
    }

    //Getter - Setters
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Ejemplar[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Ejemplar[] almacen) {
        this.almacen = almacen;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    //toString
    @Override
    public String toString() {
        return "Biblioteca{" +
                "capacidad=" + capacidad +
                ", almacen=" + Arrays.toString(almacen) +
                ", ejemplar=" + ejemplar +
                '}';
    }

    //Métodos
    //Agregar ejemplar si hay hueco vacío
    public void agregarEjemplar(Ejemplar ejemplar) {
        if (capacidad > 0) {
            for (int i = 0; i < almacen.length ; i++) {
                if (almacen[i] != null) {
                    almacen[i] = ejemplar;
                    capacidad--;
                    //salir del bucle for
                    i = almacen.length + 1;
                }
            }
        } else {
            System.out.println("No se pueden añadir más ejemplares, el almacén de la biblioteca está lleno.");
        }
    }

    //Eliminar ejemplar si se encuentra
    public void eliminarEjemplar(String titulo) {

        //buscar el título dentro del array almacén
        for (int i = 0; i < almacen.length ; i++) {
            if (almacen[i].getTiutlo().equals(titulo)) {
                almacen[i] = null;
                //salir del bucle for
                i = almacen.length + 1;
            } else {
                System.out.println("No se encontró el título.");
            }
        }
    }

    //mostrar toda la info de los Ejemplares
    public void mostrarEjemplar() {
        for (int i = 0; i < almacen.length ; i++) {
            System.out.println(almacen[i]);
        }
    }

}
