import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Libro l1 = new Libro("La colmena","Camilo J. Cela",540);
        Random r = new Random();
        int n=r.nextInt(l1.getNumeroPaginas());
        for (int i = 1; i < n; i++) {
            l1.leerPagina();
        }
        l1.mostrarInfo();
        n=r.nextInt(l1.getNumeroPaginas());
        for (int i = 1; i < n; i++) {
            l1.retrocederPagina();
        }
        l1.mostrarInfo();
    }
}
