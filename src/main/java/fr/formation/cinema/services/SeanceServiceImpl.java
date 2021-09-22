package fr.formation.cinema.services;

import java.util.List;
import fr.formation.cinema.models.Seance;
import fr.formation.cinema.repositories.SeanceRepository;

public class SeanceServiceImpl implements SeanceService {

	private SeanceRepository seanceRepository;

	public SeanceServiceImpl(SeanceRepository seanceRepository) {
		this.seanceRepository = seanceRepository;
	}

	@Override
	public List<Seance> findAll() {
		return seanceRepository.findAll();
	}

	@Override
	public Seance save(Seance seance) {
		return seanceRepository.save(seance);
	}

	@Override
	public void deleteById(String id) {
		seanceRepository.deleteById(id);
		
	}

	@Override
	public Seance patch(Seance seance) {
		Seance s = seanceRepository.findById(seance.getId()).orElseThrow();
		if(seance.getDate()!=null)
			s.setDate(seance.getDate());
		if(seance.getFilm().getId()!=null)
			s.setFilm(seance.getFilm());
		if(seance.getSalle().getId()!=null)
			s.setSalle(seance.getSalle());
		return seanceRepository.save(s);
	}
	
	
}
