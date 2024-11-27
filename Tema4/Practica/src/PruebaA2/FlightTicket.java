package PruebaA2;

public class FlightTicket extends Ticket {
    public FlightTicket(String ticketNumber, double basePrice) {
        super(ticketNumber, basePrice);
    }

    @Override
    public double calculatePrice () {
        return getBasePrice() + 50; // ESTE ES EL IMPUESTO DE 50 EUROS
    }

    public double calculatePrice(boolean isPeakTime) {
        double price = calculatePrice();
        if (isPeakTime) {
        }return price += 100;   //ESTE ES EL IMPUESTO DE 100 EUROS
    }
}
