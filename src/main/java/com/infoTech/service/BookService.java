package com.infoTech.service;

import com.infoTech.Ticket.Ticket;
import com.infoTech.passenger.Passenger;

public interface BookService {
	
	public Ticket ticketBooking(Passenger passenger);
	public Ticket getTicket(Integer TicketNo);
}
