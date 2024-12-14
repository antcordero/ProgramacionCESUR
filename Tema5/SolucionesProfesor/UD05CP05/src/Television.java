public class Television extends Electrodomestico{
    private double resolucion;
    private boolean tdt;

    public Television(double precioBase, String color, char consumo, double peso, double resolucion, boolean tdt) {
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.tdt = false;
    }

    public Television() {
        this.resolucion = 20;
        this.tdt = false;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion>40)
            precio *=1.30;
        if (tdt)
            precio += 50;
        return precio;
    }
}
