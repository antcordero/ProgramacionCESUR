package CP05;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 5 - Tema 5\n");

        double suma = 0;
        double sumaLavadoras = 0;
        double sumaTvs = 0;
        double sumaElectrodomesticos = 0;


        Electrodomestico[] eArray = new Electrodomestico[5];

        //1 electrodoméstico
        Electrodomestico e1 = new Electrodomestico(150, "NEGRO", 'C', 55.60);
        eArray[0] = e1;
        //2 Lavadoras
        Lavadora lvd1 = new Lavadora(200, "GRIS", 'D', 35.00, 8);
        Lavadora lvd2 = new Lavadora(150, 40.00);
        eArray[1] = lvd1;
        eArray[2] = lvd2;
        //2 Televisores
        Television tv1 = new Television(600, "ROJO", 'A', 12.00, 65, true);
        Television tv2 = new Television(300, 10.00);
        eArray[3] = tv1;
        eArray[4] = tv2;

        //Recorre este array y ejecuta el metodo precioFinal().
        for (int i = 0; i < eArray.length; i++) {
            suma = suma + eArray[i].precioFinal();
        }

        System.out.printf("Precio total de todos los electrodomésticos = %.2f€\n", suma);

        System.out.println("Precio de cada Clase\n---------------------");

        for (int i = 0; i < eArray.length; i++) {
            if(eArray[i] instanceof Lavadora){
                sumaLavadoras += ((Lavadora)eArray[i]).precioFinal();
            } else if (eArray[i] instanceof Television){
                sumaTvs += ((Television)eArray[i]).precioFinal();
            } else {
                sumaElectrodomesticos += eArray[i].precioFinal();
            }
        }

        System.out.printf("Precio total de las Lavadoras = %.2f€\n", sumaLavadoras);
        System.out.printf("Precio total de Tvs = %.2f€\n", sumaTvs);
        System.out.printf("Precio total de los Electrodomésticos = %.2f€\n", sumaElectrodomesticos);

    }
}
