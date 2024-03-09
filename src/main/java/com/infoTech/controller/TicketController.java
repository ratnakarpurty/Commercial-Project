package com.infoTech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infoTech.Ticket.Ticket;
import com.infoTech.passenger.Passenger;
import com.infoTech.service.BookService;

@RestController
public class TicketController {
	
	@Autowired
	private BookService service;
	
	@PostMapping(
			value="/ticket",
			consumes={"applicaton/json"},
			produces={"applicaton/json"}
	)
	public ResponseEntity<Ticket> saveTicketData(@RequestBody Passenger passenger){
		System.out.println(passenger);
		System.out.println("New Code Added");
		System.out.println("New Code changed...");
		System.out.println("Instruction Added...");
		
		Ticket ticketBooking = service.ticketBooking(passenger);
		return new ResponseEntity<>(ticketBooking,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/event/{ticketNo}",
			    produces="applicaton/json"
	)
	public Ticket getTicketNo(@PathVariable Integer ticketNo) {
		return service.getTicket(ticketNo);
	}
}
