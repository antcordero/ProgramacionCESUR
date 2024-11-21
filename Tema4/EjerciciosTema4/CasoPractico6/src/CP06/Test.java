package CP06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 6\n===============\n");
        /*
        //Instancias
        Punto p1 = new Punto(2f,2f);
        Circulo c1 = new Circulo(p1.getX(), p1.getY(), 5f);
        Cilindro cl1 = new Cilindro(p1.getX(), p1.getY(), c1.getRadio(), 6f);

        //Mostrar resultados iniciales
        System.out.println("Punto: " + p1);
        System.out.println("Círculo: " + c1);
        System.out.println("Cilindro: " + cl1);

        //Transladar
        System.out.println("\nTransladar: ");
        */
        Punto centroBase = new Punto(3.0f, 5.0f);
        Circulo base = new Circulo(centroBase, 4.0f);
        Cilindro miCilindro = new Cilindro(base, 10.0f);
        System.out.println(miCilindro);
        miCilindro.transladar(2.0f, 2.0f);
        System.out.println(miCilindro);
        System.out.println(new Cilindro(new Circulo(new Punto(3.0f, 5.0f), 4.0f), 10.0f));

    }
}
