package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter number of tickets:");
        Scanner scanner = new Scanner(System.in);
        int numberOfTicket = scanner.nextInt();
        System.out.println("Please enter number of round-trip tickets:");
        int numberOfRoundTripTicket = scanner.nextInt();
        Ticket ticket = new Ticket(numberOfTicket, numberOfRoundTripTicket);
        ticket.print();
    }
}
