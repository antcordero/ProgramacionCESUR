package ejercicio8;

public class EjRecta {
    public static void main(String[] args) {
        // Definir los puntos del triángulo
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(2, 3);

        // Calcular la base del triángulo
        double base = p1.distancia(p2);

        // Crear la recta que pasa por p1 y p2
        Recta r1 = new Recta(p1, p2);

        // Calcular la altura del triángulo (distancia de p3 a la recta)
        double altura = r1.distancia(p3);

        // Calcular el área del triángulo
        double area = base * altura / 2;

        // Imprimir los resultados
        System.out.println("Puntos: " + p1 + ", " + p2 + ", " + p3);
        System.out.println("Área = " + area);
    }
}

