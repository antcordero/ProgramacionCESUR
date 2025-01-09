package clases;

import java.util.Arrays;

public final class Math2<miArray> {

    //Métodos estáticos

    /*funciones que devuelvan,
    el máximo,
    el mínimo,
    el sumatorio,
    la media aritmética
    la media geométrica de un array de números reales dado como parámetro.
     */

    public static double max(double[] numeros) {
        double max = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }

    public static double min(double[] numeros) {
        double  min = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        return  min;
    }

    public static double sum(double[] numeros) {

    }

    public static double mediaAritmetica(double[] numeros) {

    }

    public static double mediaGeometrica(double[] numeros) {
        double resultado = 1;
        for (int i = 0; i < numeros.length; i++) {
            resultado *= numeros[1];
        }
        return Math.pow(resultado,(1/ numeros.length)*1.0);
    }

}
