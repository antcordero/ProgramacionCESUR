package CP05;

public class Electrodomestico {
    private double precioBase;
    private Color color;
    private ConsumoEnergetico consumoEnergetico;
    private double peso;

    //Constructor con el precio y peso. El resto por defecto.
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = Color.BLANCO;
        this.consumoEnergetico = ConsumoEnergetico.F;
    }

    //Constructor con todos los atributos
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    //Constructor por defecto
    public Electrodomestico() {
        this.precioBase = 100;
        this.peso = 5;
        this.consumoEnergetico = ConsumoEnergetico.F;
        this.color = Color.BLANCO;
    }

    //Getters - Setters
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //toString
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }

    //Métodos
    //comprueba que la letra es correcta, si no es correcta usará la letra por defecto.
    private void comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' ) {
            this.consumoEnergetico = ConsumoEnergetico.A;
        } else if (letra == 'B') {
            this.consumoEnergetico = ConsumoEnergetico.B;
        } else if (letra == 'C') {
            this.consumoEnergetico = ConsumoEnergetico.C;
        } else if (letra == 'D') {
            this.consumoEnergetico = ConsumoEnergetico.D;
        } else if (letra == 'E') {
            this.consumoEnergetico = ConsumoEnergetico.E;
        } else if (letra == 'F') {
            this.consumoEnergetico = ConsumoEnergetico.F;
        } else {
            this.consumoEnergetico = ConsumoEnergetico.F;
        }
    }

    //comprueba que el color es correcto, si no lo es usa el color por defecto
    private void comprobarColor(String color) {
        if (color.equals("negro")) {
            this.color = Color.NEGRO;
        } else if (color.equals("gris")) {
            this.color = Color.GRIS;
        } else if (color.equals("azul")) {
            this.color = Color.AZUL;
        } else if (color.equals("rojo")) {
            this.color = Color.ROJO;
        } else {
            this.color = Color.NEGRO;
        }
    }

    //Según el consumo energético, aumentará su precio, y según su tamaño, también
    public double precioFinal() {

        double precioFin;

        //consumo energético
        if (this.consumoEnergetico == ConsumoEnergetico.A) {
            precioFin = this.precioBase + 100;
        } else if (this.consumoEnergetico == ConsumoEnergetico.B) {
            precioFin = this.precioBase + 80;
        } else if (this.consumoEnergetico == ConsumoEnergetico.C) {
            precioFin = this.precioBase + 60;
        } else if (this.consumoEnergetico == ConsumoEnergetico.D) {
            precioFin = this.precioBase + 50;
        } else if (this.consumoEnergetico == ConsumoEnergetico.E) {
            precioFin = this.precioBase + 30;
        } else {
            precioFin = this.precioBase + 10;
        }

        //tamaño
        if (this.peso>0 && this.peso<20) {
            precioFin = this.precioBase + 10;
        } else if (this.peso>=20 && this.peso<50) {
            precioFin = this.precioBase + 50;
        } else if (this.peso>=50 && this.peso<80) {
            precioFin = this.precioBase + 80;
        } else {
            precioFin = this.precioBase + 100;
        }

        return precioFin;
    }
}
