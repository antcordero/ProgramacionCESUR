package CP04;

public class MyOwnAutoShop {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 4\n");

        //Instancias
        //Sedan
        Sedan sedan1 = new Sedan(250, 30000, "blanco", 5);
        //Ford
        Ford ford1 = new Ford(190, 20000, "rojo", 2024,15);
        Ford ford2 = new Ford(195, 22000, "negro", 2023, 20);
        //Truck
        Truck truck1 = new Truck(160, 45000, "azul", 2500);

        //Mostrar precios de venta
        System.out.printf("Precio de Sedan = %.2f$\n", sedan1.getSalePrice());
        System.out.printf("Precio de Ford1 = %.2f$\n", ford1.getSalePrice());
        System.out.printf("Precio de Ford2 = %.2f$\n", ford2.getSalePrice());
        System.out.printf("Precio de Truck = %.2f$\n", truck1.getSalePrice());

    }
}
