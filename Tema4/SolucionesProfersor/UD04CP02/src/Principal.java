public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepito","Grillo","987654321");
        Persona p2 = new Persona("Juanita","Campanilla","21");
        Cuenta c1 = new Cuenta("632764382987",1235.85,p1);
        Cuenta c2 = new Cuenta("267677623464",2350.55,p2);
        System.out.println(c1);
        System.out.println(c2);
        c1.transaccion(1500,"reintegro");
        c2.transaccion(350,"reintegro");
        System.out.println(c1);
        System.out.println(c2);
        c1.transaccion(500,"ingreso");
        c2.transaccion(1500,"ingreso");
        System.out.println(c1);
        System.out.println(c2);
    }
}
