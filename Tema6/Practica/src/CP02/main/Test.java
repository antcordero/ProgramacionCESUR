package CP02.main;

import CP02.garaje.Garaje;
import CP02.vehiculos.Coche;
import CP02.vehiculos.Moto;

public class Test {

    public static void main(String[] args) {
        Garaje miGaraje = new Garaje(50,3);
        Coche c1 = new Coche(4,"Ford",45362,"Blanco",4,true);
        Coche c2 = new Coche(4,"Renault",5636,"Amarillo",5,false);
        Moto m1 = new Moto(2,"BMW",2345,"Azul",250);
        Moto m2 = new Moto(2,"Honda",7363,"Gris",500);

        miGaraje.introducirVehiculo(c1);
        miGaraje.introducirVehiculo(c2);
        miGaraje.introducirVehiculo(m1);
        miGaraje.introducirVehiculo(m2);
        System.out.println(miGaraje);

        miGaraje.retirarVehiculo("2345GHF");
        System.out.println(miGaraje);

        miGaraje.introducirVehiculo(m2);
        System.out.println(miGaraje);

        System.out.printf("Precio de cambiar las ruedas: %.2f€%n",miGaraje.precioTotalRuedas());
        System.out.printf("Kilometraje medio: %d kilómetros",miGaraje.mediaKM());
    }

}
