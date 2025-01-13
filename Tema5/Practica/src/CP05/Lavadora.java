package CP05;

public class Lavadora extends Electrodomestico{
    private double carga;

    //Constructores
    //Un constructor por defecto. La carga por defecto es 5kg.

    public Lavadora() {
        super();
        this.carga = 5;
    }

    //Un constructor con el precio y peso. El resto por defecto.
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    //Un constructor con la carga y el resto de atributos heredados.
    public Lavadora(double precioBase, String color, char letra, double peso, double carga) {
        super(precioBase, color, letra, peso);
        this.carga = carga;
    }

    //Getter - Setter
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    //toString
    @Override
    public String toString() {
        return  super.toString() +
                "Lavadora{" +
                "carga=" + carga +
                '}';
    }

    //Métodos

    /*
     *  Metodo precioFinal de electrodoméstico SOBRECARGADO
     */
    /*
    public double precioFinal(double carga) {
        double resultado = super.precioFinal();

        if (this.carga > 30) {
            resultado += 50;
        }

        return resultado;
    }
    */

    /*
     *  Metodo precioFinal de electrodoméstico SOBREESCRITO
     */
    @Override
    public double precioFinal() {
        //este "super.precioFinal()" llama al metodo de la clase padre
        // para coger el precio final anterior ya calculado:
        double resultado = super.precioFinal();

        if (this.carga > 30) {
            resultado += 50;
        }

        return resultado;
    }
}
