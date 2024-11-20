public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepito",20,"masculino");
        Persona p2 = new Persona("Juanita",23,"femenino");
        p1.mostrarInfo();
        p2.mostrarInfo();
        p1.cumplirAnios();
        p2.cumplirAnios();
        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
