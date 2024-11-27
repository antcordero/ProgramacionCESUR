package PruebaB1;

public class CalculadoraCientifica extends Calculadora{

    //Sobrescribo para devolver la potencia
    @Override
    public int add(int a, int b) {

        return (int) Math.pow((a+b),2);
    }

    //Metodo para calcular la raiz cuadrada
    public double raizCuadrada(double a) {

        return Math.sqrt(a);
    }

}
