package fr.formation.cinema.services;

import java.util.List;

import fr.formation.cinema.models.Salle;

public interface SalleService {

	public List<Salle> findAll();

	public Salle save(Salle salle);
	
	public Salle patch(Salle salle);

}
