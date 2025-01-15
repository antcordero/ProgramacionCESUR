package tipoC.ej1;

public class Test {
    public static void main(String[] args) {

        //instancias
        CuentaBancaria c1 = new CuentaBancaria("Juan Perez", 5000.00, "ahorro");
        CuentaBancaria c2 = new CuentaBancaria("Ana López", 3000.00, "corriente");
        CuentaBancaria c3 = new CuentaBancaria("Carlos García", 10000.00, "empresarial");

        //Resultado
        System.out.printf("\n%s - %.2f€ - Intereses: %.2f€\n", c1.getTitular(), c1.getSaldo(), c1.calcularIntereses());
        System.out.printf("%s - %.2f€ - Intereses: %.2f€\n", c2.getTitular(), c2.getSaldo(), c2.calcularIntereses());
        System.out.printf("%s - %.2f€ - Intereses: %.2f€\n", c3.getTitular(), c3.getSaldo(), c3.calcularIntereses());

        //array
        CuentaBancaria[] arrayCuentas = {c1, c2, c3};

        System.out.printf("Total de dinero en el banco: %.2f€\n", Banco.calcularTotalDineroCuentas(arrayCuentas));

    }
}
