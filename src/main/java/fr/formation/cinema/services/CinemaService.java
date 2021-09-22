package fr.formation.cinema.services;

import java.util.List;

import fr.formation.cinema.models.Cinema;

public interface CinemaService {

	public List<Cinema> findAll();
	
	public Cinema save(Cinema cinema);

}
