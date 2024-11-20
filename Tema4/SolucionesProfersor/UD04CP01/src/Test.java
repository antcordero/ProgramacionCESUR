public class Test {
    public static void main(String[] args) {
        SerVivo x = new SerVivo((byte)3);
        SerVivo y = new SerVivo((byte)5);
        System.out.println(x.mayor(y));

        x = new Humano((byte)34,"Homero");
        y = new Humano((byte)9,"Bart");

        System.out.println(((Humano)x).mayor((Humano)y));

        if (((Humano)x).mayor((Humano)y).equals(x))
            System.out.println(("El menor es: "+y));
        else
            System.out.println(("El menor es: "+x));
    }
}
