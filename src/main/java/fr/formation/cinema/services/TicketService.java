package fr.formation.cinema.services;

import java.util.List;

import fr.formation.cinema.models.Ticket;

public interface TicketService {
	
	public List<Ticket> findAll();
	public Ticket findById(String id);
	public Ticket save(Ticket ticket);

}
