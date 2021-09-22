package fr.formation.cinema.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.cinema.models.Ticket;
import fr.formation.cinema.services.TicketService;

@RestController
@RequestMapping("tickets")
public class TicketController {

	private TicketService ticketService;

	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	@GetMapping
	public List<Ticket> findAll(){
		return ticketService.findAll();
	}
	
	@PostMapping
	public Ticket save(@RequestBody Ticket ticket) {
		return ticketService.save(ticket);
	}
	
	
	
	
}
