package Ejercicio1;

public class CalculadoraCientifica extends Calculadora{

    //Constructor
    public CalculadoraCientifica() {
    }

    //toString
    @Override
    public String toString() {
        return "CalculadoraCientifica{}";
    }


    //Métodos de la clase
    //Método add sobrecargado - suma avanzada
    public int add(int a, int b) {
       int resultado;

       resultado = (int) ( (Math.sqrt(a) + Math.sqrt(b)) );

       return resultado;
    }

    //raizCuadrada
    public double raizCuadrada(double numero) {
        return (Math.sqrt(numero));
    }
}
