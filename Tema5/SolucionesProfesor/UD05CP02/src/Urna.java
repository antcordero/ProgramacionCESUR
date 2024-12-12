import java.util.Random;

public class Urna {
    protected int blancas;
    protected int negras;

    public Urna(int blancas, int negras) {
        this.blancas = blancas;
        this.negras = negras;
    }

    public int totalBolas(){
        return blancas + negras;
    }

    public ColorBola bola(){
        Random rand = new Random();
        ColorBola resultado;
        int r = rand.nextInt(totalBolas())+1;
        if (r<=blancas){
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

    public void ponerBlanca(){
        blancas++;
    }

    public void ponerNegra(){
        negras++;
    }
}
