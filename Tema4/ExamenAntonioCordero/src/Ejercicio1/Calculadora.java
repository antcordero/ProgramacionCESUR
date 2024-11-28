package Ejercicio1;

public class Calculadora {

    //Constructor
    public Calculadora() {
    }

    //toString
    @Override
    public String toString() {
        return "Calculadora{}";
    }

    //Métodos de la clase
    //Suma enteros
    public int add(int a, int b) {
        return (a+b);
    }

    //suma de double
    public double add(double a, double b) {
        return (a+b);
    }

    //suma de tres enteros - Método add sobrecargado
    public int add(int a, int b, int c) {
        return (a+b+c);
    }

}
