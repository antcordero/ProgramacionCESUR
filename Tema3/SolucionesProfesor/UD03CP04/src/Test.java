public class Test {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4,5);
        Rectangulo r2 = new Rectangulo(3,8);
        System.out.printf("El área del rectángulo 1 es %.2f\n",r1.calcularArea());
        System.out.printf("El perímetro del rectángulo 1 es %.2f\n",r1.calcularPerimetro());
        System.out.printf("El área del rectángulo 2 es %.2f\n",r2.calcularArea());
        System.out.printf("El perímetro del rectángulo 2 es %.2f\n",r2.calcularPerimetro());
    }
}
