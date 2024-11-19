package CP04;

public class Truck extends Car{
    private int weight;

    //Constructor
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    //Getters & Setters
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Métodos
    @Override
    public double getSalePrice() {
        double price = super.getRegularPrice();
        if (this.weight>2000) {
            price=price*0.90;
        } else {
            price=price*0.80;
        }
        return price;
    }
}
