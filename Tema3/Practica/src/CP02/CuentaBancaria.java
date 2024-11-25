package CP02;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    //Constructor

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria() {
    }

    //Setters & Getters
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
        this.saldo = 0;
    }

    //Métodos
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (this.saldo<=cantidad) {
            System.out.println("No se puede retirar el saldo");
        } else {
            this.saldo = this.saldo - cantidad;
        }
    }

    public void mostrarSaldo() {
        System.out.printf("Sueldo actual = %.2f€\n", this.saldo);
    }
}
