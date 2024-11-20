package prueba;

public class Test3 {
    public static void main(String[] args) {
        Coche c1 = new Coche();
        c1.setModelo("Renault");

        Coche c2 = new Coche("Ford","azul",true,"1234PHR",2025,true);
        System.out.println(c1.getModelo());
        System.out.println(c2.getModelo());
        System.out.println(c2.getColor());
        c2.imprimeCoche();
    }
}
