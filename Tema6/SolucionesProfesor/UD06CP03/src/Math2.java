public final class Math2 {
    public static double max(double[] numeros) {
        double max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max)
                max = numeros[i];
        }
        return max;
    }

    public static double min(double[] numeros) {
        double min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min)
                min = numeros[i];
        }
        return min;
    }

    public static double sum(double[] numeros) {
        double sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }
        return sum;
    }

    public static double mediaAritmetica(double[] numeros) {
        return sum(numeros) / numeros.length;
    }

    public static double mediaGeometrica(double[] numeros) {
        double resultado = 1;
        for (int i = 0; i < numeros.length; i++) {
            resultado *= numeros[i];
        }
        return Math.pow(resultado,1.0/numeros.length);
    }
}
