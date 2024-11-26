package CP05;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 5 - Tema 4\n");

        //Instancias
        PuestoTrabajo pT1 = new PuestoTrabajo("#A1", "aassaassaa", 1500.00);
        PuestoTrabajo pT2 = new PuestoTrabajo("#A2", "eesseessee", 1800.00);

        System.out.println("Administrativo");
        Administrador a1 = new Administrador("11112187K", "Peti", "Peneto", "Ciudad Jardin", "29011", "Málaga", pT2, 1998);
        a1.getAtributos();
        System.out.println("Consultor");
        Consultor c1 = new Consultor("11112187K", "Dani", "Peneto", "Ciudad Jardin", "29011", "Málaga", pT1, "Nivel 3");
        c1.getAtributos();
    }
}
