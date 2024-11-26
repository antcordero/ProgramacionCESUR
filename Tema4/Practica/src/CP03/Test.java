package CP03;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 3 - Tema 4\n");

        //Instancias
        ProductoFresco pf1 = new ProductoFresco("26/11/24", "L1", "25/11/24", "España");
        ProductoRefrigerado pr1 = new ProductoRefrigerado("27/11/24", "L2", "No tiene");
        ProductoCongelado pc1 = new ProductoCongelado("28/11/24", "L3", -20);

        System.out.println(pf1);
        System.out.println(pr1);
        System.out.println(pc1);

    }
}
