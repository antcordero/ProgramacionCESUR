public class MyOwnAutoShop {
    public static void main(String[] args) {
        Truck t1 = new Truck(140,56000,"Negro",2500);
        Ford f1 = new Ford(150,25000,"Azul",2023,450);
        Ford f2 = new Ford(155,28000,"Amarillo",2022,500);
        Sedan s1 = new Sedan(160,35000,"Blanco",23);
        System.out.printf("Precio de venta del Truck = %.2f€\n",t1.getSalePrice());
        System.out.printf("Precio de venta del Ford = %.2f€\n",f1.getSalePrice());
        System.out.printf("Precio de venta del Ford = %.2f€\n",f2.getSalePrice());
        System.out.printf("Precio de venta del Sedan = %.2f€\n",s1.getSalePrice());
        System.out.println(t1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(s1);
    }
}
