public class Test {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("2753ES1282312332131");
        c1.mostrarSaldo();
        c1.retirar(1000 );
        c1.mostrarSaldo();
        c1.depositar(5325);
        c1.mostrarSaldo();
        c1.retirar(4500);
        c1.mostrarSaldo();
    }
}
