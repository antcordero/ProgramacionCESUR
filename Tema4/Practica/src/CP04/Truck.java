package CP04;

public class Truck extends Car {

    private int weight;

    //Constructor
    public Truck(int speed, double regularPrice, String color, int wieght) {
        super(speed, regularPrice, color);
        this.weight = wieght;
    }

    //Getters - Setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //toString
    @Override
    public String toString() {
        return "Truck{" +
                "wieght=" + weight +
                '}';
    }

    //Metodo
    @Override
    public double getSalePrice() {
        double precio = 0;
        if (this.weight>2000) {
            precio = getRegularPrice()*0.90;
        } else {
            precio = getRegularPrice()*0.80;
        }
        return precio;
    }
}
