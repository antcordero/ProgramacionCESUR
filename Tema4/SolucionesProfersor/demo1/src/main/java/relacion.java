 // Superclase Car
class Car {
    int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}

// Subclase Truck
class Truck extends Car {
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; // 10% discount
        } else {
            return regularPrice * 0.8; // 20% discount
        }
    }
}

// Subclase Ford
class Ford extends Car {
    int year;
    int manufactureDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    @Override
    double getSalePrice() {
        return super.getSalePrice() - manufactureDiscount;
    }
}

// Subclase Sedan
class Sedan extends Car {
    int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95; // 5% discount
        } else {
            return regularPrice * 0.9; // 10% discount
        }
    }
}

// Clase principal Relacion
 public class  relacion {
    public static void main(String[] args) {
        // Crear un objeto de la clase Sedan
        Sedan sedan = new Sedan(150, 20000, "Rojo", 25);
        System.out.println("Precio de venta del Sedan: " + sedan.getSalePrice());

        // Crear dos objetos de la clase Ford
        Ford ford1 = new Ford(180, 30000, "Azul", 2020, 2000);
        Ford ford2 = new Ford(200, 35000, "Negro", 2022, 3000);
        System.out.println("Precio de venta del Ford 1: " + ford1.getSalePrice());
        System.out.println("Precio de venta del Ford 2: " + ford2.getSalePrice());

        // Crear un objeto de la clase Truck
        Truck truck = new Truck(120, 40000, "Blanco", 2500);
        System.out.println("Precio de venta del Truck: " + truck.getSalePrice());
    }
}
