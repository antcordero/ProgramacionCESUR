package CP01;

public class EjemploEstatico {
    public static void main(String[] args) {

        System.out.println("\nTema 6 - Caso Práctico 1\n");

        Persona persona1 = new Persona("Juan");
        System.out.println(persona1);

        Persona persona2 = new Persona("Karla");
        System.out.println(persona2);

        Persona persona3 = new Persona("Carlos");
        System.out.println(persona3);

        System.out.println("contadorPersonas: " + Persona.getContadorPersonas());
    }
}
