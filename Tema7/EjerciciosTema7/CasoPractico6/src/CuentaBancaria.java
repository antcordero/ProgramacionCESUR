public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombreTitular, double saldoInicial) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Titular: " + nombreTitular +
                "\nSaldo actual: " + saldo + "€";
    }

    //Métodos

    /**
     * Retirada de saldo
     */
    public void retirarSaldo(double cantidad){
        this.saldo = this.saldo - cantidad;
    }

    /**
     * Ingreso de saldo
     */
    public void depositarSaldo(double cantidad){
        this.saldo = this.saldo + cantidad;
    }
}
