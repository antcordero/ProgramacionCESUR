package Ejercicio1;

public class Test {
    public static void main(String[] args) {
        // Instancia de la clase base Calculadora
        Calculadora calc = new Calculadora();
        System.out.println("Suma de enteros (Calculadora): " +
                calc.add(2, 3));
        System.out.println("Suma de doubles (Calculadora): " +
                calc.add(2.5, 3.7));
        System.out.println("Suma de tres enteros (Calculadora): " +
                calc.add(1, 2, 3));
        // Instancia de la clase derivada CalculadoraCientifica
        CalculadoraCientifica calcCientifica = new
                CalculadoraCientifica();
        System.out.println("Suma avanzada (CalculadoraCientifica): " +
                calcCientifica.add(2, 3));
        System.out.println("Raíz cuadrada (CalculadoraCientifica): " +
                calcCientifica.raizCuadrada(16));
    }
}
