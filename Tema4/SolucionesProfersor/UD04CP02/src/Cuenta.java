public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona propietario;

    public Cuenta(String numeroCuenta, double saldo, Persona propietario) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
        this.propietario = propietario;
    }

    public Cuenta() {
    }

    public String getNumeroCuenta() { return numeroCuenta; }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (this.saldo<0)
            this.saldo = 0;
        else
            this.saldo = saldo;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario +
                '}';
    }

    public void transaccion(double cantidad, String tipo){
        switch(tipo){
            case "reintegro" -> {
                if (cantidad<=saldo)
                    saldo-=cantidad;
                else
                    System.out.println("No se puede realizar el reintegro");
            }
            case "ingreso" ->{
                saldo+=cantidad;
            }
            default -> System.out.println("No se puede realizar la transacción");
        }
        System.out.printf("Transacción: %s - Saldo: %.2f€\n",tipo,saldo);
    }
}
