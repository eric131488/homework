package com.train;

public class Ticket {
    int numberOfTicket;
    int numberOfToundTripTick;

    public Ticket(int numberOfTicket, int numberOfToundTripTicket) {
        this.numberOfTicket = numberOfTicket;
        this.numberOfToundTripTick = numberOfToundTripTicket;
    }

    public void print() {
        int ticketPrice = (numberOfTicket - numberOfToundTripTick) * 1000;
        int roundTripTicketPrice = numberOfToundTripTick * (int)(2000 * 0.9);
        int totalPrice = ticketPrice + roundTripTicketPrice;

        System.out.println("Total tickets: " + numberOfTicket + "\n" +
                "Round-trip: " + numberOfToundTripTick + "\n" +
                "Total: " + totalPrice);

    }
}
