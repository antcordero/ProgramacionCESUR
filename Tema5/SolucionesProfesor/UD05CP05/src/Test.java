public class Test {
    public static void main(String[] args) {
        Electrodomestico[] cacharros = new Electrodomestico[10];
        cacharros[0] = new Electrodomestico();
        cacharros[1] = new Electrodomestico(150,10);
        cacharros[2] = new Electrodomestico(80,"verde",'J',10);
        cacharros[3] = new Lavadora();
        cacharros[4] = new Lavadora(300,30);
        cacharros[5] = new Lavadora(550,"gris",'C',50,35);
        cacharros[6] = new Television();
        cacharros[7] = new Television(300,20);
        cacharros[8] = new Television(200,10);
        cacharros[9] = new Television(800,"negro",'B',25,42,true);

        for (int i = 0; i < cacharros.length ; i++) {
            System.out.printf("Precio: %.2f€%n",cacharros[i].precioFinal());
        }

        double precioElec=0;
        double precioLav=0;
        double precioTele=0;
        for (Electrodomestico e : cacharros) {
            if (e instanceof Lavadora)
                precioLav+=e.precioFinal();
            if (e instanceof Television)
                precioTele+=e.precioFinal();
            precioElec+=e.precioFinal();
        }
        System.out.printf("Total de las lavadoras: %.2f€%n",precioLav);
        System.out.printf("Total de las televisiones: %.2f€%n",precioTele);
        System.out.printf("Total de los electrodomésticos: %.2f€%n",precioElec);
    }
}
