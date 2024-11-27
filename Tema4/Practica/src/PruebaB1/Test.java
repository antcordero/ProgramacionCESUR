package PruebaB1;

public class Test {
    public static void main(String[] args) {
        //Instancia de Calculadora Científica:
        Calculadora calc = new Calculadora();

        System.out.println("Suma de enteros (Calculadora): "+calc.add(2,3));

        System.out.println("Suma de doubles (Calculadora): "+calc.add(2.5,3.7));

        System.out.println("Suma de tres enteros (Calculadora): "+calc.add(1,2, 3));

        //Instancia de Calculadora Científica:

        CalculadoraCientifica calcCientifica = new CalculadoraCientifica();

        System.out.println("Suma avanzada (CalculadoraCientifica): "+calcCientifica.add(2,3));

        System.out.println("Raiz cuadrada (CalculadoraCientifica): "+calcCientifica.raizCuadrada(16));

    }
}
