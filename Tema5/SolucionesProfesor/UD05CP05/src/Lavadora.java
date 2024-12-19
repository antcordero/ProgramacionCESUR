public class Lavadora  extends Electrodomestico{
    private double carga;

    public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora() {
        super();
        this.carga=5;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga>30)
            precio += 50;
        return precio;
    }
}
