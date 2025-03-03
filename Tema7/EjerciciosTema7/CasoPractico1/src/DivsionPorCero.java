public class DivsionPorCero {
    public double division(double a, double b) {
        double resultado = 0;
        try {
            if (b == 0){
                //Excepcion
                throw new ExcepcionDivisionPorCero(b);
            } else {
                resultado = a / b;
            }
        } catch(ExcepcionDivisionPorCero e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally hecho");
        }
        System.out.println("Volviendo de division");
        return resultado;
    }
}
