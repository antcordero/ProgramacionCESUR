public class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+" Truck{" +
                "weight=" + weight +
                '}';
    }

    public double getSalePrice(){
        double resultado;
        if (weight>2000)
            resultado = super.getSalePrice()*0.9;
        else
            resultado = super.getSalePrice()*0.8;
        return resultado;
    }
}
