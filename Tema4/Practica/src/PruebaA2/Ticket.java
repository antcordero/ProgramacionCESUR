package PruebaA2;

public class Ticket {
    private String ticketNumber;
    private double basePrice;

    //CONSTRUCTOR
    public Ticket(String ticketNumber, double basePrice) {
        this.ticketNumber = ticketNumber;
        this.basePrice = basePrice;
    }

    //GETTER Y SETTER
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double calculatePrice() {
        return basePrice; // Precio base por defecto
    }

    //MÉTODO TO STRING
    @Override
    public String toString() {
        return "Ticket{" + "ticketNumber='" + ticketNumber + '\'' + ", basePrice=" + basePrice + '}';
    }
}
