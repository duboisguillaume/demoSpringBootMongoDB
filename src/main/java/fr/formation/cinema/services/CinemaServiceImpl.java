package fr.formation.cinema.services;

import java.util.List;

import fr.formation.cinema.models.Cinema;
import fr.formation.cinema.repositories.CinemaRepository;

public class CinemaServiceImpl implements CinemaService {

	private CinemaRepository cinemaRepository;

	public CinemaServiceImpl(CinemaRepository cinemaRepository) {
		this.cinemaRepository = cinemaRepository;
	}

	@Override
	public List<Cinema> findAll() {
		return cinemaRepository.findAll();
	}

	@Override
	public Cinema save(Cinema cinema) {
		return cinemaRepository.save(cinema);
	}
	
	
}
