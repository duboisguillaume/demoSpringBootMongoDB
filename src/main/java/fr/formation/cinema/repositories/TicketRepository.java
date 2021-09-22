package fr.formation.cinema.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.formation.cinema.models.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String>{

}
