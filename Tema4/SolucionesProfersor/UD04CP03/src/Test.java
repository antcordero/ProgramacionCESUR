public class Test {
    public static void main(String[] args) {
        ProductoCongelado pc = new ProductoCongelado("01/12/24","163626439",-12.5);
        ProductoFresco pf = new ProductoFresco("20/11/24","727377567","19/11/24","España");
        ProductoRefrigerado pr = new ProductoRefrigerado("25/11/24","27537521737","HHGG3q923");
        System.out.println(pc);
        System.out.println(pf);
        System.out.println(pr);
    }
}
