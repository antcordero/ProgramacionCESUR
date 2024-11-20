public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        saldo = 0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0)
            this.saldo = 0;
        else
            this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }
    public void retirar(double cantidad) {
        if (cantidad <= saldo && cantidad > 0)
            saldo -= cantidad;
        else
            System.out.println("No se puede retirar esa cantidad");
    }

    public void mostrarSaldo() {
        System.out.printf("Saldo actual: %.2f€\n",saldo);
    }
}
