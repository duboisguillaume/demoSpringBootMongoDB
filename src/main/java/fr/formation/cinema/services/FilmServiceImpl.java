package fr.formation.cinema.services;

import java.util.List;

import fr.formation.cinema.models.Film;
import fr.formation.cinema.repositories.FilmRepository;

public class FilmServiceImpl implements FilmService {
	
	private FilmRepository filmRepository;

	public FilmServiceImpl(FilmRepository filmRepository) {
		this.filmRepository = filmRepository;
	}

	@Override
	public List<Film> findAll() {
		return filmRepository.findAll();
	}

	@Override
	public Film save(Film film) {
		return filmRepository.save(film);
	}

	@Override
	public void deleteById(String id) {
		filmRepository.deleteById(id);
	}

	@Override
	public Film patch(Film film) {
		Film f = filmRepository.findById(film.getId()).orElseThrow();
		if(film.getNom()!=null)
			f.setNom(film.getNom());
		if(film.getDuree()!=null)
			f.setDuree(film.getDuree());
		return filmRepository.save(f);
	}
	
	

}
