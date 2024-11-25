package CP04;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 4 - Tema 3\n");

        //Instancias
        Rectangulo r1 = new Rectangulo(5.00, 10.00);
        Rectangulo r2 = new Rectangulo(5.00, 0.00);

        System.out.println("Rectángulo 1: ");
        System.out.printf("Área = %.2fm^2\n", r1.calcularArea());
        System.out.printf("Perímetro = %.2fm\n", r1.calcularPerimetro());

        System.out.println("\nRectángulo 2: ");
        System.out.printf("Área = %.2fm^2\n", r2.calcularArea());
        System.out.printf("Perímetro = %.2fm\n", r2.calcularPerimetro());
        
    }
}
