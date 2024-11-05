import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        double ancho;
        double altura;

        Scanner sc = new Scanner(System.in);

        Rectangulo r1 = new Rectangulo(10, 20);
        Rectangulo r2 = new Rectangulo(6, 8);
        Rectangulo r3 = new Rectangulo();

        System.out.print("\n");
        r1.calcularArea();
        System.out.printf("\nPerímetro r1 = %.2fm\n", r1.calcularPerimetro());
        r2.calcularArea();
        System.out.printf("\nPerímetro r2 = %.2fm\n", r2.calcularPerimetro());

        //Pedir datos para otro Rectángulo
        System.out.print("\nTercer triángulo: ");
        System.out.print("\nAltura: ");
        altura=sc.nextInt();
        r3.setAlto(altura);
        System.out.print("Ancho: ");
        ancho=sc.nextInt();
        r3.setAncho(ancho);

        System.out.println("\nInfo del tercer rectángulo");
        r3.calcularArea();
        System.out.printf("\nPerímetro r3 = %.2fm\n", r3.calcularPerimetro());

        sc.close();
    }
}
