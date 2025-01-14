package CP02.garaje;

import CP02.vehiculos.Coche;
import CP02.vehiculos.Moto;
import CP02.vehiculos.Vehiculos;

import java.util.Arrays;

public class Garaje {
    private double precioCambioRueda;
    private Vehiculos[] vehiculos;

    //
    public Garaje(double precioCambioRueda, int capMaxima) {
        this.precioCambioRueda = precioCambioRueda;
        vehiculos = new Vehiculos[capMaxima];
    }

    //
    public double getPrecioCambioRueda() {
        return precioCambioRueda;
    }

    public void setPrecioCambioRueda(double precioCambioRueda) {
        this.precioCambioRueda = precioCambioRueda;
    }

    public Vehiculos[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculos[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Garaje{" +
                "precioCambioRueda=" + precioCambioRueda +
                ", vehiculos=" + Arrays.toString(vehiculos) +
                '}';
    }

    //Métodos

    /*
     *  Introducir vehículo
     */
    public void introducirVehiculo(Vehiculos vehiculo) {
        int i = 0;
        boolean encontrado = false;
        while (i < vehiculos.length && encontrado==false) {
            if (vehiculos[i]==null) {
                vehiculos[i]=vehiculo;
                encontrado = true;
            }
            i++;
        }
        if (encontrado==true) {
            System.out.println("Vehiculo aparcado en garaje.");
        } else {
            System.out.println("Sin espacio libre.");
        }
    }

    /*
     *  retirar vehículo
     */
    public void retirarVehiculo(String marca) {
        int i = 0;
        boolean encontrado = false;
        while (i < vehiculos.length && encontrado==false) {
            if (vehiculos[i]!=null && vehiculos[i].getMarca().equals(marca)) {
                vehiculos[i]=null;
                encontrado = true;
            }
            i++;
        }
        if (encontrado==true) {
            System.out.println("Vehiculo fuera.");
        } else {
            System.out.println("Vehiculo no encontrado.");
        }
    }

    /*
     *  conocer el número total de vehículos que hay en ese momento
     */
    public int totalVehiculos() {
        int total = 0;
        for (int j = 0; j < vehiculos.length; j++) {
            if (vehiculos[j]!=null) {
                total++;
            }
        }
        return total;
    }

    /*
     *  el precio que supondría cambiar todas las ruedas de todos los vehículos
     */
    public double precioTotalRuedas() {
        double resultado = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i]!=null) {
                resultado = resultado  + (this.precioCambioRueda * Vehiculos.getNumRuedas());
            }
        }
        return resultado;
    }

    /*
     *  kilometraje medio de todos
     */
    public int mediaKM() {
        int resultado = 0;
        int totalVehiculos = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i]!=null) {
                resultado = resultado + Vehiculos.getKilometraje();
                totalVehiculos++;
            }
        }
        return (resultado/totalVehiculos);
    }

}
