public class Test {
    public static void main(String[] args) {
        Punto centroBase = new Punto(3.0f, 5.0f);
        Circulo base = new Circulo(centroBase, 4.0f);
        Cilindro miCilindro = new Cilindro(base, 10.0f);
        System.out.println(miCilindro);
        miCilindro.trasladar(2.0f, 2.0f);
        System.out.println(miCilindro);
        System.out.println(
                new Cilindro(new Circulo(new Punto(3.0f, 5.0f), 4.0f),
                        10.0f));
    }
}
