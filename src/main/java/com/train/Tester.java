package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTicket = 0;

        while (numberOfTicket != -1) {
            System.out.println("Please enter number of tickets:");
            numberOfTicket = scanner.nextInt();

            if (numberOfTicket != -1) {
                System.out.println("Please enter number of round-trip tickets:");
                int numberOfRoundTripTicket = scanner.nextInt();
                Ticket ticket = new Ticket(numberOfTicket, numberOfRoundTripTicket);
                ticket.print();
            }
        }
    }
}
