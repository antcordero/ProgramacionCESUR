package Ejercicio3;

public class Test {
    public static void main(String[] args) {
        // Crear instancias
        Vehiculo vehiculo = new Vehiculo("Genérico", 50);
        Coche coche = new Coche("Toyota", 120);
        Bicicleta bicicleta = new Bicicleta("BMX", 15);
        // Mostrar información de cada vehículo
        System.out.println(vehiculo);
        System.out.println(coche);
        System.out.println(bicicleta);
        // Llamar a los métodos mover
        vehiculo.mover();
        vehiculo.mover(100);
        vehiculo.mover(50, "montañoso");
        coche.mover();
        coche.mover(200);
        coche.mover(120, "carretera");
        bicicleta.mover();
        bicicleta.mover(10);
        bicicleta.mover(5, "terreno llano");
    }
}
