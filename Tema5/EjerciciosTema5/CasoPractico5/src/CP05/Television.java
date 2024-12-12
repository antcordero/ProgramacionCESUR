package CP05;

public class Television extends Electrodomestico{

    private double resolucion; //pulgadas
    private boolean tdt;

    //Constructores
    public Television(double precioBase, double peso, double resolucion, boolean tdt) {
        super(precioBase, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    //Constructor por defecto
    public Television() {
        super();
        this.resolucion = 20;
    }

    //Getters - Setters
    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    //toString
    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", tdt=" + tdt +
                '}' + super.toString();
    }

    //Métodos
    @Override
    public double precioFinal() {
        double resultado;

        //Resolución
        if (this.resolucion > 40) {
            resultado = super.precioFinal() * 1.30;
        } else {
            resultado = super.precioFinal();
        }

        //Sintonizador
        if (this.tdt) {
            resultado = super.precioFinal() + 50;
        } else {
            resultado = super.precioFinal();
        }

        return resultado;
    }



}
