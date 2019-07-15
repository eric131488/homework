package com.train

class TicketKotlin(val numberOfTicket: Int, val numberOfRoundTripTicket: Int) {
    fun print() {
        val ticketPrice = (numberOfTicket -  numberOfRoundTripTicket) * 1000
        val roundTripTicketPrice = numberOfRoundTripTicket * (2000 * 0.9)
        val totalPrice = ticketPrice + roundTripTicketPrice.toInt()

        println("Total tickets: " + numberOfTicket + "\n" +
                "Round-trip: " + numberOfRoundTripTicket + "\n" +
                "Total: " + totalPrice)
    }
}