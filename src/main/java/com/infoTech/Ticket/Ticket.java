package com.infoTech.Ticket;

import lombok.Data;

@Data
public class Ticket {
	
	private String name;
	private String to;
	private String from;
	private String doj;
	private String trainname;
	private Integer TicketNo; 
	private Double TicketPrice;
	private String TicketStatus;
	
}
