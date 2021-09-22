package fr.formation.cinema.services;

import java.util.List;

import fr.formation.cinema.models.Film;

public interface FilmService {
	
	public List<Film> findAll();

	public Film save(Film film);

	public void deleteById(String id);

	public Film patch(Film film);

}
