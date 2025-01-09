package practica02ud06.garaje;

import practica02ud06.vehiculos.Vehiculos;

public class Garaje {
    private double precio;
    private int capacidadMax;

    //Constructor
    public Garaje(double precio, int capacidadMax) {
        this.precio = precio;
        this.capacidadMax = capacidadMax;
    }

    //Getter - Setter
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    //toString
    @Override
    public String toString() {
        return "Garaje{" +
                "precio=" + precio +
                ", capacidadMax=" + capacidadMax +
                "}";
    }

    //Métodos propios

    /*
     *  Aviso al no haber hueco en el garaje
     */
    public void esLleno() {
        int capacidad[] = new int[this.capacidadMax];
        boolean encontrado = false;
        int indice = 0;

        while(!encontrado && indice < capacidad.length){
            if (capacidad[indice] != null && capacidad[indice]){
                capacidad[indice] = null;
                encontrado = true;
                System.out.println("No hay más espacios en el garaje.");
            }
            indice++;
        }
    }

    /*
     *  Añadir vehículo
     */
    public void anadirVehiculo(Vehiculos v) {
        int capacidad[] = new int[this.capacidadMax];
        int indice = 0;
        boolean encontrado = false;

        while(!encontrado && indice < capacidad.length){
            if ( ) {

            }
            indice++;
        }
    }

    /*
     *  Retirar vehículo
     */
    public void eliminarVehiculo(Vehiculos v) {

    }

    /*
     *  Conocer el número total de vehículos
     */
    public int totalVehiculos() {
        int total = 0;
        int capacidad[] = new int[this.capacidadMax];

        for (int i = 0; i < capacidad.length; i++) {
            if (capacidad[i] != null) {
                total++;
            }
        }

        return total;
    }

    /*
     *  Precio del cambio de ruedas de todos los vehículos
     */
    public double precioTotal(Vehiculos v) {
        int capacidad[] = new int[this.capacidadMax];
        double resultado = 0;

        for (int i = 0; i < capacidad.length; i++) {
            if (capacidad[i] != null) {
                resultado = resultado + v.getNumRuedas()*getPrecio();
            }
        }

        return resultado;
    }

    /*
     *  Kilometraje medio de todos los vehículos
     */
    public double kmTotal(Vehiculos v) {
        int capacidad[] = new int[this.capacidadMax];
        double resultado = 0;

        for (int i = 0; i < capacidad.length; i++) {
            if (capacidad[i] != null) {
                resultado = resultado + v.getKilometraje();
            }
        }

        resultado = resultado / totalVehiculos();

        return resultado;
    }

}
