package CP01;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 1\n");

        //Nuevas instancias del objeto SerVivo
        SerVivo x = new SerVivo((byte) 3);
        SerVivo y = new SerVivo((byte) 5);

        //Imprimir el mayor SerVivo de los creados antes usando metodo mayor
        System.out.println(x.mayor(y));

        //Crear dos objetos de la clase Humano pero asignándolos a las variables declaradas antes
        x = new Humano((byte) 34, "Homero");
        y = new Humano((byte) 9, "Bart");

        //Casting para usar el metodo que está en la Clase Humano, no la de SerVivo
        System.out.println(((Humano)x).mayor((Humano)y));

        if (((Humano)x).mayor((Humano)y).equals(x)) {
            System.out.println("El menor es: " + y);
        } else {
            System.out.println("El menor es: " + x);
        }

    }
}
