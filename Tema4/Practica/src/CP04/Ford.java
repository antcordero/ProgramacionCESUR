package CP04;

public class Ford extends Car{

    private int year;
    private int manufacturerDiscount;

    //Constructor
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    //Getters - Setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }

    //toString
    @Override
    public String toString() {
        return "Ford{" +
                "year=" + year +
                ", manufacturerDiscount=" + manufacturerDiscount +
                '}';
    }

    //Métodos
    @Override
    public double getSalePrice() {
        double precio;
        precio = getRegularPrice() - this.manufacturerDiscount;
        return precio;
    }
}
