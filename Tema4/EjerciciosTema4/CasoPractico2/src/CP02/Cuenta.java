package CP02;

public class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Persona propietario;

    //Constructor con parámetros
    public Cuenta(String numeroCuenta, double saldo, Persona propietario) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
        this.propietario = propietario;
    }

    //Constructor sin parámetros
    public Cuenta() {
    }

    //Getters y Setters
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
        if (this.saldo<0) {
            this.saldo=0;
        } else {
            this.saldo=saldo;
        }
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    //Métodos propios de la clase Cuenta
    @Override
    public String toString() {
        return "Cuenta: \n" +
                "NºCuenta: " + numeroCuenta + ", Saldo: " + saldo + ", Propietario: " + propietario;
    }

    public void transaccion(double cantidad, String tipoTransaccion) {
        switch(tipoTransaccion) {
            case "reintegro":
                System.out.printf("Tipo de Transacción: %s\n", tipoTransaccion);
                if (cantidad<=saldo) {
                    System.out.printf("Nuevo Saldo: %.2f€\n", (this.saldo-cantidad));
                } else {
                    System.out.println("No se puede realizar el reintegro.");
                }
            break;

            case "ingreso":
                System.out.printf("Tipo de Transacción: %s\n", tipoTransaccion);
                System.out.printf("Nuevo Saldo: %.2f€\n", (this.saldo+cantidad));
            break;

            default:
                System.out.println("Opción incorrecta.");
        }

    }
}
