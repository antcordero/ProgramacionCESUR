public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString()+" Sedan{" +
                "length=" + length +
                '}';
    }

    public double getSalePrice(){
        double resultado;
        if (length > 20){
            resultado = super.getSalePrice()*0.95;
        } else{
            resultado = super.getSalePrice()*0.9;
        }
        return resultado;
    }

}
