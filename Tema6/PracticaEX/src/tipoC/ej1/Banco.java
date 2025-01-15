package tipoC.ej1;

import java.util.Arrays;

public class Banco {


    //Métodos

    /*
     *  calcular el total de dinero en todas las cuentas utilizando
     *  un array de CuentaBancaria como parámetro.
     */

    public static double calcularTotalDineroCuentas(CuentaBancaria[] cuentas) {
        double total = 0;

        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i]!=null) {
                total = total + cuentas[i].getSaldo();
            }
        }

        return total;
    }
}
