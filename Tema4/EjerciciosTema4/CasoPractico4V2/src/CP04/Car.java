package CP04;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    //Constructor
    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    //Getters & Setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Método toString de la clase padre para que la hereden las clases hijas


    @Override
    public String toString() {
        return "Car: " +
                "Speed = " + speed +
                ", Price = " + regularPrice +
                ", Color = " + color + '\'';
    }

    //Métodos (de aquí cogerán el precio el resto de clases el precio,
    // no deben coger el regularPrice, sino el método que devuelve ese precio
    public double getSalePrice() {
        return this.regularPrice;
    }
}
