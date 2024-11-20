package prueba;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Animal("Toby",10);
        Animal a2 = new Animal("Pepito",4);
        a1.info();
        a1.setNombre("Juanito");
        System.out.println(a1.getNombre());
        Animal a3 = new Animal();
        a3.setNombre("Coco");
        a3.setEdad(1);
        a3.info();
        Mamifero m1 = new Mamifero();
    }
}
