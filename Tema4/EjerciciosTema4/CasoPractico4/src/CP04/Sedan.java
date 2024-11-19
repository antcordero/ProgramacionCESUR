package CP04;

public class Sedan extends Car{
    private int lenght;

    //Constructor
    public Sedan(int speed, double regularPrice, String color, int lenght) {
        super(speed, regularPrice, color);
        this.lenght = lenght;
    }

    //Getters & Setters
    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    //Métodos
    public double getSalePrice() {
        double price = super.getRegularPrice();
        if (this.lenght>20) {
            price=price*0.95;
        } else {
            price=price*0.80;
        }
        return price;
    }
}
