package PruebaA2;

public class MovieTicket extends Ticket {
    public MovieTicket(String ticketNumber, double basePrice) {
        super(ticketNumber, basePrice);}


    @Override
    public double calculatePrice() {
        return getBasePrice() + 3; // ESTE ES EL IMPUESTO DE 3 EUROS
    }

    public double calculatePrice(boolean isPeakTime) {
        double price = calculatePrice();
        if (isPeakTime) {
        }return price += 2;     //ESTE ES EL IMPUESTO DE DOS EUROS
    }
}
