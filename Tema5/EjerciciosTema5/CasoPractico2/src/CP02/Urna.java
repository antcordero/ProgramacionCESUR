package CP02;

import java.util.Random;

public class Urna {

    protected int blancas;
    protected int negras;

    //Constructor
    public Urna(int blancas, int negras) {
        this.blancas = blancas;
        this.negras = negras;
    }

    public Urna() {
    }

    //Getter & Setters
    public int getBlancas() {
        return blancas;
    }

    public void setBlancas(int blancas) {
        this.blancas = blancas;
    }

    public int getNegras() {
        return negras;
    }

    public void setNegras(int negras) {
        this.negras = negras;
    }

    //toString
    @Override
    public String toString() {
        return "Urna{" +
                "blancas=" + blancas +
                ", negras=" + negras +
                '}';
    }

    //Métodos de la clase

    //Consultar el número total de bolas que tiene
    public int totalBolas() {
        return (this.blancas + this.negras);
    }

    //Extraer una bola aleatoriamente y saber su color
    public Color bola() {
        int suma = this.blancas + this.negras;
        Random r = new Random();
        int aleatorio = r.nextInt(suma) + 1;

        Color color = Color.NEGRAS;

        if (aleatorio <= this.blancas) {
            color = Color.BLANCAS;
        }
        return color ;
    }

    //Introducir una bola de un color determinado
    public void ponerBlanca() {
        this.blancas ++;
    }

    public void ponerNegra() {
        this.negras ++;
    }

}
