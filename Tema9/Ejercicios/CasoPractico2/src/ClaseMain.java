import java.sql.SQLOutput;

public class ClaseMain {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 2 - Tema 9\n");

        //Crear objetos
        Smartphone miSmartphone = new Smartphone("iphone15", "Apple", true);
        SmartTV miTele = new SmartTV("LG-1234", "LG", false);

        //Aciones específicas
        miSmartphone.hacerLlamada("+34 621 37 38 45");
        miTele.reproducirVideo("NewCastle VS Arsenal temporada 2007/2008");

        //Mostrar info
        System.out.println("\nInfo del dispositivo: ");
        miSmartphone.mostrarInfo();

    }
}
