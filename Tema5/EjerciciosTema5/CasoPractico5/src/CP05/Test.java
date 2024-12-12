package CP05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        double sumaTotal = 0;
        double sumaLavadoras = 0;
        double sumaTelevisores = 0;

        System.out.println("\nTema 5 - Caso Práctico 5\n");

        //Array de Electrodomesticos
        Electrodomestico[] miArray = new Electrodomestico[6];

        //Asignar valores al array
        Electrodomestico e1 = new Electrodomestico(100, "azul", 'A', 20);
        Electrodomestico e2 = new Electrodomestico(150, "blanco", 'D', 30);
        Lavadora l1 = new Lavadora(200, "gris", 'B', 60, 20);
        Lavadora l2 = new Lavadora(500, "gris", 'F', 120, 50);
        Television t1 = new Television(1200, "negro", 'A', 20, 65, false);
        Television t2 = new Television(300, "rojo", 'E', 10, 32, true);

        miArray[0] = e1;
        miArray[1] = e2;
        miArray[2] = l1;
        miArray[3] = l2;
        miArray[4] = t1;
        miArray[5] = t2;

        for (int i = 0; i < miArray.length ; i++) {
            miArray[i].precioFinal();

            if (miArray[i] instanceof Lavadora) {
                sumaLavadoras = sumaLavadoras + ((Lavadora) miArray[i]).precioFinal();
            } else if (miArray[i] instanceof Television) {
                sumaTelevisores = sumaTelevisores + (((Television) miArray[i]).precioFinal());
            } else {
                sumaTotal = sumaTotal + miArray[i].precioFinal();
            }
        }

        System.out.printf("\nPrecio de todos los Electrodomésticos = %.2f€\n", sumaTotal);
        System.out.printf("Precio total de Lavadoras = %.2f€\n", sumaLavadoras);
        System.out.printf("Precio total de Televisores = %.2f€\n", sumaTelevisores);

    }
}
