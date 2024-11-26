package CP04;

public class Sedan extends Car{

    private int lenght;

    //Constructor
    public Sedan(int speed, double regularPrice, String color, int lenght) {
        super(speed, regularPrice, color);
        this.lenght = lenght;
    }

    //Getters - Setters
    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    //toString
    @Override
    public String toString() {
        return "Sedan{" +
                "lenght=" + lenght +
                '}';
    }

    //Métodos
    @Override
    public double getRegularPrice() {
        double precio;
        if (this.lenght > 20) {
            precio = getSalePrice() * 0.5;
        } else {
            precio = getSalePrice();
        }
        return precio;
    }
}
