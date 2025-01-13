package CP02;

import java.util.Random;

public class Urna {

    /*
     *  Modificador protected:
     *  Permite que estas variables sean accesibles desde la propia clase,
     *  sus subclases y otras clases del mismo paquete.
     */
    protected int blancas;
    protected int negras;

    //Constructor
    public Urna(int blancas, int negras) {
        this.blancas = blancas;
        this.negras = negras;
    }

    //Metodos
    /*
     *  Devuelve el número total de bolas en la urna sumando las blancas y las negras.
     */
    public int totalBolas() {
        return blancas + negras;
    }

    /*
     *  1. Generador aleatorio:
     *  Se crea un objeto Random para generar números aleatorios.
     *  rand.nextInt(totalBolas()) + 1 genera un número entre 1 y el total de bolas en la urna.
     *
     *  2. Decisión del color: Si el número generado es menor o igual al número de bolas blancas
     *  (r <= blancas), se extrae una bola blanca. Si no, se extrae una bola negra.
     *
     *  3. Actualización: Si se extrae una bola,
     *  se decrementa la cantidad correspondiente (blancas-- o negras--).
     *
     *  4. Devolución: Devuelve el color de la bola extraída como un valor del enumerado ColorBola.
     */
    public ColorBola bola() {
        Random rand = new Random();
        ColorBola resultado;
        int r = rand.nextInt(totalBolas()) + 1;
        if (r <= blancas) {
            System.out.print("Se extrae una bola blanca ");
            resultado = ColorBola.BLANCA;
            blancas--;
        } else {
            System.out.print("Se extrae una bola negra ");
            resultado = ColorBola.NEGRA;
            negras--;
        }
        return resultado;
    }

    /*
     *  Métodos ponerBlanca y ponerNegra
     *  Incrementan las bolas blancas o negras en la urna, respectivamente.
     */
    public void ponerBlanca() {
        blancas++;
    }

    public void ponerNegra() {
        negras++;
    }



}
