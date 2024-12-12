package CP05;

public class Lavadora extends Electrodomestico{
    private double carga;

    //Constructores
    public Lavadora(double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = carga;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    //Constructor por defecto
    public Lavadora() {
        super();
        this.carga = 5;
    }

    //Getters - Setters
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    //toString
    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                '}' + super.toString();
    }

    //Métodos
    @Override
    public double precioFinal() {
        double resultado;
        if (this.carga > 30) {
            resultado = super.precioFinal() + 50;
        } else {
            resultado = super.precioFinal();
        }
        return resultado;
    }
}
