public class Ejercicio1 {
    public static void main(String[] args) {

        //Crear (instanciar) persona
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        //Asignar valores
        p1.setNombre("Dani");
        p1.setEdad(25);
        p1.setGenero("Masculino");

        p2.setNombre("Rocío");
        p2.setEdad(25);
        p2.setGenero("Femenino");

        //Imprimir valores
        System.out.println("\nPersona 1:");
        p1.mostrarInfo();
        System.out.println("\nPersona 2:");
        p2.mostrarInfo();

        System.out.print("\nAños el siguiente año");
        p1.cumplirAnios();
        p2.cumplirAnios();
        System.out.println("\nPersona 1:");
        p1.mostrarInfo();
        System.out.println("\nPersona 2:");
        p2.mostrarInfo();

    }
}
