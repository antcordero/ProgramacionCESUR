package CP01;

public class DivisionPorCero {

    public double division (int num1, int num2) {

        double resultado = 0;

        try {
            if (num2 == 0) {
                throw new ExcepcionDeDivisionPorCero(num2);
            } else {
                resultado = (double) num1 / num2;
                System.out.printf("Resultado: %.2f\n", resultado);
            }
        } catch (ExcepcionDeDivisionPorCero exDivCero) {
            System.out.println(exDivCero.getMessage());
        } finally {
            System.out.println("Finally Hecho");
            System.out.println("Volviendo de division");
        }

        return resultado;
    }

}
