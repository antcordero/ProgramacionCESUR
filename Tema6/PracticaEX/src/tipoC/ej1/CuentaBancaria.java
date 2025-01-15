package tipoC.ej1;

public class CuentaBancaria {

    /*
        Entiendo que si no nos dice que pongamos valores por defecto al inicializar los atributos finales,
        los puedo asignar al escribir desde teclado en el main con sus getter y setters
        una vez se hace la instancia del objeto.
     */
    private final String titular;
    private final double saldo;
    private TipoCuenta tipoCuenta;

    //
    public CuentaBancaria(String titular, double saldo, String tipoCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        comprobarTipoCuenta(tipoCuenta);
    }

    //
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        comprobarTipoCuenta(tipoCuenta);
    }

    //toString
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", tipoCuenta=" + tipoCuenta +
                '}';
    }

    //Métodos

    /*
     *  comprobar tipo cuenta
     */
    private void comprobarTipoCuenta(String tipoCuenta) {
        switch (tipoCuenta.toLowerCase()) {
            case "ahorro" -> this.tipoCuenta = TipoCuenta.AHORRO;
            case "corriente" -> this.tipoCuenta = TipoCuenta.CORRIENTE;
            case "empresarial" -> this.tipoCuenta = TipoCuenta.EMPRESARIAL;
        }
    }

    /*
     *  Metodo realizarTransaccion para depósitos y retiros.
     */
    public double realizarTransaccion(String opcion, double cantidad) {
        double resultado = this.saldo;

        switch (opcion.toLowerCase()) {
            case "deposito":
                resultado = this.saldo + cantidad;
            break;
            case "retiro":
                if (cantidad > resultado) {
                    System.out.println("No tiene saldo sufuciente para el restiro.");
                } else {
                 resultado = this.saldo - cantidad;
                }
            break;
        }
        return resultado;
    }

    /*
     *  Metodo final calcularIntereses que calcule los intereses de la cuenta según su tipo.
     *  Ahorro => interés del 2%
     *  Corriente => interés del 1%
     *  Empresarial => interés del 5%
     */
    public double calcularIntereses(){
        double resultado = 0;

        switch (this.tipoCuenta) {
            case AHORRO -> resultado = this.saldo*0.02;
            case CORRIENTE -> resultado = this.saldo*0.01;
            case EMPRESARIAL -> resultado = this.saldo*0.05;
        }

        return resultado;
    }
}
