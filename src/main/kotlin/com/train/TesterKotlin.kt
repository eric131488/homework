package com.train

fun main(args: Array<String>) {
    var numberOfTicket = 0

    while (numberOfTicket != -1) {
        print("Please enter number of tickets: ")
        numberOfTicket = readLine()!!.toInt()

        if (numberOfTicket != -1) {
            print("How many round-trip tickets: ")
            val numberOfRoundTripTicket = readLine()!!.toInt()
            val ticket = TicketKotlin(numberOfTicket, numberOfRoundTripTicket)
            ticket.print()
        }
    }
}