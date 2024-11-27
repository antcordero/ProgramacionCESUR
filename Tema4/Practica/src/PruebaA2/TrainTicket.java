package PruebaA2;

public class TrainTicket extends Ticket {
    public TrainTicket(String ticketNumber, double basePrice) {
        super(ticketNumber, basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + 10; // ESTE ES EL IMPUESTO DE 10 EUROS
    }

    public double calculatePrice(boolean isPeakTime) {
        double price = calculatePrice();
        if (isPeakTime) {
            price += 5; //ESTE ES EL IMPUESTO DE 5 EUROS
        }
        return price;
    }

    @Override
    public String toString() {
        return "TrainTicket{" + super.toString() + "}";
    }
}
