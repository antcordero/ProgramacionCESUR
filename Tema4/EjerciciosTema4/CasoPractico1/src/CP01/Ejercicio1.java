package CP01;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Nuevas instancias del objeto
        SerVivo x = new SerVivo((byte) 3);
        SerVivo y = new SerVivo((byte) 5);

        System.out.println("");

        //Imprimir el mayor SerVivo de los anteriores
        if (x.getEdad()>y.getEdad()) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        //Objetos de la clase Humano
        Humano h1 = new Humano((byte) 34, "Homero");
        Humano h2 = new Humano((byte) 9, "Bart");

        //Imprimir el mayor humano de los anteriores
        System.out.println(h1.toString());

        //Imprimir el menor humano de los anteriores


    }
}
