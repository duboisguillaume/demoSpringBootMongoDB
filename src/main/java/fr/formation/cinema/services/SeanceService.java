package fr.formation.cinema.services;

import java.util.List;

import fr.formation.cinema.models.Seance;

public interface SeanceService {

	public List<Seance> findAll();

	public Seance save(Seance seance);

	public void deleteById(String id);

	public Seance patch(Seance seance);
}
