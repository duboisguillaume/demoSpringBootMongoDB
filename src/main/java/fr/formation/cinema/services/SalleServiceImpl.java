package fr.formation.cinema.services;

import java.util.List;

import fr.formation.cinema.models.Salle;
import fr.formation.cinema.repositories.SalleRepository;

public class SalleServiceImpl implements SalleService {

	private SalleRepository salleRepository;

	public SalleServiceImpl(SalleRepository salleRepository) {
		this.salleRepository = salleRepository;
	}

	@Override
	public List<Salle> findAll() {
		return salleRepository.findAll();
	}

	@Override
	public Salle save(Salle salle) {
		return salleRepository.save(salle);
	}

	@Override
	public Salle patch(Salle salle) {
		Salle s = salleRepository.findById(salle.getId()).orElseThrow();
		if(salle.getNumero()!=null)
			s.setNumero(salle.getNumero());
		if(salle.getNbPlaces()!=null)
			s.setNbPlaces(salle.getNbPlaces());
		if(salle.getCinema()!=null)
			s.setCinema(salle.getCinema());
		return salleRepository.save(s);
	}
	
	
}
