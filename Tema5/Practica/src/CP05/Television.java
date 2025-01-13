package CP05;

public class Television extends Electrodomestico{
    private double pulgadas;
    private boolean tdt;

    //Constructores
    //Constructor por defecto
    public Television(double pulgadas, boolean tdt) {
        super();
        this.pulgadas = 20;
        this.tdt = false;
    }

    //Constructor con precio y peso, el resto por defecto
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.pulgadas = 20;
        this.tdt = false;
    }

    //Constructor completo
    public Television(double precioBase, String color, char letra, double peso, double pulgadas, boolean tdt) {
        super(precioBase, color, letra, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    //Getters - Setters
    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
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
        return  super.toString() +
                "Television{" +
                "pulgadas=" + pulgadas +
                ", tdt=" + tdt +
                '}';
    }

    //Métodos

    /*
     *  Metodo precioFinal de electrodoméstico SOBREESCRITO
     */
    @Override
    public double precioFinal() {
        //este "super.precioFinal()" llama al metodo de la clase padre
        // para coger el precio final anterior ya calculado:
        double resultado = super.precioFinal();

        if (this.pulgadas > 40) {
            resultado = resultado*1.30;
        }

        if (this.tdt) {
            resultado = resultado + 50;
        }

        return resultado;
    }

}
