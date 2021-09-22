package fr.formation.cinema;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.formation.cinema.repositories.CinemaRepository;
import fr.formation.cinema.repositories.FilmRepository;
import fr.formation.cinema.repositories.SalleRepository;
import fr.formation.cinema.repositories.SeanceRepository;
import fr.formation.cinema.repositories.TicketRepository;
import fr.formation.cinema.services.CinemaService;
import fr.formation.cinema.services.CinemaServiceImpl;
import fr.formation.cinema.services.FilmService;
import fr.formation.cinema.services.FilmServiceImpl;
import fr.formation.cinema.services.SalleService;
import fr.formation.cinema.services.SalleServiceImpl;
import fr.formation.cinema.services.SeanceService;
import fr.formation.cinema.services.SeanceServiceImpl;
import fr.formation.cinema.services.TicketService;
import fr.formation.cinema.services.TicketServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	public FilmService filmService(FilmRepository filmRepository) {
		return new FilmServiceImpl(filmRepository);
	}
	
	@Bean
	public SalleService salleService(SalleRepository salleRepository) {
		return new SalleServiceImpl(salleRepository);
	}
	
	@Bean 
	public SeanceService seanceService(SeanceRepository seanceRepository) {
		return new SeanceServiceImpl(seanceRepository);
	}
	
	@Bean
	public CinemaService cinemaService(CinemaRepository cinemaRepository) {
		return new CinemaServiceImpl(cinemaRepository);
	}
	
	@Bean
	public TicketService ticketService(TicketRepository ticketRepository) {
		return new TicketServiceImpl(ticketRepository);
	}
}
