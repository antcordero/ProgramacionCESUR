public class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;

    //Constructor
    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta=numeroCuenta;
        this.saldo=0;
    }

    //GETTER / SETTERS
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
        if (saldo<0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }

    //##############
    //Métodos
    public void depositar(double monto) {
        this.saldo+=monto;
    }

    public void retirar (double cantidad) {
        if (cantidad <= saldo) {
            saldo-=cantidad;
        } else {
            System.out.println("No se puede retirar.\nLa cantidad a retirar es mayor al Saldo");
        }

    }

    public void mostrarSaldo() {
        System.out.printf("Saldo actual: %.2f€\n", this.saldo);
    }
}

