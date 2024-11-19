package CP03;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 3\n");

        //Instancias de los objetos
        //Producto
        Producto p1 = new Producto();

        //Producto Fresco
        ProductoFresco pF1 = new ProductoFresco("19/12/2027", "#456", "17/11/2024", "España");

        //Producto Refrigerado
        ProductoRefrigerado pR1 = new ProductoRefrigerado("19/12/2028", "#789", "Mercadona");

        //Producto Congelado
        ProductoCongelado pC1 = new ProductoCongelado("19/12/2029", "#321", -20);

        //Imprimir resultados
        System.out.println("Producto Fresco: ");
        System.out.println(pF1);

        System.out.println("Producto Refrigerado: ");
        System.out.println(pR1);

        System.out.println("Producto Congelado: ");
        System.out.println(pC1);
    }
}
