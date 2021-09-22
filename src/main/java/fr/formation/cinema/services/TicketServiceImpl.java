package fr.formation.cinema.services;

import java.util.List;

import fr.formation.cinema.models.Ticket;
import fr.formation.cinema.repositories.TicketRepository;

public class TicketServiceImpl implements TicketService {
	
	private TicketRepository ticketRepository;

	public TicketServiceImpl(TicketRepository ticketRepository) {
		this.ticketRepository = ticketRepository;
	}

	@Override
	public List<Ticket> findAll() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket findById(String id) {
		return ticketRepository.findById(id).orElseThrow();
	}

	@Override
	public Ticket save(Ticket ticket) {
		return ticketRepository.save(ticket);
	}
	
	

}
