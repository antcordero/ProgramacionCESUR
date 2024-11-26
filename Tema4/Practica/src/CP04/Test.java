package CP04;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 4 - Tema 4\n");


        //Instancias
        //Sedan x1
        Sedan s1 = new Sedan(190, 10000.00, "blanco", 25);
        //Ford x2
        Ford f1 = new Ford(180, 20000.00, "negro", 1998, 5000);
        Ford f2 = new Ford(200, 30000.00, "azul", 2020, 10000);
        //Truck x1
        Truck t1 = new Truck(170, 50000.00, "rojo", 2500);

        //Precios de venta
        System.out.println("Precios de venta finales: ");
        System.out.println("Sedan: " + s1.getSalePrice());
        System.out.println("Ford 1: " + f1.getSalePrice());
        System.out.println("Ford 2: " + f2.getSalePrice());
        System.out.println("Truck: " + t1.getSalePrice());
    }
}
