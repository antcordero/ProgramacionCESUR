package PruebaA2;

public class Test {
    public static void main(String[] args) {
        TrainTicket trainTicket=new TrainTicket("T123", 100);
        FlightTicket flightTicket = new FlightTicket("F456", 200);
        MovieTicket movieTicket=new MovieTicket("M789", 15);
        boolean isPeakTime = true;
        double total = 0;
        double trainPrice = trainTicket.calculatePrice(isPeakTime);
        System.out.println("Ticket " + trainTicket.getTicketNumber() + " - Precio: " + trainPrice);
        total+=trainPrice;
        double flightPrice = flightTicket.calculatePrice(isPeakTime);
        System.out.println("Ticket " + flightTicket.getTicketNumber() + " - Precio: " + flightPrice);
        total+=flightPrice;
        double moviePrice = movieTicket.calculatePrice(isPeakTime);
        System.out.println("Ticket " + movieTicket.getTicketNumber() + " - Precio: " + moviePrice);
        total+=moviePrice;
        System.out.println("Total de boletos: " + total);
    }
}
