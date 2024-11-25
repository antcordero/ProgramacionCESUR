package CP02;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona titular;

    //Constructor
    public Cuenta(String numeroCuenta, double saldo, Persona titular) {
        this.numeroCuenta = numeroCuenta;
        //Comprobación saldo
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
        //
        this.titular = titular;
    }

    //Constructor sin parámetros
    public Cuenta() {
    }

    //Getters & Setters

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
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    //toString
    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titular.getNombre() +
                '}';
    }

    //Métodos
    public void transaccion(double cantidad, int tipoTransaccion) {
        switch (tipoTransaccion) {
            //Reintegro
            case 2:
                if (cantidad > this.saldo) {
                    System.out.println("Saldo Insuficiente");
                } else {
                    this.saldo -= cantidad;
                }
            break;
            //Ingreso
            case 3:
                this.saldo += cantidad;
            break;
            default:
                System.out.println("Tipo de transacción incorrecto");
        }
    }

    public void mostrarInfo() {
        System.out.println(this);
    }
}
