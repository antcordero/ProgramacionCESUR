package CP04.Productos;

public class ProductoRopa extends Producto {
    private Talla talla;
    private Material material;

    //Constructor
    public ProductoRopa(String nombre, double precioInicial, String talla, String material) {
        super(nombre, precioInicial);
        comprobartalla(talla);
        comprobarmaterial(material);
    }

    //Getters - Setters
    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    //toString
    @Override
    public String toString() {
        return  super.toString() +
                " - ProductoRopa{" +
                "talla=" + talla +
                ", material=" + material +
                '}';
    }

    //Métodos para comprobar
    private void comprobartalla(String talla) {
        String resultado;
        switch (talla.toLowerCase()) {
            case "xs" -> resultado = String.valueOf(Talla.XS);
            case "s" -> resultado = String.valueOf(Talla.S);
            case "m" -> resultado = String.valueOf(Talla.M);
            case "l" -> resultado = String.valueOf(Talla.L);
            case "xl" -> resultado = String.valueOf(Talla.XL);
        }
    }

    private void comprobarmaterial(String material) {
        String resultado;
        switch (material.toLowerCase()) {
            case "lana" -> resultado = String.valueOf(Material.LANA);
            case "seda" -> resultado = String.valueOf(Material.SEDA);
            case "poliester" -> resultado = String.valueOf(Material.POLIESTER);
            default -> resultado = String.valueOf(Material.ALGODON);

        }
    }

}
