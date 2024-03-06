package com.infoTech.bookImp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.infoTech.Ticket.Ticket;
import com.infoTech.passenger.Passenger;
import com.infoTech.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	Map<Integer,Ticket> dataMap=new HashMap<>();
	private Integer TicketNo=1;
	
	@Override
	public Ticket ticketBooking(Passenger passenger) {
		Ticket t=new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketNo(TicketNo);
		t.setTicketPrice(1500.00);
		t.setTicketStatus("CONFIRMED");
		dataMap.put(TicketNo, t);
		
		TicketNo++;
		
		return t;
	}
	
	@Override
	public Ticket getTicket(Integer TicketNo) {
		if(dataMap.containsKey(TicketNo)) {
			return dataMap.get(TicketNo);
		}
		return null;
	}

}
