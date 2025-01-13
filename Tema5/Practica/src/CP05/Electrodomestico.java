package CP05;

public class Electrodomestico {
    private double precioBase;
    private Color color;
    private ConsumoEnergetico consumo;
    private double peso;

    //Constructores

    //Constructor por defecto
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = Color.BLANCO;
        this.consumo = ConsumoEnergetico.F;
        this.peso = 5;
    }

    //Constructor con el precio y peso. El resto por defecto
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = Color.BLANCO;
        this.consumo = ConsumoEnergetico.F;
        this.peso = peso;
    }

    //Constructor con todos los atributos
    public Electrodomestico(double precioBase, String color, char letra, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(letra);
        this.peso = peso;
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

    public void setColor(String color) {
        comprobarColor(color);
    }

    public ConsumoEnergetico getConsumo() {
        return consumo;
    }

    public void setConsumo(char letra) {
        comprobarConsumoEnergetico(letra);
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
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }

    //Métodos

    /*
     *
     */
    private void comprobarColor(String color) {
        switch (color) {
            case "NEGRO" -> this.color = Color.NEGRO;
            case "AZUL" -> this.color = Color.AZUL;
            case "ROJO" -> this.color = Color.ROJO;
            case "GRIS" -> this.color = Color.GRIS;
            default -> this.color = Color.BLANCO;
        }
    }

    /*
     *
     */
    private void comprobarConsumoEnergetico(char letra) {
        switch (letra) {
            case 'A' -> this.consumo = ConsumoEnergetico.A;
            case 'B' -> this.consumo = ConsumoEnergetico.B;
            case 'C' -> this.consumo = ConsumoEnergetico.C;
            case 'D' -> this.consumo = ConsumoEnergetico.D;
            case 'E' -> this.consumo = ConsumoEnergetico.E;
            default -> this.consumo = ConsumoEnergetico.F;
        }
    }

    /*
     *  según el consumo energético, aumentará su precio,
     *  y según su tamaño, también.
     */
    public double precioFinal() {
        double resultado = this.precioBase;

        //por letra del consumo energético
        switch (this.consumo) {
            case A -> resultado += 100;
            case B -> resultado += 80;
            case C -> resultado += 60;
            case D -> resultado += 50;
            case E -> resultado += 30;
            case F -> resultado += 10;
        }

        //por peso
        if (this.peso>0 && this.peso<=19) {
            resultado += 10;
        } else if (this.peso>19 && this.peso<=49) {
            resultado += 50;
        } else if (this.peso>49 && this.peso<=79) {
            resultado += 80;
        } else if (this.peso>79) {
            resultado += 100;
        }

        //  Esto es lo mismo que el switch, pero más extenso
        //  el consumo al ser tipo enumerado espera valores char como resultado,
        //  al igual que lo esperaría una variable normal tipo char.
        /*
        if (this.consumo == ConsumoEnergetico.A) {
            resultado += 100;
        } else if (this.consumo == ConsumoEnergetico.B) {
            resultado += 80;
        } else if (this.consumo == ConsumoEnergetico.C) {
            resultado += 60;
        } else if (this.consumo == ConsumoEnergetico.D) {
            resultado += 50;
        } else if (this.consumo == ConsumoEnergetico.E) {
            resultado += 30;
        } else {
            resultado += 10;
        }
        */
        return resultado;
    }
}
