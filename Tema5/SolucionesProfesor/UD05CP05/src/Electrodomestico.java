import java.awt.Color;

public class Electrodomestico {
    private double precioBase;
    private Colores color;
    private Consumo consumo;
    private double peso;

    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase,"blanco",'F',peso);
    }

    public Electrodomestico() {
        this(100,"blanco",'F',5);
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra){
        switch(letra){
            case 'a','A' -> consumo=Consumo.A;
            case 'b','B' -> consumo=Consumo.B;
            case 'c','C' -> consumo=Consumo.C;
            case 'd','D' -> consumo=Consumo.D;
            case 'e','E' -> consumo=Consumo.E;
            default -> consumo=Consumo.F;
        }
    }

    private void comprobarColor(String color){
        switch(color.toLowerCase()){
            case "negro" -> this.color = Colores.NEGRO;
            case "gris" -> this.color = Colores.GRIS;
            case "azul" -> this.color = Colores.AZUL;
            case "rojo" -> this.color = Colores.ROJO;
            default -> this.color = Colores.BLANCO;
        }
    }

    public double precioFinal(){
        double precio = precioBase;
        switch(this.consumo){
            case A -> precio = precio+100;
            case B -> precio = precio+80;
            case C -> precio = precio+60;
            case D -> precio = precio+50;
            case E -> precio = precio+30;
            case F -> precio = precio+10;
        }

        if (this.peso>=0 && this.peso<20)
            precio+=10;
        else if (this.peso>=20 && this.peso<50)
            precio+=50;
        else if (this.peso>=50 && this.peso<80)
            precio+=80;
        else
            precio+=100;

        return precio;
    }
}
