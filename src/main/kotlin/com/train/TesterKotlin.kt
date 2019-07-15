package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    val numberOfTicket = scanner.nextInt()
    print("How many round-trip tickets: ")
    val numberOfRoundTripTicket = scanner.nextInt()
    val ticket = TicketKotlin(numberOfTicket,numberOfRoundTripTicket)
    ticket.print()
}