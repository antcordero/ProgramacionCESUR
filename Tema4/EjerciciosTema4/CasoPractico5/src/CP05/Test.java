package CP05;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 5\n===============\n");

        //Instancias de los objetos
        //PuestoTrabajo
        PuestoTrabajo puesto1 = new PuestoTrabajo("#A1", "nada", 35000);
        PuestoTrabajo puesto2 = new PuestoTrabajo("#A2", "algo", 25000);
        //Empleado
        Empleado e1 = new Empleado("1324678A", "Antonio", "Cordero Molina","Calle Ejemplo", "29130", "Alhaurín de la Torre", puesto1);
        //Administrativo
        Administrativo a1 = new Administrativo("1324678B", "Antonio", "Cordero","Calle Ejemplo", "29130", "Alhaurín de la Torre", puesto1, 5);
        //Consultor
        Consultor c1 = new Consultor("1324678C", "Antonio", "Molina","Calle Ejemplo", "29130", "Alhaurín de la Torre", puesto2, "cat2");

        //Mostrar solo la Descripción + atributos de ese puesto concreto
        System.out.print("Administrativo: ");
        a1.getAtributos();
        System.out.print("Consultor: ");
        c1.getAtributos();
    }
}
